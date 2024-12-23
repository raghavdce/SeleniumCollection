package com.selenium.JavaStreams;

import java.util.stream.Stream;

public class UseOfMapMethodInStreams {

	public static void main(String[] args) {
		// map is used to manipulate the filtered stream
		
		Stream.of("Ragav","Sharanya", "NIharika").filter(s->!(s.contains("NIharika")))
		.map(s->s.toUpperCase()).forEach(s->System.out.println(s));

	}

}
