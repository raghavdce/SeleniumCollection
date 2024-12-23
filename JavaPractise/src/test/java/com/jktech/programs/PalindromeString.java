package com.jktech.programs;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "BLOLB";
		String newName = "";
		for(int i=name.length()-1; i>=0; i--) {
			newName = newName+name.charAt(i);
		}
		
		if(name.equalsIgnoreCase(newName)) {
			System.out.println("Palindrome");
		}
		else System.out.println("No it is not");

	}

}
