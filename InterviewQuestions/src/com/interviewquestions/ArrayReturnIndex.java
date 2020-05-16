package com.interviewquestions;

public class ArrayReturnIndex {
	final static int array[] = { 1, 1, 1, 1, 1, 1, 1 };

	public static void binarySearch(int array[], int searchNumber) {
		int size = array.length;
		int left = 0, right = size - 1;

		while (left <= right) {
			int mid = (left + right) / 2;
			if (array[mid] == searchNumber) {

				if (array[mid - 1] == searchNumber) {
					for (int i = mid; i >= 0; i--) {
						if (array[i] != searchNumber) {
							left = i+1;
							break;
						}
					}
				}
				if (array[mid + 1] == searchNumber) {
					for (int j = mid+1; j <= right; j++) {
						if (array[j] != searchNumber) {
							right = j-1;
							break;
						}
					}
				}
				if (array[mid + 1]!= searchNumber) {
					right = mid;
				}
				System.out.println(
						"Number is found at   " + left +" "+ right);
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
