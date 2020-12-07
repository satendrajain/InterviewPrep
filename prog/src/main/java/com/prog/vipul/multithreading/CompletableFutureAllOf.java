package com.prog.vipul.multithreading;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureAllOf {

	
	static void allOfExample() {
	    StringBuilder result = new StringBuilder();
	    List<String> messages = Arrays.asList("a", "b", "c");
	    List<CompletableFuture<String>> futures = messages.stream()
	            .map(msg -> CompletableFuture.completedFuture(msg).thenApply(s -> s.toUpperCase()))
	            .collect(Collectors.toList());
	    
	    CompletableFuture.allOf(futures.toArray(new CompletableFuture[futures.size()])).whenComplete((v, th) -> {
	        futures.forEach(cf -> assertTrue(isUpperCase(cf.getNow(null))));
	        result.append("done");
	    });
	    assertTrue("Result was empty", result.length() > 0);
	}

	
	static void allOfAsyncExample() {
	    StringBuilder result = new StringBuilder();
	    List<String> messages = Arrays.asList("a", "b", "c");
	    List<CompletableFuture<String>> futures = messages.stream()
	            .map(msg -> CompletableFuture.completedFuture(msg).thenApplyAsync(s -> s.toUpperCase()))
	            .collect(Collectors.toList());
	    CompletableFuture<Void> allOf = CompletableFuture.allOf(futures.toArray(new CompletableFuture[futures.size()]))
	            .whenComplete((v, th) -> {
	                futures.forEach(cf -> assertTrue(isUpperCase(cf.getNow(null))));
	                result.append("done");
	            });
	    allOf.join();
	    assertTrue("Result was empty", result.length() > 0);
	}
	
	private static Object isUpperCase(String now) {
		return now.toUpperCase();
	}
}
