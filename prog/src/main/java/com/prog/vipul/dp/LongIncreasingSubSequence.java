package com.prog.vipul.dp;

public class LongIncreasingSubSequence {

	public static void main(String[] args) {
		int[] arr = { 10, 22, 9, 33, 21, 50, 41, 60 };
		// LIS - {10,22,33,50,60} and {10,22,33,41,60}

		// we will take overlapping subproblems way
		int[] L = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			L[i] = 1;
		}

		for (int i = 1; i < arr.length; i++) {

			for (int j = 0; j < i; j++) {

				if (arr[i] > arr[j] && L[i] < L[j] + 1) {
					L[i] = L[j] + 1;
					System.out.println(arr[i]);
				}

			}
		}

		int maxLen = 0;
		for (int k = 0; k < arr.length; k++) {
			maxLen = Math.max(maxLen, L[k]);
		}
		
		System.out.println(maxLen);
	}
}
