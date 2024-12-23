package com.selenium.javapractice;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This is similar to linked list but difference is that it will not accept heterogeneous obj.
		//but will maintain the insertion order (only if it is string) and allows duplicate element
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		//to add elements use either "add" or "offer" method and the difference is offer will 
		//return false
		pq.add(10);
		pq.offer(200);
		pq.add(100);
		pq.add(1);
		pq.add(0);
		
		System.out.println(pq);
		//pq.clear();		//--> to clear the value in the queue
		
		//to get the first head element from queue use either element or peek() and the difference is,
		//peek will return null if retrieval is failure
		
		//System.out.println(pq.element());		//return no such element exception when queue is empty
		//System.out.println(pq.peek());			//returns null when queue is empty
		
		System.out.println("Checking poll and remove method");
		
		//System.out.println(pq.poll());	//return null if it empty
		//System.out.println(pq);
		
		System.out.println(pq.remove());		//return no such element exception when it is empty
		System.out.println(pq);
		
		
		
		

	}

}
