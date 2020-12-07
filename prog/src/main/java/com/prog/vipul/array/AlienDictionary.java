package com.prog.vipul.array;

public class AlienDictionary {

	// https://www.youtube.com/watch?v=jZBnFxIe4Y8&t=225s

	public static void main(String[] args) {

		// String[] words = { "apple", "app" }; // False
		// String[] words = { "word", "world","row" }; // false
		String[] words = { "hello", "leetcode" }; // true
		String order = "hlabcdefgijkmnopqrstuvwxyz";
		// Answer - As 'h' comes before 'l' and further characters as well, so the
		// answer is true

		// A-Z => 65-90
		// a-z => 97-122
		int[] arr = new int[order.length()];
		for (int i = 0; i < order.length(); i++) {
			arr[order.charAt(i) - 97] = i;
			// arr[order.charAt(i) - 'a'] = i;
		}

		boolean res1 = true;
		for (int i = 0; i < words.length - 1; i++) {

			for (int j = i + 1; j < words.length; j++) {
				String str1 = words[i];
				String str2 = words[j];

				res1 = res1 && evaluateStrings(arr, str1, str2);
			}

		}
		System.out.println(res1);
	}

	private static boolean evaluateStrings(int[] arr, String str1, String str2) {
		int len = Math.min(str1.length(), str2.length());

		for (int j = 0; j < len; j++) {
			if (arr[str1.charAt(j) - 97] < arr[str2.charAt(j) - 97]) {
				break;
			} else if (arr[str1.charAt(j) - 97] > arr[str2.charAt(j) - 97])
				return false;
			else if (j == len - 1 && str1.length() > str2.length()) {
				return false;
			}
		}
		return true;
	}
}
