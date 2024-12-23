package com.selenium.JavaStreams;

import java.util.ArrayList;

public class UseOfFilterMethod {

	public static void main(String[] args) {

		ArrayList<String> li = new ArrayList<>();
		li.add("Ragav");
		li.add("Ragaven");
		li.add("Sharan");
		li.add("Sharanya");
		li.add("Nikki");
		li.add("Niharika");
		
		//want to print the names starts with letter N
		//li.stream().filter(s->s.startsWith("N")).forEach(s->System.out.println(s));
		
		ArrayList<Integer> li1 = new ArrayList<>();
		li1.add(10);
		li1.add(30);
		li1.add(50);
		li1.add(20);
		li1.add(40);
		li1.add(60);
		
		//want to print the names twice
		//li1.stream().sorted().map(s->s.)
		
		//get the count of element occurence after filter. count can be used directly on stream without filter too
		long c = li.stream().filter(s->s.startsWith("S")).count();
		//System.out.println("The element that starts with letter s is "+c);
		
		//to print first element from the filtered list. change limit(1) to print only first
		//li.stream().filter(s->s.endsWith("a")).limit(2).forEach(s->System.out.println(s));
	}

}
