package com.searching.sorting;

public class BinarySearch {
	final static int array[] = { 1, 1, 1, 1, 1, 1, 1 };

	public static void binarySearch(int array[], int searchNumber) {
		int size = array.length;
		int left = 0, right = size - 1;

		while (left <= right) {
			int mid = (left + right) / 2;
			if (array[mid] == searchNumber) {	
				System.out.println(	"Number is found");
				break;
			} else if (searchNumber > array[mid]) {
				left = mid + 1;
			} else if (searchNumber < array[mid]) {
				right = mid - 1;
			}
		}
	}

	public static void main(String[] args) {
		binarySearch(array, 1);

	}
}
