package com.prog.vipul.tree;

import com.prog.vipul.tree.TreeTraversal.Node;

public class LCA {

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

		System.out.println(LCA(root, left, right));
	}

	private static int LCA(Node root, Node n1, Node n2) {

		if (n1.value < root.value && n2.value < root.value) {
			return LCA(root.left, n1, n2);
		} else if (n1.value > root.value && n2.value > root.value) {
			return LCA(root.right, n1, n2);
		} else {
			return root.value;
		}
	}
}
