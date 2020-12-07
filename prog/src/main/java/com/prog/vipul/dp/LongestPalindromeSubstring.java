package com.prog.vipul.dp;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindromeSubstring {

	public static void main(String[] args) {

		String str = "forgeeksskeegfor";
		// answer - geeksskeeg

		System.out.println(longestPalindromeString(str));
		System.out.println(findAllPalindromesUsingManachersAlgorithm(str));
		System.out.println(manachersAlgorithm(str, str.length()));

	}

	private static int longestPalindromeString(String str) {

		int len = str.length();

		boolean temp[][] = new boolean[len + 1][len + 1];

		for (int i = 0; i < len; i++) {
			temp[i][i] = true;
		}

		// for len = 2
		int maxlen = 0;
		int start = 0;
		for (int i = 0; i < len - 1; i++) {

			if (str.charAt(i) == str.charAt(i + 1)) {
				temp[i][i + 1] = true;
				maxlen = 2;
				start = i;
			}

		}

		System.out.println(start);
		System.out.println(maxlen);
		/// for length 3 and more
		for (int k = 3; k <= len; k++) {

			for (int i = 0; i < len - k + 1; i++) {

				int j = i + k - 1;

				if (temp[i + 1][j - 1] && str.charAt(i) == str.charAt(j)) {
					temp[i][j] = true;

					if (k > maxlen) {
						start = i;
						maxlen = k;
					}
				}

			}

		}

		System.out.println(str.substring(start, start + maxlen - 1));
		return maxlen;
	}

	// https://www.baeldung.com/java-palindrome-substrings
	public static Set<String> findAllPalindromesUsingManachersAlgorithm(String input) {
		Set<String> palindromes = new HashSet<>();

		String formattedInput = "@" + input + "#";
		char inputCharArr[] = formattedInput.toCharArray();

		int max;
		int radius[][] = new int[2][input.length() + 1];
		for (int j = 0; j <= 1; j++) {
			radius[j][0] = max = 0;
			int i = 1;
			while (i <= input.length()) {
				palindromes.add(Character.toString(inputCharArr[i]));
				while (inputCharArr[i - max - 1] == inputCharArr[i + j + max])
					max++;
				radius[j][i] = max;
				int k = 1;
				while ((radius[j][i - k] != max - k) && (k < max)) {
					radius[j][i + k] = Math.min(radius[j][i - k], max - k);
					k++;
				}
				max = Math.max(max - k, 0);
				i += k;
			}
		}
		for (int i = 1; i <= input.length(); i++) {
			for (int j = 0; j <= 1; j++) {
				for (max = radius[j][i]; max > 0; max--) {
					palindromes.add(input.substring(i - max - 1, max + j + i - 1));
				}
			}
		}
		return palindromes;
	}

	// https://medium.com/hackernoon/manachers-algorithm-explained-longest-palindromic-substring-22cb27a5e96f

	static int manachersAlgorithm(String s, int N) {

		String str = getModifiedString(s, N);

		int len = (2 * N) + 1;
		// expansion length array
		int[] P = new int[len];
		int c = 0; // stores the center of the longest palindromic substring until now
		int r = 0; // stores the right boundary of the longest palindromic substring until now
		int maxLen = 0;
		for (int i = 0; i < len; i++) {
			// get mirror index of i
			int mirror = (2 * c) - i;

			// see if the mirror of i is expanding beyond the left boundary of current
			// longest palindrome at center c
			// if it is, then take r - i as P[i]
			// else take P[mirror] as P[i]
			if (i < r) {
				P[i] = Math.min(r - i, P[mirror]);
			}

			// expand at i
			int a = i + (1 + P[i]);
			int b = i - (1 + P[i]);
			while (a < len && b >= 0 && str.charAt(a) == str.charAt(b)) {
				P[i]++;
				a++;
				b--;
			}

			// check if the expanded palindrome at i is expanding beyond the right boundary
			// of current longest palindrome at center c
			// if it is, the new center is i
			if (i + P[i] > r) {
				c = i;
				r = i + P[i];

				if (P[i] > maxLen) { // update maxlen
					maxLen = P[i];
				}
			}
		}
		return maxLen;
	}

	static String getModifiedString(String s, int N) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			sb.append("#");
			sb.append(s.charAt(i));
		}
		sb.append("#");
		return sb.toString();
	}

}
