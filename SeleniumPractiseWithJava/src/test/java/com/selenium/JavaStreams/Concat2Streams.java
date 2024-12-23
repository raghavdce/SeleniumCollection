package com.selenium.JavaStreams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Concat2Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> li = new ArrayList<>();
		li.add("Niharika");
		li.add("Ragaven");
		li.add("Sharan");
		ArrayList<String> li1 = new ArrayList<>();
		li1.add("Niharika");
		li1.add("Ragaven");
		li1.add("Sharan");
		
		Stream<String> newList = Stream.concat(li.stream(), li1.stream());
		

	}

}
