package com.prog.vipul.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureRealExample {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();

        cars().thenCompose(cars -> {
            List<CompletionStage<Car>> updatedCars = cars.stream()
                    .map(car -> rating(car.manufacturerId).thenApply(r -> {
                        car.setRating(r);
                        return car;
                    })).collect(Collectors.toList());

            CompletableFuture<Void> done = CompletableFuture
                    .allOf(updatedCars.toArray(new CompletableFuture[updatedCars.size()]));
            return done.thenApply(v -> updatedCars.stream().map(CompletionStage::toCompletableFuture)
                    .map(CompletableFuture::join).collect(Collectors.toList()));
        }).whenComplete((cars, th) -> {
            if (th == null) {
                cars.forEach(System.out::println);
            } else {
                throw new RuntimeException(th);
            }
        }).toCompletableFuture().join();

        long end = System.currentTimeMillis();

        System.out.println("Took " + (end - start) + " ms.");
		
	}
	
    static CompletionStage<Float> rating(int manufacturer) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                simulateDelay();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
            switch (manufacturer) {
            case 2:
                return 4f;
            case 3:
                return 4.1f;
            case 7:
                return 4.2f;
            default:
                return 5f;
            }
        }).exceptionally(th -> -1f);
    }

    static CompletionStage<List<Car>> cars() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(1, 3, "Fiesta", 2017));
        carList.add(new Car(2, 7, "Camry", 2014));
        carList.add(new Car(3, 2, "M2", 2008));
        return CompletableFuture.supplyAsync(() -> carList);
    }

    private static void simulateDelay() throws InterruptedException {
        Thread.sleep(5000);
    }
}

class Car {
	int id;
	int manufacturerId;
	String model;
	int year;
	float rating;

	public Car(int id, int manufacturerId, String model, int year) {
		this.id = id;
		this.manufacturerId = manufacturerId;
		this.model = model;
		this.year = year;
	}

	void setRating(float rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Car (id=" + id + ", manufacturerId=" + manufacturerId + ", model=" + model + ", year=" + year
				+ ", rating=" + rating;
	}
}