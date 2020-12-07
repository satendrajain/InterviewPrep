package com.prog.vipul.interviewbit;

import java.util.ArrayList;

public class AddOnetoNumber {

	// https://www.interviewbit.com/problems/add-one-to-number/

	// I scored 60 out of 225, which is worse score

	public static void main(String[] args) {

		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(9);
		A.add(9);
		A.add(9);
		A.add(9);

//		A.add(0);
//		A.add(0);
//		A.add(4);
//		A.add(3);

		AddOnetoNumber arr = new AddOnetoNumber();
		System.out.println(arr.plusOne(A));
	}

	public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
		int reminder = 0;
		while (A.size() > 1 && A.get(0) == 0) {
			A.remove(0);
		}
		for (int i = A.size() - 1; i >= 0; i--) {
			int num = A.get(i);
			if (num == 9) {
				A.remove(i);
				A.add(i, 0);
				reminder = 1;
			} else {
				A.remove(i);
				A.add(i, num + 1);
				reminder = 0;
				break;
			}
		}
		if (reminder == 1) {
			A.add(0, 1);
		}
		return A;
	}
}
