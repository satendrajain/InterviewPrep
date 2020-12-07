package com.prog.vipul.multithreading;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureCombine {

	public static void main(String[] args) {
		thenCombineExample();
		thenCombineAsyncExample();
	}

	static void thenCombineExample() {
		String original = "Message";
		CompletableFuture<String> cf = CompletableFuture.completedFuture(original).thenApply(s -> s.toUpperCase())
				.thenCombine(CompletableFuture.completedFuture(original).thenApply(s -> s.toUpperCase()),
						(s1, s2) -> s1 + s2);
		assertEquals("MESSAGEmessage", cf.getNow(null));
	}

	static void thenCombineAsyncExample() {
		String original = "Message";
		CompletableFuture<String> cf = CompletableFuture.completedFuture(original).thenApplyAsync(s -> s.toUpperCase())
				.thenCombine(CompletableFuture.completedFuture(original).thenApplyAsync(s -> s.toUpperCase()),
						(s1, s2) -> s1 + s2);
		assertEquals("MESSAGEmessage", cf.join());
	}
}
