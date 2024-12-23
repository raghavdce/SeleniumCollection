package com.jktech.programs;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=1000,b=200,c=500;
		
		if(a>b && a> c) {
			System.out.println("The largest is a");
		}
		else if(b>c && b>a) {
			System.out.println("The laragest is b");
		}
		else
		{
			System.out.println("C");
		}
		
		int largest = a>b?a:b;
		largest = largest>c?largest:c;
		
		System.out.println(largest);
		

	}

}
