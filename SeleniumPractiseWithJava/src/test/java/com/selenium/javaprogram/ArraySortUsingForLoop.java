package com.selenium.javaprogram;

import java.util.Arrays;

public class ArraySortUsingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 4, 1, 2, 5, 3, 8, 6 };
		System.out.print("Before Sorting: ");
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.print(+a[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {		//if condition is changed, then o/p is desencding order
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}
		System.out.print("After Sorting: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(+a[i] + " ");
		}

	}

}
