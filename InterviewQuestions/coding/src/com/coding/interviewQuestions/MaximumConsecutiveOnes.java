package com.coding.interviewQuestions;

//1 1 0 0 1 1 1 1 1   // 1 flip allow
public class MaximumConsecutiveOnes {

	public static void main(String[] args) {
		int array[] = { 1 ,1, 0 ,0 ,1 ,1 , 1 , 1,  1 };
		int length = array.length;

		findMax(array, length);
	}

	private static void findMax(int[] array, int length) {
		int count = 0;
		int chance = 1;
		int currentSum = 0;
		int maxSum = 0;

		for (int i = 0; i < length; i++) {

			if (array[i] == 1) {
				currentSum = ++count;
			}
			else if(array[i]==0 && chance==1) {
			currentSum = ++count;
			chance = 0;
			}
			else {
				chance = 1;
				count = 0;
				i = i-1;
			}
			maxSum = Math.max(currentSum, maxSum);
		}
		
		System.out.println(maxSum);

	}
	
	
}
