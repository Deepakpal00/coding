package com.coding.interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupOfAnagrams {

	public static void main(String[] args) {

		String wordArr[] = { "cat", "dog", "tac", "god", "act" };
 		groupofAnagram(wordArr);
		
	}

	private static void groupofAnagram(String[] wordArr) {
		Map<String, ArrayList<String>> hashmap = new HashMap<>();
		for (int i = 0; i < wordArr.length; i++) {
			char[] charArray = wordArr[i].toCharArray();
			Arrays.sort(charArray);
			String s = new String(charArray);
			if (hashmap.containsKey(s)) {
				hashmap.get(s).add(wordArr[i]);

			} else {
				ArrayList<String> list = new ArrayList<String>();
				list.add(wordArr[i]);
				hashmap.put(s, list);
			}
		}
		printResult(hashmap);
	}

	private static void printResult(Map<String, ArrayList<String>> hashmap) {
		for(String s : hashmap.keySet()) {
		ArrayList<String> list = 	hashmap.get(s);
		if(list.size()>1) {
			System.out.println(list);
		}
			
		}

	}

}
