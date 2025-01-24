package com.selenium.javaprogram;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,30,82,60,9,43};
		
		int max=0, secondmax = 0;
		
		for(int i=0;i<a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
		

		for(int i=0;i<a.length; i++) {
			if(a[i]>secondmax && !(a[i]==max)) {
				secondmax=a[i];
			}
		}
		System.out.println(secondmax);
		
	}

}
