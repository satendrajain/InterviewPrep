package com.prog.vipul.array;

import java.util.Comparator;
import java.util.PriorityQueue;

//	https://www.youtube.com/watch?v=fBPS7PtPtaE&list=PLi9RQVmJD2fZGdIX-y3-X37YUAWxh6GqH&index=98
public class LastStoneWeight {

	public static void main(String[] args) {

		int arr[] = { 2, 7, 4, 1, 8, 1 };
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(new Comparator<Integer>() {

			public int compare(Integer o1, Integer o2) {

				if (o1 < o2)
					return 1;
				else if (o1 > o2)
					return -1;

				return 0;
			}
		});
		for (int a : arr) {
			maxHeap.add(a);
		}

		while (maxHeap.size() != 1) {

			int a = maxHeap.poll();
			int b = maxHeap.poll();

			int diff = a - b;
			if (diff > 0)
				maxHeap.add(diff);

		}

		System.out.println(maxHeap.size());

	}
}
