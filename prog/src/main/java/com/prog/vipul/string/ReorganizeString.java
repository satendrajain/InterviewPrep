package com.prog.vipul.string;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReorganizeString {

	// https://www.youtube.com/watch?v=zaM_GLLvysw
	public static void main(String[] args) {

		// String str = "aab";
		String str = "aab";
		System.out.println(reorganize(str));
	}

	private static String reorganize(String str) {

		Map<Character, Integer> counts = new HashMap<Character, Integer>();

		char[] ch = str.toCharArray();
		for (char c : ch) {
			counts.put(c, counts.getOrDefault(c, 0) + 1);
		}

		PriorityQueue<Character> maxHeap = new PriorityQueue<Character>((a, b) -> counts.get(b) - counts.get(a));
		maxHeap.addAll(counts.keySet());

		StringBuilder out = new StringBuilder();
		while (maxHeap.size() > 1) {

			char current = maxHeap.remove();
			char next = maxHeap.remove();
			out.append(current);
			out.append(next);
			counts.put(current, counts.get(current) - 1);
			counts.put(next, counts.get(next) - 1);
			if (counts.get(current) > 0) {
				maxHeap.add(current);
			}

			if (counts.get(next) > 0) {
				maxHeap.add(next);
			}

		}

		if (!maxHeap.isEmpty()) {
			char c = maxHeap.remove();
			if (counts.get(c) > 1) {
				return "";

			} else {
				out.append(c);

			}
		}

		return out.toString();
	}
}
