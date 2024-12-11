package com.jktech.programs;
import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter a number");
		int num = scan.nextInt();
		int temp=0, sum=0, newNum=0;
		temp=num;
		while(num>0) {
			newNum=num%10;
			sum=sum*10+newNum;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("Palindrome");
		}
		else
			System.out.println("not a palindrome");
	}

}
