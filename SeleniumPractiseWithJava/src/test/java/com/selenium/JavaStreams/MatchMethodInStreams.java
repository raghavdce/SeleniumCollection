package com.selenium.JavaStreams;

import java.util.ArrayList;

public class MatchMethodInStreams {

	public static void main(String[] args) {

		ArrayList<String> li = new ArrayList<>();
		li.add("Niharika");
		li.add("Ragaven");
		li.add("Sharan");
		
		boolean flag = li.stream().anyMatch(s->s.equalsIgnoreCase("Niharika"));
		System.out.println(flag);

	}

}
