package com.jktech.programs;

public class LargestNumInArray {

	public static void main(String[] args) {
		// To find the smallest just change the if condition with < symbol

		int a[] = { 10, 6, 20, 4, 5, 20 };

		int max = 0;
		int second=0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		System.out.println(max);
		
		// this is to find the second largest number
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]!=max && a[i]>second) {
				second = a[i];
			}
		}

		System.out.println(second);
		
		

	}

}
