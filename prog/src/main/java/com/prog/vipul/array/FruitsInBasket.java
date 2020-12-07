package com.prog.vipul.array;

// https://www.youtube.com/watch?v=za2YuucS0tw&list=PLi9RQVmJD2fZGdIX-y3-X37YUAWxh6GqH&index=51&t=0s
public class FruitsInBasket {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 1 };

		FruitsInBasket fs = new FruitsInBasket();
		System.out.println(fs.totalFruit(arr));
	}

	private int totalFruit(int[] arr) {
		
		if(arr==null || arr.length==0)
			return 0;
		
		int totalFruits = 0;
		int max = 1;
		int firstBasket, secondBasket = 0;
		
		for(int i=0;i<arr.length;i++) {
			
			int a = arr[i];
			
		}
		
		return totalFruits;
	}
}
