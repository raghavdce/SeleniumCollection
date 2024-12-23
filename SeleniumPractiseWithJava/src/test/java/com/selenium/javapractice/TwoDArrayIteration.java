package com.selenium.javapractice;

public class TwoDArrayIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = {{1,2,3,4},{5,6,7,8}, {23,24,25}};
		System.out.println(a[1][0]);
		
		//using for each
		
		for(int[] i: a) {
			for(int element : i) {
				System.out.print(element+" ");
			}
			
		}
		//using for loop
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
		}

	}

}
