package com.selenium.javaprogram;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 153; int temp;
		int sum=0;
		
		while(i>0) {
			temp = i%10;
			sum = sum+(temp*temp*temp);
			i=i/10;
			
		}
		System.out.println(sum);
		
		
		

	}

}
