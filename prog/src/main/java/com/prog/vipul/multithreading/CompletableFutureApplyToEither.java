package com.prog.vipul.multithreading;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureApplyToEither {

	public static void main(String[] args) {

		applyToEitherExample();
	}

	static void applyToEitherExample() {
		String original = "Message";
		CompletableFuture<String> cf1 = CompletableFuture.completedFuture(original)
				.thenApplyAsync(s -> s.toUpperCase());
		
		CompletableFuture<String> cf2 = cf1.applyToEither(
				CompletableFuture.completedFuture(original).thenApplyAsync(s -> s.toUpperCase()),
				s -> s + " from applyToEither");
		assertTrue(cf2.join().endsWith(" from applyToEither"));
	}

}
