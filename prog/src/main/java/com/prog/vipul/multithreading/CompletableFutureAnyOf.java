package com.prog.vipul.multithreading;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureAnyOf {

	public static void main(String[] args) {
		anyOfExample();
	}
	
	static void anyOfExample() {
	    StringBuilder result = new StringBuilder();
	    List<String> messages = Arrays.asList("a", "b", "c");
	    
	    List<CompletableFuture<String>> futures = messages.stream()
	            .map(msg -> CompletableFuture.completedFuture(msg).thenApply(s -> s.toUpperCase()))
	            .collect(Collectors.toList());
	    
	    CompletableFuture.anyOf(futures.toArray(new CompletableFuture[futures.size()])).whenComplete((res, th) -> {
	        if(th == null) {
	            //assertTrue((String) res);
	            result.append(res);
	        }
	    });
	    System.out.println(result);
	    assertTrue("Result was empty", result.length() > 0);
	}

}
