package com.prog.vipul.multithreading;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureCompose {

	public static void main(String[] args) {
		thenComposeExample();
	}

	static void thenComposeExample() {
		String original = "Message";
		CompletableFuture<String> cf = CompletableFuture.completedFuture(original).thenApply(s -> s.toUpperCase())
				.thenCompose(upper -> CompletableFuture.completedFuture(original).thenApply(s -> s.toUpperCase())
						.thenApply(s -> upper + s));
		assertEquals("MESSAGEmessage", cf.join());
	}
}
