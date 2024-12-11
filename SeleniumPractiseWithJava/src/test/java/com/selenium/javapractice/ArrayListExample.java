package com.selenium.javapractice;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		//insertion order preserved, duplicate allowed, ideal for more retrival operation and 
		//not for insertion and deletion

		ArrayList<String> al = new ArrayList<>();
		
		al.add("Hello");
		al.add("World");
		al.add("100");
		al.add(null);
		
		System.out.println(al);
		
		//it is similar to linked list 
		
		al.remove(0);
		al.remove("World");
		System.out.println(al);
		
		al.add("Java");
		al.add("Selenium");
		al.add("Cucumber");
		
		//there are few methods like addFirst(), removeFirst(), getFirst() is NA in arraylist

	}

}
