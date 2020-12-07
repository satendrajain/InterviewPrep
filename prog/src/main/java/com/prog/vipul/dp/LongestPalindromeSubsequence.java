package com.prog.vipul.dp;

public class LongestPalindromeSubsequence {

	public static void main(String[] args) {

		// str="agbdba"
		// answer=abdba
		
		String str = "AGBDBA";

		System.out.println(lps(str));

		System.out.println(mySol(str));

	}

	private static int mySol(String str) {
		char[] c = str.toCharArray();

		int[][] temp = new int[c.length][c.length];
		int j;

		for (int i = 0; i < c.length; i++) {

			temp[i][i] = 1;
		}

		for (int cl = 2; cl <= c.length; cl++) {

			for (int i = 0; i < c.length - cl + 1; i++) {
				j = i + cl - 1;

				if (c[i] == c[j] && cl == 2) {
					temp[i][j] = 2;
				} else if (c[i] == c[j]) {
					temp[i][j] = temp[i + 1][j - 1] + 2;
				} else {
					temp[i][j] = Math.max(temp[i][j - 1], temp[i + 1][j]);
				}

			}

		}

		return (temp[0][c.length - 1]);
	}

	static int lps(String seq) {
		int n = seq.length();
		int i, j, cl;
// Create a table to store results of subproblems 
		int L[][] = new int[n][n];

// Strings of length 1 are palindrome of lentgh 1 
		for (i = 0; i < n; i++)
			L[i][i] = 1;

		// Build the table. Note that the lower
		// diagonal values of table are
		// useless and not filled in the process.
		// The values are filled in a manner similar
		// to Matrix Chain Multiplication DP solution (See
		// https://www.geeksforgeeks.org/matrix-chain-multiplication-dp-8/).
		// cl is length of substring
		for (cl = 2; cl <= n; cl++) {
			for (i = 0; i < n - cl + 1; i++) {
				j = i + cl - 1;
				if (seq.charAt(i) == seq.charAt(j) && cl == 2)
					L[i][j] = 2;
				else if (seq.charAt(i) == seq.charAt(j))
					L[i][j] = L[i + 1][j - 1] + 2;
				else
					L[i][j] = Math.max(L[i][j - 1], L[i + 1][j]);
			}
		}

		return L[0][n - 1];
	}
}
