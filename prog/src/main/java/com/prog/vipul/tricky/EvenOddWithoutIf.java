package com.prog.vipul.tricky;

public class EvenOddWithoutIf {

	public static void main(String[] args) {

		int num = 12;
		String[] trick = { "even", "odd" };
		System.out.println(num + " is " + trick[num % 2]);
		
		System.out.println(isEven(num));
	}
	
	public static boolean isEven (int num) {
	    return (num & 1) == 0;
	}
}
