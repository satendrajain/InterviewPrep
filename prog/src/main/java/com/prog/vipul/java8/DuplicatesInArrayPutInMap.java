package com.prog.vipul.java8;

import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.stream.IntStream;

public class DuplicatesInArrayPutInMap {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 2, 4 };
		
		Arrays.stream(arr).flatMap(new IntFunction<IntStream>() {

			@Override
			public IntStream apply(int value) {
				
				return null;
			}
			
			
		});
	}
}
