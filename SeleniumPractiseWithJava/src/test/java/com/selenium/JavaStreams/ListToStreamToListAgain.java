package com.selenium.JavaStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListToStreamToListAgain {

	public static void main(String[] args) {

		ArrayList<String> li = new ArrayList<>();
		li.add("Niharika");
		li.add("Ragaven");
		li.add("Sharan");
		
		List<String> newList = li.stream().filter(s->s.length()>3).sorted().limit(2).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(newList.get(0));
		
		

	}

}
