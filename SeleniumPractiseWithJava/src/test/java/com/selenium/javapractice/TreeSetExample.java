package com.selenium.javapractice;

import java.util.*;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//insertion order is not preserved and duplicates are not allowed, index concept is not 
		//there as the elements are stored in the same order
		//difference between hashset and treeset is the output is ordered in Treeset and does not
		//allow null value in treeset

				TreeSet<Integer> set = new TreeSet<>();
				//to add objects
				set.add(10);
				set.add(200);
				set.add(85);
				set.add(100);
				System.out.println(set.first());
				//set.add(null); --> will lead to null pointer exception even if it's declared as object type
				
				System.out.println(set);
				
				TreeSet<Character> set1 = new TreeSet<>();
				set1.add('D');
				set1.add('C');
				set1.add('B');
				set1.add('A');
				set1.add('z');
				set1.add('m');
				System.out.println(set1);
				

	}

}
