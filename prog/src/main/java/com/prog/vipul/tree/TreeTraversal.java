package com.prog.vipul.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeTraversal {

	static class Node {
		Node left;
		Node right;
		int value;
		int hd = 0;

		public Node(int value) {
			this.value = value;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public void setRight(Node right) {
			this.right = right;
		}
		
		public Node getLeft() {
			return left;
		}

		public Node getRight() {
			return right;
		}

		public int getValue() {
			return value;
		}

		public void setHd(int hd) {
			this.hd = hd;
		}

		public int getHd() {
			return hd;
		}
	}

	public static void main(String[] args) {

		/*
		 * 
		 * (a) Inorder (Left, Root, Right) : 4 2 5 1 3 (b) Preorder (Root, Left, Right)
		 * : 1 2 4 5 3 (c) Postorder (Left, Right, Root) : 4 5 2 3 1
		 */

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

		// System.out.println("*******inorder********");
		// inorder(root);

		// System.out.println("*******preorder********");
		// preorder(root);

		// System.out.println("******postorder*********");
		// postorder(root);

		// System.out.println("******inorderWithoutRecursion*********");
		// inorderWithoutRecursion(root);

		// System.out.println("******preorderWithoutRecursion*********");
		// preorderWithoutRecursion(root);

		// System.out.println("******postorderWithoutRecursion*********");
		// postorderWithoutRecursion(root);

		System.out.println("******levelOrderTraversal*********");
		int height = getHeight(root);
		System.out.println("Height of tree is::" + height);
		for (int i = 0; i < height; i++) {
			levelOrderTraversal(root, i);
		}

		System.out.println("******levelOrderTraversalWithoutRecursion*********");
		levelOrderTraversalWithoutRecursion(root);

	}

	private static int getHeight(Node root) {

		if (root == null)
			return 0;

		int leftMax = getHeight(root.left);
		int rightMax = getHeight(root.right);

		return Math.max(leftMax, rightMax) + 1;
	}

	private static void levelOrderTraversal(Node root, int height) {
		if (root == null)
			return;

		if (height == 0)
			System.out.println(root.value);

		levelOrderTraversal(root.left, height - 1);
		levelOrderTraversal(root.right, height - 1);

	}

	private static void levelOrderTraversalWithoutRecursion(Node root) {
		if (root == null)
			return;

		Queue<Node> queue = new LinkedList<TreeTraversal.Node>();
		queue.add(root);

		while (!queue.isEmpty()) {
			Node n1 = queue.poll();
			System.out.println(n1.value);

			if (n1.left != null) {
				queue.add(n1.left);
			}

			if (n1.right != null) {
				queue.add(n1.right);
			}

		}

	}

	private static void postorderWithoutRecursion(Node root) {
		if (root == null)
			return;

		Stack<Node> stack = new Stack<Node>();

		while (true) {

			while (root != null) {
				stack.push(root);
				stack.push(root);
				root = root.left;
			}

			if (stack.isEmpty())
				return;

			root = stack.pop();

			if (!stack.isEmpty() && stack.peek() == root) {
				root = root.right;
			} else {
				System.out.println(root.value);
				root = null;
			}

		}
	}

	private static void preorderWithoutRecursion(Node root) {
		if (root == null)
			return;

		Stack<Node> stack = new Stack<Node>();
		stack.push(root);

		while (!stack.isEmpty()) {
			Node n1 = stack.pop();
			System.out.println(n1.value);

			if (n1.right != null) {
				stack.push(n1.right);
			}

			if (n1.left != null) {
				stack.push(n1.left);
			}
		}

	}

	private static void inorderWithoutRecursion(Node root) {

		if (root == null)
			return;

		Stack<Node> stack = new Stack<Node>();
		Node curr = root;

		while (curr != null || stack.size() > 0) {

			while (curr != null) {
				stack.push(curr);
				curr = curr.left;
			}

			curr = stack.pop();
			System.out.println(curr.value);

			curr = curr.right;

		}

	}

	private static void postorder(Node root) {
		if (root == null)
			return;

		postorder(root.left);
		postorder(root.right);
		System.out.println(root.value);
	}

	private static void preorder(Node root) {
		if (root == null)
			return;

		System.out.println(root.value);
		preorder(root.left);
		preorder(root.right);
	}

	private static void inorder(Node root) {
		if (root == null)
			return;

		inorder(root.left);
		System.out.println(root.value);
		inorder(root.right);
	}
}
