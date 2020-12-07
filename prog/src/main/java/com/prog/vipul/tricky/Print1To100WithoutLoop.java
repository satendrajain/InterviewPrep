package com.prog.vipul.tricky;

public class Print1To100WithoutLoop {

	public static void main(String[] args) {

		int num = 100;
		printNumbers(num);

	}

	public static void printNumbers(int num) {

		if (num > 0) {
			printNumbers(num - 1);
			System.out.println(num);
		}
		return;
	}
}
