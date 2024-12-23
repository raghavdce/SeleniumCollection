package com.selenium.javaprogram;

import java.util.Arrays;

public class ArrayBubbleSort {

	public static void main(String[] args) {
		// It is as same as array sort

		int[] arr = { 1, 4, 2, 5, 3, 8, 6 };

		System.out.print("Before sort : " + Arrays.toString(arr) + "\n");

		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}

		System.out.print(Arrays.toString(arr) + " ");

	}

}
