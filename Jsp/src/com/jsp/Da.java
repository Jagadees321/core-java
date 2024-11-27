package com.jsp;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Da {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		 CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hello")
	                .thenApply(s -> s + " World")
	                .thenApply(String::toUpperCase);

	        System.out.println(future.get()); // Prints "HELLO WORLD"

	}

}
