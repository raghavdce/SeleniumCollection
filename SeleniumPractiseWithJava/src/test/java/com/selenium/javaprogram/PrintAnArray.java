package com.selenium.javaprogram;

import java.util.Arrays;

public class PrintAnArray {

	public static void main(String[] args) {
		// To print an array without sorting
		int a[] = {2,1,4,3,6,5};
		
		System.out.println(Arrays.toString(a));
		
		String[][] deepArray = {{"John","Bob"}, {"America","Newzealand"}};
		System.out.println(Arrays.deepToString(deepArray));
		
		

	}

}
