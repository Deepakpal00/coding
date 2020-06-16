
package coding.com.sortingSearch;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int array[] = { 20, 10, 50, 40, 90 };
		merge(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
	}

	private static void merge(int[] array, int left, int right) {

		if (left >= right) {
			return;
		}
		int mid = (left + right) / 2;

		merge(array, left, mid);
		merge(array, mid + 1, right);
		mergesort(array, left, mid, right);

	}

	private static void mergesort(int[] array, int left, int mid, int right) {
		System.out.println(left + " " + mid + " " + right);
		int l = mid - left + 1, r = right - mid;

		int leftArray[] = new int[l];
		int rightArray[] = new int[r];

		for (int i = 0; i < l; i++) {
			leftArray[i] = array[left + i];
		}
		for (int j = 0; j < r; j++) {
			rightArray[j] = array[mid + j + 1];
		}
		int i = 0, j = 0, k = left;

		while (i < l && j < r) {
			if (leftArray[i] <= rightArray[j]) {
				array[k] = leftArray[i];
				i++;
			} else {
				array[k] = rightArray[j];
				j++;
			}
			k++;
		}

		while (i < l) {
			array[k] = leftArray[i];
			i++;
			k++;
		}

		while (j < r) {
			array[k] = rightArray[j];
			j++;
			k++;
		}

	}

}
