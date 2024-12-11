package com.jktech.programs;


public class SecondLargestNumber {

	public static void main(String[] args) {

		int a[]= {2,1,3,5,6,6};
		
		int largest  = Integer.MIN_VALUE;
		int second  = Integer.MIN_VALUE;
		
		System.out.println(largest);
		
		// Find the largest element
	    for(int i = 0; i<a.length; i++)
	    {
	        largest = Math.max(largest, a[i]);
	    }
	 
	    // Find the second largest element
	    for(int i = 0; i < a.length; i++)
	    {
	        if (a[i] != largest)
	            second = Math.max(second, a[i]);
	    }
	    
	    System.out.println("The largest number is : "+largest);
	    System.out.println("The second largest number is : "+second);
	
}
}
