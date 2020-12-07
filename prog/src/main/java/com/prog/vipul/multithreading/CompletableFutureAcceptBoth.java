package com.prog.vipul.multithreading;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureAcceptBoth {

	public static void main(String[] args) {
		thenAcceptBothExample();
	}

	static void thenAcceptBothExample() {
		String original = "Message";
		StringBuilder result = new StringBuilder();
		CompletableFuture.completedFuture(original).thenApply(String::toUpperCase).thenAcceptBoth(
				CompletableFuture.completedFuture(original).thenApply(String::toLowerCase),
				(s1, s2) -> result.append(s1 + s2));
		assertEquals("MESSAGEmessage", result.toString());
	}
}
