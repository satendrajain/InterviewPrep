package com.prog.vipul.array;

import java.util.PriorityQueue;

// https://www.youtube.com/watch?v=3dqR2nYElyw&list=PLi9RQVmJD2fZGdIX-y3-X37YUAWxh6GqH&index=99
public class MinCostConnectSticks {

	public static void main(String[] args) {

		// int arr[] = { 2, 4, 3 };
		int arr[] = { 1, 8, 3, 5 };
		int cost = connectSticks(arr);
		System.out.println(cost);
	}

	public static int connectSticks(int[] arr) {

		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		for (int a : arr) {
			minHeap.add(a);
		}

		int cost = 0;
		while (minHeap.size() > 1) {
			int a = minHeap.poll();
			int b = minHeap.poll();

			cost += (a + b);
			minHeap.add(a + b);

		}

		return cost;
	}
}
