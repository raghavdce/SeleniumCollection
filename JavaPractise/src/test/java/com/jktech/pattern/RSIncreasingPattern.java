package com.jktech.pattern;

public class RSIncreasingPattern {

	public static void main(String[] args) {
		// When you add a space after *, it will become pyramid
		
		int n=5;
		
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}

