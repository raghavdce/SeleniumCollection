package com.selenium.javapractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> li = new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(1);
		li.add(3);
		li.add(2);
		
		//to remove duplicate
		li.stream().distinct().forEach(s->System.out.println(s));
		
		System.out.println("====================");
		
		//to print the duplicate
		Set<Integer> set = new HashSet<>();
		for(int i : li)
		if(set.add(i)==false) {
			//System.out.println(i);
		}
		
		
		
			

	}

}
