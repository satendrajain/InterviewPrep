package com.prog.vipul.array;

import java.util.Arrays;

public class Sort01 {

	public static void main(String[] args) {

		int[] arr = { 1, 0, 1, 0, 1 };

		int i = 0;
		int j = arr.length - 1;
		while (i < j) {

			if (arr[i] > arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j--;
				i++;
			} else {
				j--;
			}

		}

		Arrays.stream(arr).forEach(a -> System.out.println(a));
	}
}
