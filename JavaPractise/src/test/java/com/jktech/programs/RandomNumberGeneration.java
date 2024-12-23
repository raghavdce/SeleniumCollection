package com.jktech.programs;

import java.util.Random;

public class RandomNumberGeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		System.out.println(rand.nextInt(13));
		
		//method 2
		System.out.println(Math.random());
		
		System.out.println(Math.min(10, 4));	
		}
	

}
