package com.selenium.javaprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Student{
	
	int age;
	String name;
	
	public Student(int age, String name) {
		this.age = age;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
	
}

public class ComparatorExampleWithObject {

	public static void main(String[] args) {

		List<Student> li = new ArrayList<>();
		li.add(new Student(12,"Ragav"));
		li.add(new Student(100,"Nikki"));
		li.add(new Student(18,"Sharanya"));
		li.add(new Student(94,"Thambi"));

		System.out.println("Before sorting : " + li);
		//System.out.println("After sorting : " + li);
		
		//when to use comparator interface --> when you to want to implement user defined logic
		//to swap. here we are swapping numbers based on last digit of the given number
		
		//though comparator is a interface, we still can initiate it bcoz as per java this concept
		// is called functional interface, where you will defined the body function right next to it.
		
		Comparator<Student> comp= new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				if (s1.age%10 > s2.age%10)
					return 1;		//it means swap
				else	
				return -1;			// it means don't swap
			}
			
		};
		
		Collections.sort(li,comp);
		//System.out.println("After sorting : " + li);
		
		for(Student stud : li) {
			System.out.println(stud);
		}
	}

}
