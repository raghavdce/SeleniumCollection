package com.selenium.javapractice;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		////insertion order preserved, duplicate allowed, not for more retrival operation but 
		//for insertion and deletion

		LinkedList<Object> li = new LinkedList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add("Java");
		//li.add(null);		--> we can add null too
		System.out.println(li); // [1, 2, 3]

		LinkedList<Object> li1 = new LinkedList<>();
		li1.add(11);
		li1.add(12);
		li1.add(3);
		System.out.println(li1); // [11, 12, 3]
		
		//to add a collection
		li.addAll(li1);
		System.out.println(li); 	//[1, 2, 3, null, 11, 12, 3]
		
		// to remove an element by index
		li.remove(0);
		li.remove("Java");
		System.out.println("After removing java by content"+li); // [2, 3, null, 11, 12, 3]
		
		//to remove a collection --> this will remove common element too
		li.removeAll(li1);
		System.out.println(li);	//[2, null]
		
		//to add element based on index
		li.add(0, 100);
		li.add(2, 100);
		li.add(3, 100);
		
		System.out.println(li);
		
		//to get an element at a particular index
		System.out.println(li.get(1));
		
		//to set an element at a particular index
		li.set(1, 200);
		li.set(2, 700);
		li.set(3, 900);
		System.out.println(li);
		
		//to check whether an element is present
		System.out.println(li.contains(100));
		
		//to check whether a list is empty
		System.out.println(li.isEmpty());
		
		//to check the size of a list
		System.out.println("The size of list 'li' is: "+li.size());
		
		//to iterate through the list
		
		//method 1 - using for loop 
		for(int i=0;i<li.size(); i++) {
			System.out.println(li.get(i));
		}
		
		//method 2 - using for each loop
		for(Object i : li) {
			System.out.println(i);
		}
		
		//method 3 - using iterator
		
		Iterator it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//special methods in linked list and not in array list
		
		li.addFirst(90);
		li.addLast(80);
		System.out.println("After adding first and last element, the new list is : " + li);
		
		System.out.println("The first element is :" + li.getFirst());
		System.out.println("The last element is :"+li.getLast());
		
		li.removeFirst();
		li.removeLast();
		System.out.println("After removing first and last element, the new list is : " + li);
		
		//to sort a list
		//Collections.sort(li);
		System.out.println("After sorting : "+li);
		
		//to reverse a list
		Collections.reverse(li);
		System.out.println("After reversing : " +li);
		
		//another way to reverse the list
		Collections.sort(li,Collections.reverseOrder());
		System.out.println("After reversing : "+li);
		

	}

}
