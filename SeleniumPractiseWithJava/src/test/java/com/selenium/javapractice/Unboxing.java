package com.selenium.javapractice;

import java.util.ArrayList;

public class Unboxing {
	
	 public static void main(String[] args)
	    {
	       // this is to understand the importance of wrapper class. If these are not there
		 //then we can not add object into list (in the form of int into Integer obj) 
		 //and can not get object in the form of int primitive data type

	        ArrayList<Integer> arrayList
	            = new ArrayList<Integer>();
	        arrayList.add(24);

	        // unboxing because get method returns an Integer
	        // object but we are storing in int primitive type. Note: Integer still will work here.
	        int num = arrayList.get(0);

	        // printing the values from primitive data types
	        System.out.println(num);
	    }

}
