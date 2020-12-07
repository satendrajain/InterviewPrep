import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class Test {

	static class Node {
		Node left;
		Node right;
		int value;
		int hd;

		Node(int value) {
			this.value = value;
			this.left = null;
			this.right = null;
			this.hd = 0;
		}
	}

	public static void main(String[] args) {

		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n5.right = n6;

		// inorder(n1);
		System.out.println("***********");
		// preorder(n1);
		System.out.println("***********");
		// postorder(n1);
		System.out.println("***********");
		// levelorder(n1);
		System.out.println("***********");
		// zigzagtraversal(n1);
//		int h = height(n1);
//		System.out.println(h);
//		for(int i=0;i<h;i++) {
//			levelOrderheight(n1,i);
//		}

		// int level = 1;
		// leftView(n1, level);
		// rightView(n1, level);
		// topView(n1);

		// System.out.println(isBST(n1));

		/*
		 * int[] arr = new int[1000]; allPaths(n1,arr);
		 */

//		LRUCache cache = new LRUCache(2 /* capacity */ );
//
//		cache.put(1, 1);
//		cache.put(2, 2);
//		cache.get(1); // returns 1
//		cache.put(3, 3); // evicts key 2
//		cache.get(2); // returns -1 (not found)
//		cache.put(4, 4); // evicts key 1
//		cache.get(1); // returns -1 (not found)
//		cache.get(3); // returns 3
//		cache.get(4); // returns 4

		int[] arr = { 1, 0, 2, 1, 0, 2, 1 };

		int start = 0;
		int mid = 0;
		int end = arr.length - 1;
		while (mid < end) {

			switch (arr[mid]) {

			case 0:
				int temp = arr[start];
				arr[start] = arr[mid];
				arr[mid] = temp;
				start++;
				mid++;
				break;

			case 1:
				mid++;
				break;
			case 2:
				int temp1 = arr[mid];
				arr[mid] = arr[end];
				arr[end] = temp1;
				end--;
				break;

			}

		}

		Arrays.stream(arr).forEach(a -> System.out.println(a));

	}

	private static void allPaths(Node root, int[] arr) {
		if (root == null) {
			return;
		}

	}

	private static boolean isBST(Node root) {
		if (root == null) {
			return true;
		}

		if (root.left.value > root.value)
			return false;

		if (root.right.value < root.value)
			return false;

		return isBST(root.left) && isBST(root.right);

	}

	private static void topView(Node root) {
		if (root == null) {
			return;
		}

		root.hd = 0;
		Map<Integer, Integer> map = new HashMap<>();
		map.put(root.hd, root.value);

		Queue<Node> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {

			Node curr = queue.poll();
			// System.out.println(curr.value);

			if (curr.left != null) {
				curr.left.hd = curr.hd - 1;
				if (!map.containsKey(curr.left.hd)) {
					map.put(curr.left.hd, curr.left.value);
				}
				queue.add(curr.left);
			}

			if (curr.right != null) {
				curr.right.hd = curr.hd + 1;
				if (!map.containsKey(curr.right.hd)) {
					map.put(curr.right.hd, curr.right.value);
				}
				queue.add(curr.right);
			}

		}

		map.values().stream().forEach(a -> System.out.println(a));

	}

	private static void rightView(Node n1, int level) {

		if (n1 == null)
			return;

		if (maxlevel < level) {
			maxlevel = level;
			System.out.println(n1.value);
		}

		rightView(n1.right, level + 1);
		rightView(n1.left, level + 1);

	}

	private static int maxlevel = 0;

	private static void leftView(Node n1, int level) {
		if (n1 == null)
			return;

		if (maxlevel < level) {
			maxlevel = level;
			System.out.println(n1.value);
		}

		leftView(n1.left, level + 1);
		leftView(n1.right, level + 1);

	}

	private static void levelOrderheight(Node n1, int i) {
		if (n1 == null)
			return;

		if (i == 0) {
			System.out.println(n1.value);
		}

		levelOrderheight(n1.left, i - 1);
		levelOrderheight(n1.right, i - 1);

	}

	private static int height(Node n1) {
		if (n1 == null)
			return 0;

		int leftHeight = height(n1.left);
		int rightHeight = height(n1.right);

		return Math.max(leftHeight, rightHeight) + 1;
	}

	private static void zigzagtraversal(Node root) {
		if (root == null)
			return;

		Queue<Node> queue = new LinkedList<>();
		queue.add(root);

		Queue<Node> tempQueue = new LinkedList<>();
		boolean leftToRight = true;

		while (!queue.isEmpty()) {
			Node n1 = queue.poll();
			System.out.println(n1.value);

			if (leftToRight) {

				if (n1.left != null) {
					tempQueue.add(n1.left);
				}

				if (n1.right != null) {
					tempQueue.add(n1.right);
				}

			} else {
				if (n1.right != null) {
					tempQueue.add(n1.right);
				}

				if (n1.left != null) {
					tempQueue.add(n1.left);
				}
			}

			if (queue.isEmpty()) {
				Queue temp = tempQueue;
				queue = temp;
				temp = queue;
				leftToRight = !leftToRight;
			}
		}
	}

	private static void levelorder(Node root) {
		if (root == null)
			return;

		Queue<Node> queue = new LinkedList<>();
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

	private static void postorder(Node root) {

		if (root == null)
			return;

		Stack<Node> stack = new Stack<>();

		Node curr = root;

		while (true) {
			while (curr != null) {
				stack.push(curr);
				stack.push(curr);
				curr = curr.left;
			}

			if (stack.isEmpty())
				return;

			curr = stack.pop();

			if (stack.size() > 0 && stack.peek() == curr) {
				curr = curr.right;

			} else {
				System.out.println(curr.value);
				curr = null;
			}

		}
	}

	private static void preorder(Node root) {

		if (root == null)
			return;

		Stack<Node> stack = new Stack<>();
		stack.push(root);

		Node curr = root;
		while (!stack.isEmpty()) {

			curr = stack.pop();
			System.out.println(curr.value);

			if (curr.right != null)
				stack.push(curr.right);

			if (curr.left != null) {
				stack.push(curr.left);
			}
		}

	}

	private static void inorder(Node root) {
		if (root == null)
			return;

		Stack<Node> stack = new Stack<>();

		Node temp = root;
		while (temp != null || !stack.isEmpty()) {

			while (temp != null) {
				stack.push(temp);
				temp = temp.left;
			}

			Node n1 = stack.pop();
			System.out.println(n1.value);

			if (n1.right != null) {
				temp = n1.right;
			}
		}
	}

}

class LRUCache {

	private int capacity;
	private int currCapacity;
	private Entry[] arr;

	public LRUCache(int capacity) {
		this.capacity = capacity;
		arr = new Entry[capacity];
		this.currCapacity = 0;
	}

	public int get(int key) {

		for (int i = 0; i < currCapacity; i++) {
			Entry e = arr[i];
			if (e.key == key) {
				System.out.println(e.value);
				return e.value;
			}
		}
		return -1;
	}

	public void put(int key, int value) {
		// System.out.println(key + "::" + value);
		if (currCapacity >= capacity) {
			Entry e = arr[capacity - 1];
			e.key = key;
			e.value = value;
		} else {
			arr[currCapacity] = new Entry(key, value);
		}

		currCapacity++;
	}
}

class Entry {
	int key;
	int value;

	public Entry(int key, int value) {
		this.key = key;
		this.value = value;
	}
}
/**
 * Your LRUCache object will be instantiated and called as such: LRUCache obj =
 * new LRUCache(capacity); int param_1 = obj.get(key); obj.put(key,value);
 */
