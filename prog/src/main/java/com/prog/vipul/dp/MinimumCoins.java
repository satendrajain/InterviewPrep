package com.prog.vipul.dp;

public class MinimumCoins {

	public static void main(String[] args) {

		// https://www.youtube.com/watch?v=F28xN-S1SmI&list=PLqM7alHXFySGbXhWx7sBJEwY2DnhDjmxm&index=18
		// https://www.geeksforgeeks.org/coin-change-dp-7/

		int[] coins = { 7, 2, 3, 6 };
		int total = 13;
		System.out.println(minCoins(coins, total));
		System.out.println(totalPossibilities(coins, coins.length, total));

	}

	public static int minCoins(int[] coins, int total) {

		int[] temp = new int[total + 1];
		temp[0] = 0;

		for (int i = 1; i <= total; i++) {
			temp[i] = Integer.MAX_VALUE;
		}

		for (int j = 0; j < coins.length; j++) {

			for (int i = 1; i <= total; i++) {

				if (i >= coins[j]) {
					if (temp[i - coins[j]] != Integer.MAX_VALUE && temp[i - coins[j]] + 1 < temp[i]) {

						temp[i] = 1 + temp[i - coins[j]];

					}
				}

			}

		}

		return temp[total];
	}

	public static int totalPossibilities(int S[], int m, int n) {
		// table[i] will be storing the number of solutions for
		// value i. We need n+1 rows as the table is constructed
		// in bottom up manner using the base case (n = 0)
		int table[] = new int[n + 1];

		// Base case (If given value is 0)
		table[0] = 1;

		// Pick all coins one by one and update the table[] values
		// after the index greater than or equal to the value of the
		// picked coin
		for (int i = 0; i < m; i++)
			for (int j = S[i]; j <= n; j++)
				table[j] += table[j - S[i]];

		return table[n];
	}

}
