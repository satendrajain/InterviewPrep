package com.prog.vipul.array;

public class SwapNumberWithoutVariable {

	public static void main(String[] args) {
		int A = 12;
		int B = 13;
		int C = 14;
		int D = 15;

		A = A + B + C + D;
		D = A - (B + C + D);
		C = A - (B + C + D);
		B = A - (B + C + D);
		A = A - (B + C + D);

		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);
	}
}
