package com.prog.vipul.java8;

import java.util.stream.Stream;

public class Fibonacci {

	public static void main(String[] args) {

		// print fibonacci
		Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).limit(10).map(t -> t[0])
				.forEach(a -> System.out.println(a));

		System.out.println("******************");
		// sum of 10 fibonacci numbers

		System.out.println(Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).limit(10)
				.map(t -> t[0]).mapToInt(Integer::intValue).sum());

		System.out.println("******************");
		
		System.out.println(Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).limit(10)
				.map(t -> t[0]).count());
		
		
	}
}
