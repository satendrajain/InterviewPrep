package com.prog.vipul.dp;

public class LargestSumContiguousArray {

	public static void main(String[] args) {

		// Kadane's Algorithm

		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };

		int max = Integer.MIN_VALUE;
		int cur_max=0;

		for (int i = 0; i < arr.length; i++) {

			cur_max += arr[i];
			
			if (cur_max < 0) {
				cur_max = 0;
			}
			 
			if(cur_max>max) {
				max=cur_max;
			}
		}
		
		System.out.println(max);

	}
}
