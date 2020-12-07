package com.prog.vipul.tricky;

public class IfWithoutAnd {

	public static void main(String[] args) {

		// right way
		if (true && true) {
			System.out.println("true");
		}

		
		// without &&
		if (true) {
			if (true) {

			}
		}
	}
}
