package com.selenium.javapractice;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] a = {"One","Two","Three","Four","Five"};
		List li = Arrays.asList(a);		//this will not work for int[].. so use li.add method
		
		System.out.println(li);
		

	}

}
