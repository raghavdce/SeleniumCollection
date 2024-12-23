package com.selenium.javapractice;

public class BooleanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		
		@SuppressWarnings("removal")
		Boolean b = new Boolean("True");
		Boolean b1 = new Boolean(true);
		System.out.println(b.equals(b1)); 
		Boolean b2 = new Boolean("True");
		Boolean b3 = new Boolean("TrUE");
		System.out.println (b2.equals(b3)); 
		//Scenario №3: Apart from string “TRUE” if we going to pass any other string (Hey,Bye in our example), 
		//It will treat those values as a FALSE. So b5=false and b6=false. So now if you check both
		//references using equals() method it will return true(Cause both contain “false” as a string content).
		Boolean b4 = new Boolean("hey");	//since the value is other than true, it is considered as False
		Boolean b5 = new Boolean("bye");	// same here
		System.out.println (b4.equals(b5)); 	//here it checks false again false, hence o/p is true



	}

}
