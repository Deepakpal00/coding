package coding.com.arrays;

import java.util.Arrays;
import java.util.Collections;

// https://www.geeksforgeeks.org/sort-even-numbers-ascending-order-sort-odd-numbers-descending-order/

public class SortAllEvenNumbersInAscendingOrderAndThenSortAllOddNumbersInDescendingOrder {

	public static void main(String[] args) {
		Integer[] array = { 1, 3, 2, 7, 5, 4 };
		int lastOddCount = sortArray(array, array.length);
		Integer[] result = arrangArray(array, lastOddCount);

		int[] secondArray = { 0, 4, 5, 3, 7, 2, 1 };
		AnotherSolution(secondArray, array.length);
		// System.out.println(Arrays.deepToString(result));

	}

	static void AnotherSolution(int arr[], int n) {
		// Make all odd numbers negative
		for (int i = 0; i < n; i++)
			if ((arr[i] & 1) != 0) // Check for odd
				arr[i] *= -1;

		// Sort all numbers
		Arrays.sort(arr);

		// Retaining original array
		for (int i = 0; i < n; i++)
			if ((arr[i] & 1) != 0)
				arr[i] *= -1;

		System.out.println(Arrays.toString(arr));
	}

	private static Integer[] arrangArray(Integer[] array, int lastOddCount) {

		Arrays.sort(array, 0, lastOddCount, Collections.reverseOrder());
		Arrays.sort(array, lastOddCount, array.length);

		return array;
	}

	private static int sortArray(Integer[] array, int length) {

		int left = 0, right = length - 1;
		int oddCount = 0;

		while (left < right) {

			while (array[left] % 2 != 0) {
				left++;
				oddCount++;
			}

			while (left < right && array[right] % 2 == 0) {
				right--;
			}

			if (left < right) {
				int temp = array[left];
				array[left] = array[right];
				array[right] = temp;
			}
		}
		return oddCount;
	}

}




