package com.prog.vipul.string;

public class ReverseString {

	public static void main(String[] args) {
		// https://javacodekorner.blogspot.com/2018/11/reverse-words-of-string-in-java.html
		
		String str = "NARAYAN KUMAR DAS";
		char[] ch = str.toCharArray();
		String result = "";
		for (int i = 0; i < ch.length; i++) {
			int k = i;
			while (i < ch.length && ch[i] != ' ') {
				i++;
			}
			int j = i - 1;
			while (j >= k) {
				result = result + ch[j];
				j--;
			}
			result = result + " ";
		}
		System.out.println(result);
		
//		String[] s = str.split(" ");
//		for (String s1 : s) {
//			String abc = "";
//			char[] c = s1.toCharArray();
//			for (int j = c.length - 1; j >= 0; j--) {
//				abc += c[j];
//			}
//			System.out.print(abc+" ");
//		}

	}
}
