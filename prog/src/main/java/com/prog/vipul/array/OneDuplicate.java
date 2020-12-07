package com.prog.vipul.array;

public class OneDuplicate {

	public static void main(String[] args) {
		// array with n+1 numbers. one number will be repeating in 1-n
		int[] arr = {1,2,3,2,4,5};
		int len = arr.length;
		int totalSum = (len-1)*(len)/2;
		int sum =0;
		for(int i=0;i<len;i++) {
			sum+=arr[i];
		}
		System.out.println(sum-totalSum);
		
		// xor solution
		int res = arr[0];
		for(int j=1;j<len;j++) {
			res = res^arr[j];
		}
		for(int j=1;j<len;j++) {
			res = res^j;
		}
		
		System.out.println(res);
		
		
		// A,B
		// A=31, B=37,
		// A=37, B=31, 
		
		
	}
}
