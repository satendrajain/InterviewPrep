package com.prog.vipul.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Generics {

	public static void main(String[] args) {

		Person p1 = new Person(28, "Vipul");
		Person p2 = new Person(29, "Abhishek");
		Person p3 = new Person(30, "Nitin");
		Person p4 = new Person(31, "ABC");
		Person p5 = new Person(28, "DEF");

		List<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);

		Collections.sort(list);
		list.stream().forEach(p -> System.out.println(p));
		
		Integer[] arr= {1,2,3,49,1,2};
		Arrays.sort(arr);
		Arrays.asList(arr).stream().forEach(a -> System.out.println(a));
		//Collections.sort(arr);
		
	}

}

class Person implements Comparable {

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

	@Override
	public int compareTo(Object o) {

		return (this.name.compareTo(((Person)o).name));

//		if (this.age > ((Person) o).age) {
//			return 1;
//		} else if (this.age < ((Person) o).age) {
//			return -1;
//		}else{
//			return 0;
//		}

	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

}