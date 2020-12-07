package com.prog.vipul.windowslide;

public class MaximumSubArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int k = 3;
		int n = arr.length;
		System.out.println(maxArray(arr, n, k));
	}

	private static int maxArray(int[] arr, int n, int k) {

		int max = arr[0];

		for (int i = 0; i < k; i++) {
			max = Math.max(max, arr[i]);
		}

		int maxSum = 0;
		int curSum = maxSum ;
		for (int j = k; j < n; j++) {
			curSum += arr[j] - arr[j - k];
			maxSum = Math.max(maxSum, curSum);
		}

		return maxSum;
	}

}
