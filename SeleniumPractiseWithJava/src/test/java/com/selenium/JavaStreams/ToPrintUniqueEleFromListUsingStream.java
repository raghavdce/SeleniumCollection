package com.selenium.JavaStreams;

import java.util.ArrayList;

public class ToPrintUniqueEleFromListUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> li = new ArrayList<>();
		li.add("Niharika");
		li.add("Ragaven");
		li.add("Sharan");
		li.add("Sharan");
		li.add("Sharan");
		
		li.stream().distinct().sorted().map(s -> s.toLowerCase()).forEach(s -> System.out.println(s));

	}

}
