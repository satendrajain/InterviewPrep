package com.prog.vipul.multithreading;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureRunAfterBoth {

	public static void main(String[] args) {
		runAfterBothExample();
	}

	static void runAfterBothExample() {
		String original = "Message";
		StringBuilder result = new StringBuilder();
		CompletableFuture.completedFuture(original).thenApply(String::toUpperCase)
		.runAfterBoth(
				CompletableFuture.completedFuture(original).thenApply(String::toLowerCase),
				() -> result.append("done"));
		
		assertTrue("Result was empty", result.length() > 0);
	}
}
