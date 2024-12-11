package com.jktech.pattern;

public class LSIncreasingPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//to print the numbers replace the * by row value here we have p/i as row 
		int k=5;
		for(int i=1,p=1;i<=k;i++,p++) {
			for(int j=1;j<=i;j++) {
				System.out.print(p+" ");
			}
			System.out.println();
		}

	}

}
