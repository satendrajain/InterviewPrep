package com.prog.vipul.dp;

public class BinomialCoefficients {
//https://www.youtube.com/watch?v=3D_Oj16EtD8&list=PLqM7alHXFySGbXhWx7sBJEwY2DnhDjmxm&index=8

	public static void main(String[] args) {

		// 4C2 = 6
		// C(n,k) = C(n-1,k-1) + C(n-1,k)
		// C(n,0)=1
		// C(n,n) = 1
		// we can go with tabulation appraoch as we have base conditions

		int n1 = 4;
		int n2 = 2;

		int out1 = binomialCoefficientsRecursion(n1, n2);
		System.out.println(out1);

		int out2 = binomialCoefficientsDP(n1, n2);
		System.out.println(out2);
		
		int out3 = binomialCoefficientsDPLessSpace(n1, n2);
		System.out.println(out3);

	}

	private static int binomialCoefficientsRecursion(int n, int k) {
		if (k == 0 || n == k)
			return 1;

		return binomialCoefficientsRecursion(n - 1, k - 1) + binomialCoefficientsRecursion(n - 1, k);
	}

	private static int binomialCoefficientsDP(int n, int k) {

		int[][] temp = new int[n + 1][k + 1];

		for (int i = 0; i <= n; i++) {

			for (int j = 0; j <= Math.min(i, k); j++) {

				if (j == 0 || j == i)
					temp[i][j] = 1;
				else {
					temp[i][j] = temp[i - 1][j - 1] + temp[i - 1][j];
				}

			}

		}

		return temp[n][k];

	}

	private static int binomialCoefficientsDPLessSpace(int n, int k) {

		int[] temp = new int[k + 1];
		temp[0] = 1;

		for (int i = 1; i <= n; i++) {

			for (int j = Math.min(i, k); j > 0; j--) {

				temp[j] = temp[j] + temp[j - 1];

			}

		}

		return temp[k];

	}

}
