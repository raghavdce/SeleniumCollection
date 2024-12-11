package com.selenium.javapractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Ragav V");
		map.put(2, "Sharanya V");
		map.put(3, "Niharika R");
		map.put(1, "Ragavendran V");
		map.put(4, "Bujacko");

		System.out.println(map);

		System.out.println(map.containsKey(1));
		System.out.println(map.containsValue("Sharanya V"));

		System.out.println(map.get(4));
		System.out.println(map.isEmpty());

		// to get all the key in one go as set
		System.out.println(map.keySet());
		// to print all the keys separately
		for (int i : map.keySet()) {
			System.out.println(i);
		}
		// to get all values as a collection
		System.out.println(map.values());
		// to print all the keys separately
		for (String i : map.values()) {
			System.out.println(i);
		}

		System.out.println("To get values against keys");

		for (int i : map.keySet()) {
			System.out.println("The value for the key " + i + " is " + " -> " + map.get(i));
		}
		
		//to get the output as key value pair
		System.out.println(map.entrySet());
		
		//to iterate using entry set
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+ "  "+entry.getValue());
			
		}
		
		//to iterate map using iterator
		
		Set s = map.entrySet();
		
		Iterator it = s.iterator();
		while(it.hasNext()) {
			Map.Entry entry = (Entry) it.next();
			System.out.println(entry.getKey() +" "+ entry.getValue());
		}

	}

}
