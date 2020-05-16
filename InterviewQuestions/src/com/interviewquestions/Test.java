package com.interviewquestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		Integer a[] = { 5, 5, 4, 2 };
		int[] randomIntegers = { 1, 5, 4, 2, 8, 1, 8, 9, 9 };
		SortedSet<Integer> set = new TreeSet<Integer>();
		for (int i : randomIntegers) {
			set.add(i);
		}
		// Remove the maximum value; print the largest remaining item
		set.remove(set.last());
		System.out.println(set.last());

		System.out.println(set.size());
		System.out.println(set.remove(set.size() - 1));

		System.out.println(set);
	}

	
}
