package com.coding.interviewQuestions;

 public class SnowTrapAfterSnowFall {

	public static void main(String[] args) {
		int array[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println(getTotalSnowFall(array, array.length));
	}

	private static int getTotalSnowFall(int[] array, int length) {
		if (length < 1)
			return 0;
		int totalSnow = 0;
		int maxLeft[] = new int[length];
		int maxRight[] = new int[length];
		int snow[] = new int[length];
		maxLeft[0] = array[0];
		for (int i = 1; i < length; i++) {
			maxLeft[i] = Math.max(maxLeft[i - 1], array[i]);
		}

		maxRight[length - 1] = array[length - 1];
		for (int i = length - 2; i >= 0; i--) {
			maxRight[i] = Math.max(maxRight[i + 1], array[i]);
		}

		for (int i = 0; i < length; i++) {
			snow[i] = Math.min(maxLeft[i], maxRight[i]) - array[i];
		}

		for (int i = 0; i < length; i++) {
			totalSnow = totalSnow + snow[i];
		}
		return totalSnow;

	}

}

