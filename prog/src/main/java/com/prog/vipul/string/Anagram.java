package com.prog.vipul.string;

public class Anagram {

	public static void main(String[] args) {

		String str1 = "geeksforgeeks";
		String str2 = "forgeeksgeeks";

		int[] arr = new int[256];

		for (int i = 0; i < str1.length(); i++) {
			arr[str1.charAt(i)] += 1;
		}

		for (int j = 0; j < str2.length(); j++) {
			arr[str2.charAt(j)] -= 1;
		}

		boolean isAnagram = false;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != 0) {
				isAnagram = false;
				break;
			} else
				isAnagram = true;
		}

		if (isAnagram)
			System.out.println("Anagram");
		else {
			System.out.println("Not Anagram");
		}

	}
}
