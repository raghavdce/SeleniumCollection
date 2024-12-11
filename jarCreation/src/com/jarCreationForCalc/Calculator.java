package com.jarCreationForCalc;


public class Calculator {

	public int add(int a, int b) {

		int sum = a+b;
		return sum;

	}
	
	public static void main (String args[]) {
		Calculator cal = new Calculator();
		System.out.println(cal.add(10, 20));
	}

}
