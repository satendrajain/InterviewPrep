package com.prog.vipul.string;

import java.util.ArrayList;
import java.util.List;

public class WordWrapGreedy {

	public static void main(String[] args) {
		String[] str = { "This", "is", "an", "example", "of", "text", "justification." };
		//String[] str = { "This", "i", "an" };
		int width = 16;
		WordWrapGreedy wordWrap = new WordWrapGreedy();
		String[] arr = wordWrap.fullJustify(str, width);
		for (String s : arr) {
			System.out.println(s);
		}

	}

	public String[] fullJustify(String[] words, int maxWidth) {
		List<String> res = new ArrayList<>();
		if (words.length == 0)
			return res.toArray(new String[0]);

		StringBuilder curr = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			String w = words[i];
			if (curr.length() == 0) {
				curr.append(w);
			} else if (maxWidth - curr.length() >= w.length() + 1) {
				curr.append(' ').append(w);
			} else {
				format(curr, maxWidth, false);
				res.add(curr.toString());
				curr.setLength(0);
				i--;
			}
		}

		format(curr, maxWidth, true);
		res.add(curr.toString());

		return res.toArray(new String[0]);
	}

	private void format(StringBuilder curr, int maxWidth, boolean leftJustify) {
		boolean hasSpace = false;
		for (int i = 0; i < curr.length(); i++) {
			if (curr.charAt(i) == ' ') {
				hasSpace = true;
				break;
			}
		}

		if (leftJustify || !hasSpace) {
			while (curr.length() < maxWidth) {
				curr.append(' ');
			}
		} else {
			int si = 1;
			while (curr.length() < maxWidth) {
				while (curr.charAt(si) != ' ' || curr.charAt(si - 1) == ' ') {
					si++;
					if (si == curr.length())
						si = 1;
				}
				curr.insert(si, ' ');
				si = si == curr.length() ? 1 : si + 1;
			}
		}
	}

}
