package com.jktech.programs;

public class CountOfUpperAndLowerCase {

	public static void main(String[] args) {
		// Ascii value of upper case is from 65 to 90 and for lower case is from 97 to
		// 122

		String name = "My Name is Ragavendran V";

		String upper = "";
		String lower = "";

	for (int i=0; i<name.length(); i++) {
		char ch = name.charAt(i);
		if(ch>='A' && ch<='Z') {
			upper = upper+ch;
		}
		else {
			lower = lower+ch;
		}
	}
	
	System.out.println("the count of upper case is : "+upper.length());
	System.out.println("the count of upper case is : "+(lower.replaceAll(" ", "")).length());

	}

}
