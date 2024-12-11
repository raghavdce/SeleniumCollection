package com.selenium.javapractice;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample {

	public static void main(String[] args) {
		
		//insertion order is not preserved and duplicates are not allowed, index concept is not 
		//there as the elements are stored in the same order
		
		//Null is allowed and output is not sorted

		HashSet<Integer> set = new HashSet<>();
		//to add objects
		set.add(10);
		set.add(200);
		set.add(85);
		set.add(100);
		
		System.out.println(set);
		
		//to remove
		set.remove(null);
		System.out.println(set);
		
		//to check whether an element is present
		System.out.println(set.contains("Python"));
		
		//to iterate
		//for loop will not work since get method is not there as indexing concept is not there
//		for(int i = 0; i<set.size(); i++) {
//			System.out.println(set.get(i));
//		}
//		
		for(Object obj : set) {
			System.out.println(obj);
		}
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//since duplicates are not allowed in set, addAll will bring up only the unique elements
		//hence it is called union. similarly the below
		//union = addAll(), difference = removeAll(), subset, intersetion = retainAll
		
		HashSet<Integer> set1 = new HashSet<>();
		
		set1.add(3);
		set1.add(2);
		set1.add(4);
		set1.add(1);
		System.out.println("The value of set1 is : " +set1);
		
		HashSet<Integer> set2 = new HashSet<>();
		set2.add(5);
		set2.add(2);
		set2.add(3);
		set2.add(6);
		System.out.println("The value of set2 is : " +set2);
		
		//union --> brings only the unique elements
		set1.addAll(set2);
		System.out.println("After union "+set1);
		
		//intersection --> brings only the common elements
		set1.retainAll(set2);
		System.out.println(set1);
		set1.add(1000);
		
		//difference --> remove the elements of set 2 from set 1
		set1.removeAll(set2);
		System.out.println(set1);
		
		
		
		
	}

}
