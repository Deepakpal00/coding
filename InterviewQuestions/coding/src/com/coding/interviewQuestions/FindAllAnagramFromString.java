package com.coding.interviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramFromString {

	private static void findAnagram(String s, String p) {
		List<Integer> result = new ArrayList<Integer>();
		int sumOfP = 0;
		for (int i = 0; i < p.length(); i++) {
			sumOfP += p.charAt(i);
		}
		int currentSum = 0;
		int j = -1;
		for (int i = 0; i < s.length(); i++) {
			j++;
			currentSum += s.charAt(i);

			if (j == 3) {
				if (currentSum == sumOfP) {
					result.add(i - 3);
					currentSum = currentSum - s.charAt(i - 3);
					j = j - 1;
				} else {
					currentSum = currentSum - s.charAt(i - 3);
					j = j - 1;
				}
			}

		}
		System.out.println(result);

	}

	public static void main(String[] args) {
		String s = "cbacebacabc";
		String p = "abcc";

		findAnagram(s, p);
	}

}
