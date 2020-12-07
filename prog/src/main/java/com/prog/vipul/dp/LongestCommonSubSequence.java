package com.prog.vipul.dp;

public class LongestCommonSubSequence {

	public static void main(String[] args) {

		String s1 = "GXTXAYB";
		String s2 = "AGGTAB";

		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();

		int[][] m = new int[c1.length + 1][c2.length + 1];

		for (int i = 0; i <= c1.length; i++) {

			for (int j = 0; j <= c2.length; j++) {

				if (i == 0 || j == 0) {
					m[i][j] = 0;
				} else if (c1[i - 1] == c2[j - 1]) {
					m[i][j] = 1 + m[i - 1][j - 1];
				} else {
					m[i][j] = Math.max(m[i - 1][j], m[i][j - 1]);
				}

			}
		}

		System.out.println(m[s1.length()][s2.length()]);
	}
}
