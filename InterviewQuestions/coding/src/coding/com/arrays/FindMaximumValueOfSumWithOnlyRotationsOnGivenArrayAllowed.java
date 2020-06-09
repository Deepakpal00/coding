package coding.com.arrays;


// https://www.geeksforgeeks.org/find-maximum-value-of-sum-iarri-with-only-rotations-on-given-array-allowed/

import java.util.Arrays;

public class FindMaximumValueOfSumWithOnlyRotationsOnGivenArrayAllowed {

	public static void main(String[] args) {
		int array[] = { 1, 20, 2, 10 };
		// 20 1 10 2 // 2 10 1 20
		int arrayLength = array.length;
		int maxIndex = findMax(array, array.length);

		int totalRotationRequired = (array.length - maxIndex) - 1;

		rotateArray(array, arrayLength, 0, totalRotationRequired - 1);
		rotateArray(array, arrayLength, totalRotationRequired, arrayLength - 1);
		rotateArray(array, arrayLength, 0, arrayLength - 1);

		System.out.println(Arrays.toString(array));

		findMaximumValue(array, arrayLength);
	}

	private static void findMaximumValue(int[] array, int arrayLength) {
		int sum = 0;
		for (int i = arrayLength - 1; i >= 0; --i) {
			sum = sum + (i * array[i]);
		}
		System.out.println(sum);

	}

	private static void rotateArray(int[] array, int arrayLength, int start, int end) {
		while (start <= end) {
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;

		}

	}

	private static int findMax(int[] array, int length) {
		int max = Integer.MIN_VALUE;
		int index = 0;
		for (int i = 0; i < length; i++) {
			if (array[i] > max) {
				max = array[i];
				index++;

			}

		}
		return index - 1;
	}

}
