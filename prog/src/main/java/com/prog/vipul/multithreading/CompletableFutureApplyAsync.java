package com.prog.vipul.multithreading;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class CompletableFutureApplyAsync {

	static ExecutorService executor = Executors.newFixedThreadPool(3, new ThreadFactory() {
		int count = 1;

		@Override
		public Thread newThread(Runnable runnable) {
			return new Thread(runnable, "custom-executor-" + count++);
		}
	});

	static void thenApplyAsyncWithExecutorExample() throws InterruptedException, ExecutionException {
		CompletableFuture<String> cf = CompletableFuture.completedFuture("message").thenApplyAsync(s -> {
			assertTrue(Thread.currentThread().getName().startsWith("custom-executor-"));
			assertFalse(Thread.currentThread().isDaemon());
			return s.toUpperCase();
		}, executor);
		assertNull(cf.getNow(null));
		assertEquals("MESSAGE", cf.join());
		System.out.println(cf.get());
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		thenApplyAsyncWithExecutorExample();
	}
}
