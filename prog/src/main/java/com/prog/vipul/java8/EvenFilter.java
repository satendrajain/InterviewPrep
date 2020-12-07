package com.prog.vipul.java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class EvenFilter {

	public static void main(String[] args) {
		
		int[] arr = {1,2,4,4,5};
		int[] ab = Arrays.stream(arr).filter(a -> a%2!=0).toArray();
		for(int i=0;i<ab.length;i++) {
			System.out.println(ab[i]);
		}
	}
}
