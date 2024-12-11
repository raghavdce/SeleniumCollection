package com.jktech.programs;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=0; int n2=1;
		System.out.print(n1+","+n2+",");
		for (int i=0;i<4;i++) {
			//0,1,1,2,3,5,8,13
			//1,2,1,2,1,2,1,2
			n1=n1+n2;
			n2=n1+n2;
			System.out.print(n1+","+n2+",");	
		
		}
		

	}

}
