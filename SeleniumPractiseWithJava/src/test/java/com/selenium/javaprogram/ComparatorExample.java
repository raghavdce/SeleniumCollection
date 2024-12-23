package com.selenium.javaprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ComparatorExample {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<>();
		li.add(12);
		li.add(100);
		li.add(18);
		li.add(94);

		System.out.println("Before sorting : " + li);
		//System.out.println("After sorting : " + li);
		
		//when to use comparator interface --> when you to want to implement user defined logic
		//to swap. here we are swapping numbers based on last digit of the given number
		
		//though comparator is a interface, we still can initiate it bcoz as per java this concept
		// is called functional interface, where you will defined the body function right next to it.
		
		Comparator<Integer> comp= new Comparator<Integer>() {

			@Override
			public int compare(Integer s1, Integer s2) {
				if (s1%10 > s2%10)
					return 1;		//it means swap
				else	
				return -1;			// it means don't swap
			}
			
		};
		
		Collections.sort(li,comp);
		System.out.println("After sorting : " + li);
		
	}

}
