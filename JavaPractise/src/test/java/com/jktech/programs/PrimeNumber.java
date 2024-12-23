package com.jktech.programs;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=12;
		int count=0;
		
		if(num>1) {
			
			for(int i=1;i<8;i++) {
				if(num%i==0) {
					count++;
				}
			}
			
			if(count>2) {
				System.out.println("Not a prime number");
			}
			else
				System.out.println("Prime Number");
			
			
		}
		else
			System.out.println("enter a number greater than 1");
		

	}

}
