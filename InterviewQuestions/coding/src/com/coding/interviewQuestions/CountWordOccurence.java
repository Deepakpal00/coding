package com.coding.interviewQuestions;

import java.util.Map;
import java.util.TreeMap;


import java.util.HashMap;
import java.util.LinkedHashMap;
public class CountWordOccurence {

	public static void main(String[] args) {
		String sen = "I am the only one I am the only one";
		countWord(sen);
	}

	private static void countWord(String sen) {
	String [] words = 	sen.split(" ");
	Map<String,Integer> map = new TreeMap<>();//new LinkedHashMap<>();
	for(String s : words) {
		if(map.containsKey(s)) {
			int val = map.get(s)+1;
			map.put(s, val);
		}else {
			map.put(s, 1);
		}
		
	}
	
	map.forEach((k,v)->{
	if(v >1)
		System.out.println(k+" "+v);
		
	});
		/*
		 * for(String s : map.keySet()) { System.out.println(s+ " "+map.get(s));
		 * 
		 * }
		 */
		
	}

}
