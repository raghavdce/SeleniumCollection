package com.jktech.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> hm = new HashMap<>();
		hm.put("two",2);
		hm.put("three",3);
		hm.put("one",1);
		hm.put("five",5);
		hm.put("four",4);
		
		List<Map.Entry<String, Integer>> li = new LinkedList<Map.Entry<String,Integer>>(hm.entrySet());
		Collections.sort(li, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		for (Map.Entry<String, Integer> e : li){
			System.out.println(e.getKey()+"-->"+e.getValue());
			
		}
		
	
	}

}


