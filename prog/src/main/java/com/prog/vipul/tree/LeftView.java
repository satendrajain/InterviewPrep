package com.prog.vipul.tree;

import com.prog.vipul.tree.TreeTraversal.Node;

public class LeftView {

	private static int maxLevel = 0;
	
	public static void main(String[] args) {

		Node root = new Node(1);
		Node left = new Node(2);
		Node right = new Node(3);
		Node leftleft = new Node(4);
		Node leftright = new Node(5);
		Node rightleft = new Node(6);
		Node rightright = new Node(7);

		/*
		 * root.setLeft(left); root.setRight(right);
		 * 
		 * left.setLeft(leftleft); left.setRight(leftright);
		 * 
		 * right.setLeft(rightleft); right.setRight(rightright);
		 */
		
		
		root.setLeft(left); 
		root.setRight(right);
		
		right.setLeft(leftleft);
		right.setRight(leftright);
		
		leftleft.setRight(rightleft);
		rightleft.setRight(rightright);

		// 1
		// 2 3
		// 4 5 6 7

		// output - 1,2,4

		
		int level = 1;
		leftview(root, level);

	}

	private static void leftview(Node root, int level) {
		if (root == null)
			return;

		if(maxLevel<level) {
			maxLevel=level;
			System.out.println(root.value);
		}

		leftview(root.left, level+1);
		leftview(root.right, level+1);

	}
}
