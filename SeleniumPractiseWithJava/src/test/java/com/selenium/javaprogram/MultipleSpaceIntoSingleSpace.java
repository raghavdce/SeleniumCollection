package com.selenium.javaprogram;

import  java.lang.*;

public class MultipleSpaceIntoSingleSpace {

	public static void main(String[] args) {
		// MEthod 1
		
		String s = "I     am     Ragavendran          V";
		String[] s1 = s.split(" ");
		String newS = "";
		for(int i=0; i<s1.length; i++) {
			if(!(s1[i].isEmpty())) {
				newS = (newS+s1[i]) +" ";
			}
		}
		System.out.println(newS);
		
		//method 2
		
		String name = "I     am     Ragavendran          V";
		name = name.replaceAll("\\s+", " ");
		System.out.println(name);

	}

}
