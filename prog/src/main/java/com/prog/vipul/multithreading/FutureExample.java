package com.prog.vipul.multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.function.Function;
import java.util.function.IntToDoubleFunction;

public class FutureExample {

	static class Recursive<I> {
		public I func;
	}

	static Function<Integer, Double> factorial = x -> {
		Recursive<IntToDoubleFunction> recursive = new Recursive<IntToDoubleFunction>();
		recursive.func = n -> (n == 0) ? 1 : n * recursive.func.applyAsDouble(n - 1);

		return recursive.func.applyAsDouble(x);
	};

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		System.out.println(Thread.currentThread().getName() + " thread enters main method"); // 1

		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(1);

		final int nthFactorial = 25;

		Future<Double> result = newFixedThreadPool.submit(() -> {
			System.out.println(Thread.currentThread().getName() + " factorial task is called"); // 2
			Double factorialResult = factorial.apply(nthFactorial);
			return factorialResult;
		});

		System.out.println("isDone = " + result.isDone());
		System.out.println("isCancelled = " + result.isCancelled());

		// result.cancel(true); //You may cancel it conditionally

		//The main thread gets blocked when it reaches the “get()” method call on the Future object “result” at line 42
		Double res = result.get(); // 3 blocked until result is returned

		System.out.println(Thread.currentThread().getName() + " result is " + res); // 4

		newFixedThreadPool.shutdown();
	}
}

