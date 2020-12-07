package com.prog.vipul.array;

public class MinimumDominoRotation {

	// https://www.youtube.com/watch?v=9Q73ScVu2GI&list=PLi9RQVmJD2fapKJ4DnZzAn55NJfo5IM1c&index=58&t=0s
	public static void main(String[] args) {

//		int[] A = { 2, 1, 2, 4, 2, 2 };
//		int[] B = { 5, 2, 6, 2, 3, 2 };
		// Ans - 2

		int[] A = { 3, 5, 1, 2, 3 };
		int[] B = { 3, 6, 3, 3, 4 };

		System.out.println(minDominoRotations(A, B));
	}

	public static int minDominoRotations(int[] A, int[] B) {

		// Use case where A[0] is to be present everywhere

		int count = -1;
		for (int i = 1; i < A.length; i++) {

			if (A[0] == A[i]) {
				continue;
			} else if (A[0] == B[i]) {
				count++;
			} else if (B[0] == A[i]) {
				count++;

			} else if (B[0] == B[i]) {
				continue;
			} else {
				break;
			}

		}

		return count > 0 ? count + 1 : count;
	}
}
