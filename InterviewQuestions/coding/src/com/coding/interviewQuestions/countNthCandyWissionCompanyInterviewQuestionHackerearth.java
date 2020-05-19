package com.coding.interviewQuestions;

import java.util.*;

public class countNthCandyWissionCompanyInterviewQuestionHackerearth {

	private static void result(Integer[] candie, int index, int sweetness, int k) {
// 2 5 4 7 3 - 4 5 6 8 3 - 3 4 5 6 8 // 4

		candie[index - 1] = sweetness;
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < candie.length; i++) {
			list.add(candie[i]);
		}
		Collections.sort(list);
		System.out.print(list.get(k - 1) + " ");

	}

	public static void main(String args[]) throws Exception {
		// Scanner
		Integer[] candies = { 2, 5, 4, 7, 3 };

		result(candies, 4, 8, 2);
		result(candies, 3, 6, 3);
		result(candies, 1, 4, 4);

	}
}