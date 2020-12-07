package com.prog.vipul.array;

public class WaterTrapping {

	public static void main(String[] args) {
		// https://www.geeksforgeeks.org/trapping-rain-water/

		//int[] arr = { 2, 0, 2 };
		//int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		int arr[]   = {3, 0, 0, 2, 0, 4};
		int[] leftMax = new int[arr.length];
		int[] rightMax = new int[arr.length];
		
		int temp = arr[0];
		for(int i=0;i<arr.length;i++) {
			temp=Math.max(temp, arr[i]);
			leftMax[i]=temp;
		}
		
		int temp1 = arr[arr.length-1];
		for(int i=arr.length-1;i>=0;i--) {
			temp1=Math.max(temp1, arr[i]);
			rightMax[i]=temp1;
		}
		
		for(int i=0;i<leftMax.length;i++) {
			System.out.println(leftMax[i]);
		}
//		System.out.println("*********");
//		for(int i=0;i<rightMax.length;i++) {
//			System.out.println(rightMax[i]);
//		}
//		System.out.println("*********");
		int totalWater = 0;
		
		for(int i=0;i<arr.length;i++) {
			totalWater+=(Math.min(leftMax[i], rightMax[i])-arr[i]);
		}
		
		System.out.println(totalWater);
	}
}
