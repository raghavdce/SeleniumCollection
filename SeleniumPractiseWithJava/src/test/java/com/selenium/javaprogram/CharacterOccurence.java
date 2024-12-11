package com.selenium.javaprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharacterOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Ragavendran V";
		
		char[] name1 = name.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char newname : name1) {
			if(map.containsKey(newname)) {
				map.put(newname, map.get(newname)+1);
			}
			else {
				map.put(newname, 1);
			}
		}
		
		System.out.println(map);
		
		for(Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+ " --> "+entry.getValue());
			
		}

	}

}
