package com.prog.vipul.multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.function.IntToDoubleFunction;

public class FutureExampleWithCompletableFutureWithChaining {

	static class Recursive<I> {
		public I func;
	}

	static Function<Integer, Double> factorial = x -> {
		Recursive<IntToDoubleFunction> recursive = new Recursive<IntToDoubleFunction>();
		recursive.func = n -> (n == 0) ? 1 : n * recursive.func.applyAsDouble(n - 1);

		return recursive.func.applyAsDouble(x);
	};

	static Function<Double, Double> square = x -> {
        return x * x;
    };
    
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		System.out.println(Thread.currentThread().getName() + " thread enters main method"); // 1

		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(1);

		final int nthFactorial = 5;

        // 1 CompletableFuture stage for calculating factorial
		CompletableFuture<Double> result = CompletableFuture.supplyAsync(() -> {
			System.out.println(Thread.currentThread().getName() + " factorial task is called"); // 2
			Double factorialResult = factorial.apply(nthFactorial);
			return factorialResult;
		}, newFixedThreadPool);

		System.out.println("isDone = " + result.isDone());
		System.out.println("isCancelled = " + result.isCancelled());

        // 2 creates another CompletableFuture.
		result.thenAcceptAsync(t -> System.out.println("result of factorial is::" + t));

        // 3 creates another CompletableFuture for squaring .
		CompletableFuture<Double> squareCalcStage = result.thenApplyAsync(r -> {
			System.out.println(Thread.currentThread().getName() + " square task is called");
			Double squareResult = square.apply(r);

			return squareResult;
		}, newFixedThreadPool);

		 // 4 creates another CompletableFuture.
        CompletableFuture<Void> lastStage = squareCalcStage.thenAcceptAsync(t -> System.out
                .println(Thread.currentThread().getName() + " The result after square: " + t));

        lastStage.join(); //waits for the lastStage to complete

		newFixedThreadPool.shutdown();
	}
}
