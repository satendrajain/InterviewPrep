package com.prog.vipul.linkedlist;

import java.util.PriorityQueue;

public class MergeKSortedLists {

	static class ListNode {
		ListNode next;
		int data;

		ListNode(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {

		ListNode l11 = new ListNode(1);
		ListNode l12 = new ListNode(4);
		ListNode l13 = new ListNode(5);

		ListNode l21 = new ListNode(1);
		ListNode l22 = new ListNode(3);
		ListNode l23 = new ListNode(4);

		ListNode l31 = new ListNode(2);
		ListNode l32 = new ListNode(6);

		l11.next = l12;
		l12.next = l13;

		l21.next = l22;
		l22.next = l23;

		l31.next = l32;

		// printAllNodes(l21);
		ListNode[] lists = { l11, l21, l31 };

		ListNode head = mergeKList(lists);
		printAllNodes(head);

	}

	private static void printAllNodes(ListNode head) {
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}

	public static ListNode mergeKList(ListNode[] lists) {

		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

		for (ListNode list : lists) {

			ListNode head = list;
			while (head != null) {
				minHeap.add(head.data);
				head = head.next;
			}

		}

		ListNode dummy = new ListNode(-1);
		ListNode head = dummy;
		while (!minHeap.isEmpty()) {
			head.next = new ListNode(minHeap.remove());
			head = head.next;

		}

		return dummy;

	}
}
