package com.prog.vipul.windowslide;

public class WindowSlideTechnique {
	
	// https://www.geeksforgeeks.org/window-sliding-technique/

	public static void main(String[] args) {
//		int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
//		int k = 4;
		
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; 
        int k = 3; 
		int n = arr.length;
		System.out.println(maxSum(arr, n, k));
	}

	private static int maxSum(int[] arr, int n, int k) {

		int maxSum = 0;

		for (int i = 0; i < k; i++) {
			maxSum += arr[i];
		}

		int curSum = maxSum;
		for (int j = k; j < n; j++) {
			curSum += arr[j] - arr[j - k];
			maxSum = Math.max(maxSum, curSum);
		}

		return maxSum;
	}
}
