package com.prog.vipul.stackqueue;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {

	private Queue<Integer> queue1 = new LinkedList<Integer>();
	private Queue<Integer> queue2 = new LinkedList<Integer>();

	public static void main(String[] args) {

		ImplementStackUsingQueue is = new ImplementStackUsingQueue();
		is.push(1);
		is.push(2);
		System.out.println(is.pop());
		System.out.println(is.pop());

	}

	private Integer pop() {
		if (queue1.isEmpty())
			return 0;
		return queue1.poll();
	}

	private void push(int i) {

		queue2.add(i);

		while (!queue1.isEmpty()) {
			queue2.add(queue1.poll());
		}

		Queue<Integer> q = queue1;
		queue1 = queue2;
		queue2 = q;

	}
}
