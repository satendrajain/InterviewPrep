package com.prog.vipul.tree;

import com.prog.vipul.tree.TreeTraversal.Node;

public class isMirror {
	
	
	boolean areMirror(Node a, Node b) {
		/* Base case : Both empty */
		if (a == null && b == null)
			return true;

		// If only one is empty
		if (a == null || b == null)
			return false;

		/*
		 * Both non-empty, compare them recursively Note that in recursive calls, we
		 * pass left of one tree and right of other tree
		 */
		return a.value == b.value && areMirror(a.left, b.right) && areMirror(a.right, b.left);
	}
}
