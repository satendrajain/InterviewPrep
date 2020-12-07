package com.prog.vipul.multithreading;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureCancel {

	public static void main(String[] args) {
		cancelExample();
	}

	static void cancelExample() {
		CompletableFuture<String> cf = CompletableFuture.completedFuture("message").thenApplyAsync(String::toUpperCase);
		
		CompletableFuture<String> cf2 = cf.exceptionally(throwable -> "canceled message");
		
		assertTrue("Was not canceled", cf.cancel(true));
		assertTrue("Was not completed exceptionally", cf.isCompletedExceptionally());
		assertEquals("canceled message", cf2.join());
	}
}
