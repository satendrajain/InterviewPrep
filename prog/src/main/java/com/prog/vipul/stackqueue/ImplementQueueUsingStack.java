package com.prog.vipul.stackqueue;

import java.util.Stack;

public class ImplementQueueUsingStack {

	private Stack<Integer> s1 = new Stack<Integer>();
	private Stack<Integer> s2 = new Stack<Integer>();

	public static void main(String[] args) {
		ImplementQueueUsingStack is = new ImplementQueueUsingStack();
		is.add(1);
		is.add(2);
		System.out.println(is.poll());
		System.out.println(is.poll());

	}

	private Integer poll() {
		if (s1.isEmpty())
			return 0;
		return s1.pop();
	}

	private void add(int i) {
		s1.push(i);
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}

		Stack s = s1;
		s1 = s2;
		s2 = s;

	}
}
