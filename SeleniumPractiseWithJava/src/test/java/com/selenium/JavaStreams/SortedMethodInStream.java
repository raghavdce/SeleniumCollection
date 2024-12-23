package com.selenium.JavaStreams;

import java.util.stream.Stream;

public class SortedMethodInStream {

	public static void main(String[] args) {

		Stream.of("Ragav","Sharanya", "Niharika","Nainika").filter(s->s.length()>4)
		.sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		

	}

}
