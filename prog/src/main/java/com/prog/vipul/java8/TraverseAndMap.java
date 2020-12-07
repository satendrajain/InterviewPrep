package com.prog.vipul.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TraverseAndMap {

	public static void main(String[] args) {

		Person p1 = new Person(28, "Vipul");
		Person p2 = new Person(29, "Vipul");
		Person p3 = new Person(30, "Vipul");
		Person p4 = new Person(31, "Vipul");
		Person p5 = new Person(28, "Vipul");
		
		List<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		list.stream().collect(Collectors.toMap(Person::getAge,Person::getName,(old,newv)->newv+1)).forEach((a,b)->System.out.println(a+"::"+b));
		
		//Collections.sort(list);
		
	}
}

class Person {

	int age;
	String name;

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

}
