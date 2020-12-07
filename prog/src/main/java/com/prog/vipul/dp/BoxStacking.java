package com.prog.vipul.dp;

import java.util.Arrays;

public class BoxStacking {

	public static void main(String[] args) {

		//https://www.geeksforgeeks.org/box-stacking-problem-dp-22/
		// 
		Box[] arr = new Box[4];
		arr[0] = new Box(4, 6, 7);
		arr[1] = new Box(1, 2, 3);
		arr[2] = new Box(4, 5, 6);
		arr[3] = new Box(10, 12, 32);

		System.out.println("The maximum possible " + "height of stack is " + maxStackHeight(arr, 4));
	}

	private static int maxStackHeight(Box[] arr, int i) {

		Box[] boxes = new Box[3 * i];

		/*
		 * New Array of boxes is created - considering all 3 possible rotations, with
		 * width always greater than equal to width
		 */
		for (int j = 0; j < arr.length; j++) {

			Box box = arr[j];

			boxes[3 * j] = new Box(box.h, Math.max(box.d, box.w), Math.min(box.d, box.w));

			boxes[3 * j + 1] = new Box(box.w, Math.max(box.d, box.h), Math.min(box.d, box.h));

			boxes[3 * j + 2] = new Box(box.d, Math.max(box.h, box.w), Math.min(box.h, box.w));

		}

		// calculating base area
		for (int h = 0; h < boxes.length; h++) {
			boxes[h].area = boxes[h].d * boxes[h].w;
		}

		// sort boxes on area in descending order
		Arrays.sort(boxes);

		/*
		 * Initialize msh values for all indexes msh[i] --> Maximum possible Stack
		 * Height with box i on top
		 */
		int mhs[] = new int[3 * i];

		for (int k = 0; k < boxes.length; k++) {
			mhs[k] = boxes[k].h;
		}

		// compute optimal mhs in bottom up manner
		for (int g = 0; g < 3 * i; g++) {
			mhs[g] = 0;
			int val = 0;
			Box box = boxes[g];

			for (int j = 0; j < g; j++) {
				Box prevBox = boxes[j];
				if (box.d < prevBox.d && box.w < prevBox.w) {
					val = Math.max(val, mhs[j]);
				}

			}

			mhs[g] = val + box.h;

		}

		int max = -1;

		/* Pick maximum of all msh values */
		for (int i1 = 0; i1 < mhs.length; i1++) {
			max = Math.max(max, mhs[i1]);
		}

		return max;
	}

	static class Box implements Comparable<Box> {
		int h, w, d, area;

		public Box(int h, int w, int d) {
			this.h = h;
			this.w = w;
			this.d = d;
		}

		public int getArea() {
			return area;
		}

		@Override
		public int compareTo(Box o) {
			return o.area - this.area;
		}

	}
}
