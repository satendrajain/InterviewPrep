package com.prog.vipul.array;

public class OneUnique {

	public static void main(String[] args) {

		// int[] arr = { 12, 1, 12, 3, 12, 1, 1, 2, 3, 3 };
		int[] arr = { 10, 20, 10, 30, 10, 30, 30 };
		
		int xor = arr[0];
		for (int i = 1; i < arr.length; i ++) {
			xor = xor ^ (arr[i]);
			System.out.println(xor);
		}
		//System.out.println(xor ^ arr[arr.length - 1]);

	}
}
