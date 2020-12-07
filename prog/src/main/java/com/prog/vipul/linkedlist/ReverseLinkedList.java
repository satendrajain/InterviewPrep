package com.prog.vipul.linkedlist;

public class ReverseLinkedList {

	static class Node {
		Node next;
		int value;

		Node(int value) {
			this.value = value;
			next = null;
		}
	}

	public static void main(String[] args) {

		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;

		// find middle element
//		Node temp1 = n1;
//		Node temp2 = n1;
//		while(temp2!=null && temp2.next!=null) {
//			temp1=temp1.next;
//			temp2=temp2.next.next;
//		}
//		System.out.println(temp1.value);

		// reverse a linked list
		Node reversedNode = reverse(n1);
		while (reversedNode != null) {
			System.out.println(reversedNode.value);
			reversedNode = reversedNode.next;
		}

	}

	private static Node reverse(Node head) {
		if (head == null)
			return null;

		if (head.next == null) {
			return head;
		}

		Node revNode = reverse(head.next);

		head.next.next = head;
		head.next = null;

		return revNode;

	}

}
