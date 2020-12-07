package com.prog.vipul.tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import com.prog.vipul.tree.TreeTraversal.Node;

public class BottomView {

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

		// output - 4,

		bottomview(root);
	}

	private static void bottomview(Node root) {
		if (root == null)
			return;

		Map<Integer, Node> map = new HashMap();
		map.put(0, root);

		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		root.hd = 0;

		while (!queue.isEmpty()) {
			Node node = queue.poll();
			System.out.println(node.value + "-->" + node.hd);

			if (map.containsKey(node.hd)) {
				map.put(node.hd, node);
			} else {
				map.put(node.hd, node);
			}

			if (node.left != null) {
				queue.add(node.left);
				node.left.hd = node.hd - 1;

			}

			if (node.right != null) {
				queue.add(node.right);
				node.right.hd = node.hd + 1;
			}

		}
		
		map.values().iterator().forEachRemaining(n -> System.out.println(n.value));
		
		
	}
}
