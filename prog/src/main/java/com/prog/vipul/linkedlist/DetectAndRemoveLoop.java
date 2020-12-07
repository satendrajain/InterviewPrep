package com.prog.vipul.linkedlist;

import com.prog.vipul.linkedlist.NthLinkedList.Node;

public class DetectAndRemoveLoop {

	public static void main(String[] args) {

		Node head = new Node(1);
		Node temp1 = new Node(2);
		Node temp2 = new Node(3);
		Node temp3 = new Node(4);
		Node temp4 = new Node(5);

		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		temp3.next = temp4;
		temp4.next = head;

		Node n1 = head;
		Node n2 = head;

		while (n2.next != null) {
			n1 = n1.next;
			n2 = n2.next.next;
			if (n1 == n2) {
				System.out.println("cycle");
				break;
			}

		}

	}
}
