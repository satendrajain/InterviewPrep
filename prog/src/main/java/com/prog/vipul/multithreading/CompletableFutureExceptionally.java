package com.prog.vipul.multithreading;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class CompletableFutureExceptionally {

	static void completeExceptionallyExample() {
	    CompletableFuture<String> cf = CompletableFuture.completedFuture("message").thenApplyAsync(String::toUpperCase);
	    
	    CompletableFuture<String> exceptionHandler = cf.handle((s, th) -> { return (th != null) ? "message upon cancel" : ""; });
	    cf.completeExceptionally(new RuntimeException("completed exceptionally"));
	
	    assertTrue("Was not completed exceptionally", cf.isCompletedExceptionally());
	    
	    try {
	        cf.join();
	        fail("Should have thrown an exception");
	    } catch(CompletionException ex) { // just for testing
	        assertEquals("completed exceptionally", ex.getCause().getMessage());
	    }
	    assertEquals("message upon cancel", exceptionHandler.join());
	}
	
	public static void main(String[] args) {
		completeExceptionallyExample();
	}
}
