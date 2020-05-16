package com.interviewquestions;

public class Maximum_Of_All_Subarrays_Of_Size_K {
	public static void findMaximum(int[] array, int length, int k) {
		for (int i = 0; i <= length - k; i++) {
			int max = array[i];
			for (int j = 1; j < k; j++) {
				if (array[i + j] > max) {
					max = array[i + j];
				}
			}
			System.out.print(max+" ");
		}
	}

	public static void main(String[] args) {
		int[] array = { 7, 2, 8, 1, 9, 6, 3, 4, 2, 9 };
		findMaximum(array, array.length, 3);
	}

}
