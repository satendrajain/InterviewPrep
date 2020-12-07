package com.prog.vipul.multithreading;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturethenAccept {

	static void thenAcceptExample() {
		StringBuilder result = new StringBuilder();
		result.append("Hii ");
		
		CompletableFuture
		.completedFuture("thenAccept message")
		.thenAccept(s -> result.append(s));
		
		assertTrue("Result was empty", result.length() > 0);
		System.out.println(result);
	}

	public static void main(String[] args) {
		thenAcceptExample();
	}
}
