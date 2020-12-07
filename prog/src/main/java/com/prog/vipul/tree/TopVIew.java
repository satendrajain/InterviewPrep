package com.prog.vipul.tree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

import com.prog.vipul.tree.TreeTraversal.Node;

public class TopVIew {

	public static void main(String[] args) {
//		Node root = new Node(1);
//		Node left = new Node(2);
//		Node right = new Node(3);
//		Node leftleft = new Node(4);
//		Node leftright = new Node(5);
//		Node rightleft = new Node(6);
//		Node rightright = new Node(7);
//
//		root.setLeft(left);
//		root.setRight(right);
//
//		left.setLeft(leftleft);
//		left.setRight(leftright);
//
//		right.setLeft(rightleft);
//		right.setRight(rightright);

		Node root = new Node(1);
		Node left = new Node(2);
		Node right = new Node(3);
		Node leftleft = new Node(4);
		Node leftright = new Node(5);
		Node rightleft = new Node(6);
		Node rightright = new Node(7);

		root.setLeft(left);
		root.setRight(right);

		right.setLeft(leftleft);
		leftleft.setRight(leftright);

		leftright.setRight(rightleft);
		rightleft.setRight(rightright);
		
		
		
		treeTopViewMy(root);
		System.out.println("***************");
		//treeTopView(root);
	}

	private static void treeTopView(Node root) {
		
		Queue<Node> q = new LinkedList<Node>(); 
        Map<Integer, Node> topViewMap = new TreeMap<Integer, Node>(); 
  
        if (root == null) { 
            return; 
        } else { 
            q.add(root); 
            root.hd=0;
        } 
  
        System.out.println("The top view of the tree is : "); 
          
        // count function returns 1 if the container  
        // contains an element whose key is equivalent  
        // to hd, or returns zero otherwise. 
        while (!q.isEmpty()) { 
            Node tmpNode = q.poll(); 
            if (!topViewMap.containsKey(tmpNode.hd)) { 
                topViewMap.put(tmpNode.hd, tmpNode); 
            } 
  
            if (tmpNode.node.left != null) { 
                q.add(new Node(tmpNode.left, tmpNode.hd - 1)); 
            } 
            if (tmpNode.node.right != null) { 
                q.add(new QueueObj(tmpNode.node.right, tmpNode.hd + 1)); 
            } 
  
        } 
        for (Entry<Integer, Node> entry : topViewMap.entrySet()) { 
            System.out.print(entry.getValue().data); 
        } 
	}

	private static void treeTopViewMy(Node root) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		root.hd = 0;

		Queue<Node> queue = new LinkedList<TreeTraversal.Node>();
		queue.add(root);
		map.put(root.hd, root.value);

		while (!queue.isEmpty()) {

			Node n1 = queue.poll();
			System.out.println(n1.value);

			if (n1.left != null) {
				n1.left.hd = n1.hd - 1;

				if (!map.containsKey(n1.left.hd))
					map.put(n1.left.hd, n1.left.value);
				queue.add(n1.left);
			}

			if (n1.right != null) {
				n1.right.hd = n1.hd + 1;
				if (!map.containsKey(n1.right.hd))
					map.put(n1.right.hd, n1.right.value);
				queue.add(n1.right);
			}

		}

		System.out.println(map.toString());

	}
}
