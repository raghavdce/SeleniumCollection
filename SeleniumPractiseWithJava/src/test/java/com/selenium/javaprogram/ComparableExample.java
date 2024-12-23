package com.selenium.javaprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//When you want to make use of sort method to sort an object without using comparator, then you object 
// should implement comparable interface.

class Students implements Comparable<Students> {

	int age;
	String name;

	public Students(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Students that) {
		if (this.age % 10 > that.age % 10)
			return 1; // it means swap
		else
			return -1;
	}

}

public class ComparableExample {

	public static void main(String[] args) {

		List<Students> li = new ArrayList<>();
		li.add(new Students(12, "Ragav"));
		li.add(new Students(100, "Nikki"));
		li.add(new Students(18, "Sharanya"));
		li.add(new Students(94, "Thambi"));

		System.out.println("Before sorting : " + li);
		// System.out.println("After sorting : " + li);

		// when to use comparator interface --> when you to want to implement user
		// defined logic
		// to swap. here we are swapping numbers based on last digit of the given number

		// though comparator is a interface, we still can initiate it bcoz as per java
		// this concept
		// is called functional interface, where you will defined the body function
		// right next to it.

		Collections.sort(li);
		// System.out.println("After sorting : " + li);

		for (Students stud : li) {
			System.out.println(stud);
		}
	}

}
