package com.prog.vipul.java8;

import java.util.HashMap;
import java.util.Map;

public class ForEach {

	public static void main(String[] args) {

		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		items.forEach((a, b) -> {
			if (a == "A") {
				System.out.println(a + "," + b);
			} else {
				System.out.println(b + "," + a);
			}
		});
	}
}
