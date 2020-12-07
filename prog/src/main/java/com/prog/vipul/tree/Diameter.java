package com.prog.vipul.tree;

import com.prog.vipul.tree.TreeTraversal.Node;

public class Diameter {

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

		Diameter dia = new Diameter();
		System.out.println(dia.diameter(root));
	}

	public int diameter(Node root) {

		if (root == null) {
			return 0;
		}

		int leftHeight = getHeight(root.left);
		int rightHeight = getHeight(root.right);

		int leftDia = diameter(root.left);
		int rightDia = diameter(root.right);

		return Math.max(leftHeight + rightHeight + 1, Math.max(leftDia, rightDia));

	}

	private int getHeight(Node root) {
		if (root == null) {
			return 0;
		}

		int leftHeight = getHeight(root.left);
		int rightHeight = getHeight(root.right);

		return Math.max(leftHeight, rightHeight) + 1;
	}

}
