package com.prog.vipul.tree;

import com.prog.vipul.tree.TreeTraversal.Node;

public class isBST {

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

		System.out.println(isBST(root));

	}

	private static boolean isBST(Node root) {

		if (root == null)
			return true;

		if ((root.left != null && root.left.value > root.value))
			return false;

		if (root.right != null && root.right.value < root.value) {
			return false;
		}

		return isBST(root.left) && isBST(root.right);
	}
	
	// Geeks for Geeks solution
	static boolean isBST(Node root, Node l, Node r)  
	{  
	    // Base condition  
	    if (root == null)  
	        return true;  
	  
	    // if left node exist then check it has  
	    // correct data or not i.e. left node's data  
	    // should be less than root's data  
	    if (l != null && root.value <= l.value)  
	        return false;  
	  
	    // if right node exist then check it has  
	    // correct data or not i.e. right node's data  
	    // should be greater than root's data  
	    if (r != null && root.value >= r.value)  
	        return false;  
	  
	    // check recursively for every node.  
	    return isBST(root.left, l, root) &&  
	        isBST(root.right, root, r);  
	}  
}
