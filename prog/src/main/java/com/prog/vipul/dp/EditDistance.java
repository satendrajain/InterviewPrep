package com.prog.vipul.dp;

public class EditDistance {
	// https://www.youtube.com/watch?v=Thv3TfsZVpw&list=PLqM7alHXFySGbXhWx7sBJEwY2DnhDjmxm&index=7

	public static void main(String[] args) {

		// geek and gesek - 1 operation i.e. insert s
		// cat and cut - 1 operation i.e. replace a with u

		String s1 = "geek";
		String s2 = "gesek";
// 		Answer - 1
		
//		String s1 = "cat";
//		String s2 = "cut";
// 		Answer - 1

//		String s1 = "CART";
//		String s2 = "MARCH";
// 		Answer - 3
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();

		int[][] temp = new int[s1.length() + 1][s2.length() + 1];

		for (int i = 0; i <= s1.length(); i++) {

			for (int j = 0; j <= s2.length(); j++) {

				if (i == 0 || j == 0) {
					temp[i][j] = 0;
				} else if (c1[i - 1] == c2[j - 1]) {
					temp[i][j] = temp[i - 1][j - 1];
				} else {
					temp[i][j] = 1 + Math.min(Math.min(temp[i - 1][j], temp[i][j - 1]), temp[i - 1][j - 1]);
				}

			}
		}

		int operation = temp[s1.length()][s2.length()];
		System.out.println(operation);

	}

}
