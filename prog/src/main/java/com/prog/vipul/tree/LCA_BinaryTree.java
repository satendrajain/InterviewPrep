package com.prog.vipul.tree;

import com.prog.vipul.tree.TreeTraversal.Node;

public class LCA_BinaryTree {

	// Wrapper over Node class
		static class NodeWrapper {
			public Node node;

			NodeWrapper(Node node) {
				this.node = node;
			}
		}

		// Function to check if given node is present in binary tree or not
		public static boolean isNodePresent(Node root, Node node)
		{
			// base case
			if (root == null) {
				return false;
			}

			// if node is found, return true
			if (root == node) {
				return true;
			}

			// return true if node is found in the left subtree or right subtree
			return isNodePresent(root.left, node) || isNodePresent(root.right, node);
		}

		// Function to find lowest common ancestor of given nodes x and y where 
		// both x and y are present in the binary tree.
		// The function returns true if x or y is found in subtree rooted at root
		// lca -> stores LCA(x, y)
		public static boolean findLCA(Node root, NodeWrapper lca, Node x, Node y)
		{
			// base case 1: return false if tree is empty
			if (root == null) {
				return false;
			}

			// base case 2: return true if either x or y is found
			if (root == x || root == y)
			{
				// set lca to current node
				lca.node = root;
				return true;
			}

			// recursively check if x or y exists in the left subtree
			boolean left = findLCA(root.left, lca, x, y);

			// recursively check if x or y exists in the right subtree
			boolean right = findLCA(root.right, lca, x, y);

			// if x is found in one subtree and y is found in other subtree,
			// update lca to current node
			if (left && right) {
				lca.node = root;
			}

			// return true if x or y is found in either left or right subtree
			return left || right;
		}

		// Function to find lowest common ancestor of nodes x and y
		public static void findLCA(Node root, Node x, Node y)
		{
			// lca stores lowest common ancestor
			Node lca = null;

			// Wrap lca node so it's reference can be changed inside findLCA() method
			NodeWrapper LCA = new NodeWrapper(lca);

			// call LCA procedure only if both x and y are present in the tree
			if (isNodePresent(root, y) && isNodePresent(root, x)) {
				findLCA(root, LCA, x, y);
				lca = LCA.node;
			}

			// if LCA exists, print it
			if (lca != null) {
				System.out.println("LCA is " + lca.value);
			} else {
				System.out.print("LCA do not exist\n");
			}
		}

		// main function
		public static void main(String[] args)
		{
		    /* Construct below tree
		          1
		        /   \
		       /     \
		      2       3
		       \     / \
		        4   5   6
		           / \
		          7   8
		    */

			Node root = new Node(1);
			root.left = new Node(2);
			root.right = new Node(3);
			root.left.right = new Node(4);
			root.right.left = new Node(5);
			root.right.right = new Node(6);
			root.right.left.left = new Node(7);
			root.right.right.right = new Node(8);

			findLCA(root, root.right.left.left, root.right.right);
			findLCA(root, root.right.left.left, new Node(10));
			findLCA(root, root.right.left.left, root.right.left.left);
			findLCA(root, root.right.left.left, root.right.left);
			findLCA(root, root.left, root.right.left);
		}
}
