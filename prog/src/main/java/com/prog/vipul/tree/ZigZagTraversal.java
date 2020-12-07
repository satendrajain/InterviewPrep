package com.prog.vipul.tree;

import java.util.Arrays;
import java.util.Stack;

import com.prog.vipul.tree.TreeTraversal.Node;

public class ZigZagTraversal {

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

		// 1
		// 2 3
		// 4 5 6 7

		// output - 1,3,2,4,5,6,7
		int height = getHeight(root);
		System.out.println(height);
		
		zigzagtraversal(root);

	}

	private static int getHeight(Node root) {
		if (root == null) {
			return 0;
		}

		int leftHeight = getHeight(root.left);

		int rightHeight = getHeight(root.right);

		return leftHeight > rightHeight ? leftHeight + 1 : rightHeight + 1;
	}

	private static void zigzagtraversal(Node root) {
		if (root == null)
			return;

		Stack<Node> stack = new Stack();
		stack.add(root);

		Stack<Node> stackTemp = new Stack();
		boolean isLeftRight = true;

		while (!stack.isEmpty()) {

			Node node = stack.pop();
			System.out.println(node.value);

			if (isLeftRight) {
				if (node.left != null) {
					stackTemp.add(node.left);
				}

				if (node.right != null) {
					stackTemp.add(node.right);
				}
			} else {

				if (node.right != null) {
					stackTemp.add(node.right);
				}

				if (node.left != null) {
					stackTemp.add(node.left);
				}

			}
			
			if (stack.isEmpty()) {
				Stack<Node> temp = stack;
				stack = stackTemp;
				stackTemp = temp;
				
				isLeftRight=!isLeftRight;

			}

		}
	}
}
