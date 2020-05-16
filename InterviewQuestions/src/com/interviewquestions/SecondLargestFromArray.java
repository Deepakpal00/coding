package com.interviewquestions;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SecondLargestFromArray {

	public static void main(String[] args) {
		String inputArray[] = {};
		String result = findSeconfLargestFromArray(inputArray);
		System.out.println(result);

	}

	private static String findSeconfLargestFromArray(String[] inputArray) {
		if (checkEmpty(inputArray)) {
			return "-1";
		}
		if (checkAllSame(inputArray)) {
			return "-1";

		}
		SortedSet<BigInteger> set = new TreeSet<BigInteger>();
		for (String i : inputArray) {
			set.add(new BigInteger(i));
		}
		set.remove(set.last());
		return set.last().toString();
	}

	private static boolean checkEmpty(String[] arr) {
		if (arr.length != 0) {
			return false;
		}
		return true;
	}

	private static boolean checkAllSame(String[] array) {
		Set<String> s = new HashSet<>(Arrays.asList(array));
		return (s.size() == 1);
	}

}