package com.selenium.javaprogram;

public class MathsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String[] a = {"one", "two", "three", "four", "five"};
		
	
		
		for(int j=0; j< a.length; j++) {
			if(a[j++].length()%3==0) {
				continue;
			}
			System.out.println(a[j]);
			break;
		}
	}

}
