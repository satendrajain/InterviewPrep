package com.prog.vipul.tree;

import java.util.ArrayList;
import java.util.List;

import com.prog.vipul.tree.TreeTraversal.Node;

public class KthSmallestBST {

	public static void main(String[] args) {
		Node root = new Node(6);
		Node left = new Node(2);
		Node right = new Node(8);
		Node leftleft = new Node(0);
		Node leftright = new Node(4);
		Node rightleft = new Node(7);
		Node rightright = new Node(9);

		root.setLeft(left);
		root.setRight(right);

		left.setLeft(leftleft);
		left.setRight(leftright);

		right.setLeft(rightleft);
		right.setRight(rightright);

		// inorder traversal
		int k = 1;
		kthSmallest(root);
		System.out.println(list.get(k-1));
		//list.stream().forEach(a -> System.out.println(a));
	}

	static List list = new ArrayList();

	private static void kthSmallest(Node root) {
		if (root == null)
			return;

		kthSmallest(root.left);
		list.add(root.value);
		kthSmallest(root.right);

	}

}
