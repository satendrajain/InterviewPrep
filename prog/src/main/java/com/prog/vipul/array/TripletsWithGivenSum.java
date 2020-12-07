package com.prog.vipul.array;

import java.util.Arrays;
import java.util.HashSet;

public class TripletsWithGivenSum {

	public static void main(String[] args) {

		int[] arr = { 0, -1, 2, -3, 1 };
		int sum = -2;
		// 0 -3 1
		// -1 2 -3

		// int[] arr = { 1, -2, 1, 0, 5 };
		// int sum = 0;
		// 1 -2 1

		// O(n2) and O(n) space
		basicImpl(arr, sum);

		// O(n2) and O(1) space
		optimizedImpl(arr, sum, arr.length);

	}

	private static void optimizedImpl(int[] arr, int sum, int length) {

		Arrays.sort(arr);

		for (int i = 0; i < length; i++) {

			int x = arr[i];
			int l = i + 1;
			int r = length - 1;

			while (l < r) {

				if (x + arr[l] + arr[r] == sum) {

					System.out.println("optimized triplet is::" + x + "," + arr[l] + "," + arr[r]);
					l++;
					r--;
				} else if (x + arr[l] + arr[r] < sum) {
					l++;
				} else {
					r--;
				}
			}
		}

	}

	private static void basicImpl(int[] arr, int sum) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				int diff = sum - (arr[i] + arr[j]);
				if (set.contains(diff)) {
					System.out.println("basic triplet is::" + arr[i] + "," + arr[j] + "," + diff);

				} else {
					set.add(arr[j]);
				}

			}

		}
	}
}
