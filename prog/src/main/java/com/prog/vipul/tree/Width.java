package com.prog.vipul.tree;

import com.prog.vipul.tree.TreeTraversal.Node;

public class Width {

	public static void main(String[] args) {

		Node root = new Node(1);
		Node left = new Node(2);
		Node right = new Node(3);
		Node leftleft = new Node(4);
		Node leftright = new Node(5);
		Node rightleft = new Node(6);
		Node rightright = new Node(7);

		root.setLeft(left);
		root.setRight(right);

		left.setLeft(leftleft);
		left.setRight(leftright);

		right.setLeft(rightleft);
		right.setRight(rightright);

		int width = 1;
		int height = getHeight(root);
		for (int i = 1; i < height; i++) {
			int tempwidth = getWidth(root, i);
			width = Math.max(width, tempwidth);
		}
		System.out.println(width);

	}

	public static int getHeight(Node root) {
		if (root == null)
			return 0;

		return Math.max(getHeight(root.left), getHeight(root.right)) + 1;

	}

	private static int getWidth(Node root, int height) {

		if (root == null)
			return 0;

		if (height == 0) {
			return 1;
		}

		return getWidth(root.left, height - 1) + getWidth(root.right, height - 1);
	}
}
