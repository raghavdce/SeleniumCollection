package com.jktech.programs;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortByValuesInHashmap {

	public static void main(String[] args) {

		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("one", 1);
		map.put("five", 5);
		map.put("three", 3);
		map.put("two", 2);
		map.put("four", 4);
		
		System.out.println("Before sorting the map : "+map);
		
		List<Entry<String,Integer>> list = new LinkedList<Entry<String,Integer>>(map.entrySet());
		Collections.sort(list, new Comparator<Entry<String,Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		/*
		 * for(Entry<String,Integer> item:list) {
		 * System.out.println("After sorting the map : "+item); }
		 */
		
		HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        System.out.println("After sorting the map : "+temp);
        

	}

}
