package com.coding.interviewQuestions;

import java.util.Arrays;

public class FindMaxProductOfThreeNumbres {

	public static void main(String[] args) {
		int array[]= {-2,9,-7,8,4}; 
		calculateProduct(array);
	}

	private static void calculateProduct(int[] array) {
		int max=Integer.MIN_VALUE;
		Arrays.sort(array);	
		max = Math.max(array[0] *array[1]*array[array.length-1],array[array.length-3]*array[array.length-2]*array[array.length-1]);
		System.out.println(max);

	}

}
