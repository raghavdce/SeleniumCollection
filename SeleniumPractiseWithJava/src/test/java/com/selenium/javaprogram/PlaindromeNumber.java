package com.selenium.javaprogram;

public class PlaindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2002;
		int sum = 0;
		int temp = i;

		while (i > 0) {
			sum = (sum * 10) + (i % 10);
			i = i / 10;
		}
		
		System.out.println(temp==sum);
		
	}

}
