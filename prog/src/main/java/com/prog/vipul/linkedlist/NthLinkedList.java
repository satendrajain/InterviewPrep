package com.prog.vipul.linkedlist;

public class NthLinkedList {

	static class Node {
		Node next;
		Integer value;

		public Node(Integer value) {
			this.value = value;
		}

		public Node getNext() {
			return next;
		}

		public Integer getValue() {
			return value;
		}

	}

	public static void main(String[] args) {

		// return value of nth node from end

		Node head = new Node(1);
		Node temp1 = new Node(2);
		Node temp2 = new Node(3);
		Node temp3 = new Node(4);
		Node temp4 = new Node(5);

		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		temp3.next = temp4;

		// length of linked list
		int len = 1;
		Node tmp = head;

		while (tmp.next != null) {
			len++;
			tmp = tmp.next;
		}
		System.out.println(len);

		// nth length from end means len-n+1 from beginning

		// 2nd node from end
		Node tmp1 = head;
		int i = 1;
		while (tmp1 != null) {
			if (i == 3) {
				System.out.println(tmp1.value);
				break;
			}
			tmp1 = tmp1.next;
			i++;
		}

	}
}
