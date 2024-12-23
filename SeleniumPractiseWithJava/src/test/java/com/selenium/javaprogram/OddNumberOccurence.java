package com.selenium.javaprogram;

public class OddNumberOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 222222;
		int count=0; int temp = 0;
		
		while(i>0) {
			temp = i%10;
			if(temp%2 == 0) {
				count++;
			}
			i=i/10;
		}
		System.out.println("even number occurence is :"+count);

	}

}
