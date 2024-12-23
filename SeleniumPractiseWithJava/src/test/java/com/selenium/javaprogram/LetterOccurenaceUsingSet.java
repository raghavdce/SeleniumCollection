package com.selenium.javaprogram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LetterOccurenaceUsingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Ragav Sharanya Niharika Ragav Sharanya Niharika Sharanya Niharika";
		String[] namearr = name.split(" ");
		
		
		HashMap<String, Integer> map = new HashMap<>();
		for(String word : namearr) {
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			}
			else {
				map.put(word, 1);
			}
		}
		
		
		Set<String> set = map.keySet();
		for(String word : set) {
			if(map.get(word)>1) {
				System.out.println(word +" is repated "+map.get(word));
			}
		}
		

	}

}
