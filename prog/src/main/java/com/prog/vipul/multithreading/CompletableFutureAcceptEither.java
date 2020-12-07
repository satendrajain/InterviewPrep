package com.prog.vipul.multithreading;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureAcceptEither {

	public static void main(String[] args) {
		acceptEitherExample();
	}

	static void acceptEitherExample() {
		String original = "Message";
		StringBuffer result = new StringBuffer();
		CompletableFuture<Void> cf = CompletableFuture.completedFuture(original).thenApplyAsync(s -> s.toUpperCase())
				.acceptEither(CompletableFuture.completedFuture(original).thenApplyAsync(s -> s.toUpperCase()),
						s -> result.append(s).append("acceptEither"));
		cf.join();
		assertTrue("Result was empty", result.toString().endsWith("acceptEither"));
	}
}
