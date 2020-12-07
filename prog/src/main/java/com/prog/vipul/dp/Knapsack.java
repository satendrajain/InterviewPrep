package com.prog.vipul.dp;

public class Knapsack {

	public static void main(String[] args) {

		int val[] = new int[] { 60, 100, 120 };
		int wt[] = new int[] { 10, 20, 30 };
		int W = 50;
		int n = val.length;
		System.out.println(knapSack(W, wt, val, n));
		System.out.println(knapSackRecursive(W, wt, val, n));
	}

	// see how DP is implemented after recursion
	private static int knapSack(int W, int[] wt, int[] val, int n) {

		int[][] arr = new int[n + 1][W + 1];

		for (int i = 0; i <= wt.length; i++) {

			for (int w = 0; w <= W; w++) {

				if (i == 0 || w == 0) {
					arr[i][w] = 0;
				} else if (w - wt[i - 1] >= 0) {
					arr[i][w] = Math.max(arr[i - 1][w], val[i - 1] + arr[i - 1][w - wt[i - 1]]);
				} else {
					arr[i][w] = arr[i - 1][w];
				}
			}
		}

		return arr[n][W];
	}

	private static int knapSackRecursive(int w, int[] wt, int[] val, int n) {

		if (n == 0 || w == 0) {
			return 0;
		}

		if (wt[n - 1] > w) {
			return knapSackRecursive(w, wt, val, n - 1);
		} else {
			return Math.max(val[n - 1] + knapSackRecursive(w - wt[n - 1], wt, val, n - 1),
					knapSackRecursive(w, wt, val, n - 1));
		}

	}

}
