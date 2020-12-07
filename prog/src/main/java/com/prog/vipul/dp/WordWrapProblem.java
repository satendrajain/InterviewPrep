package com.prog.vipul.dp;

public class WordWrapProblem {

	public static void main(String[] args) {

		String[] arr = { "Tushar", "Roy", "loves", "to", "code" };
		int length = 10;
		int cost = 0;

		int tempLen = 10;
		for (int i = 0; i < arr.length; i++) {
			if (tempLen > arr[i].length()) {
				tempLen -= (arr[i].length() + 1);
				if(tempLen<arr[i+1].length()) {
					tempLen+=1;
				}
			} else if (tempLen == arr[i].length()) {
				tempLen -= arr[i].length();
			} else {
				cost += tempLen ^ 2;
				tempLen = length;
			}
			System.out.println(tempLen);
			if(tempLen==0) {
				System.out.println("Line finished");
				tempLen=length;
			}
		}
		
		//System.out.println(cost);

	}
}
