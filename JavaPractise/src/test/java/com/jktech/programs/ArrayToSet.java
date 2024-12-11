package com.jktech.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayToSet {

	public static void main(String[] args) {

		int a[] = { 2, 1, 3, 5, 6, 6 };
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		set.add(null);
		System.out.println(set);
		
		//Conversion of integer array to ArrayList using Arrays.asList

		int[] geeks = { 1, 2, 3, 4, 5 };
		List al = new ArrayList<>();
		//List al = Arrays.stream(geeks).boxed().collect(Collectors.toList());
		for(int i=0;i<geeks.length; i++) {
			al.add(geeks[i]);
			
		}

		System.out.println("Integer array to list is : " + al);

		//conversion of string array to list

		String[] name = { "Ragav", "Niha", "Sharan" };
		List all = Arrays.asList(name);
		System.out.println("String array to list is : " + all);

	}

}
