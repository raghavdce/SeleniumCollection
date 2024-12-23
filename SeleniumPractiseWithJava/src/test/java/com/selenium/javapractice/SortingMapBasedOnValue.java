package com.selenium.javapractice;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class SortingMapBasedOnValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<String, Integer> map = new HashMap<>();
			map.put("Two", 2);
			map.put("Three", 3);
			map.put("One", 1);
			map.put("Five", 5);
			map.put("Four", 4);
			
			List<Entry<String,Integer>> li = new LinkedList<Entry<String, Integer>>(map.entrySet());
			
			Collections.sort(li, new Comparator<Entry<String, Integer>>() {

				@Override
				public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
					return o1.getKey().compareTo(o2.getKey());
				}
			});
			
			for(Entry e:li) {
				System.out.println(e.getKey()+"-->"+e.getValue());
			}
	}

}
