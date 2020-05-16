package com.searching.sorting;

public class BubbleSorting {
	private static int array[] = { 2, 9, 3, 5, 8, 6 };

	private static int[] sorting(int[] array) {

		for (int i = 0; i <= array.length - 1; i++) {
			for (int j = i+1; j <= array.length - 1 - i; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i]= array[j];
					array[j]=temp;

				}
			}
		}

		return array;
	}

	public static void main(String[] args) {
		sorting(array);
		System.out.println(array.toString());
	}

}
