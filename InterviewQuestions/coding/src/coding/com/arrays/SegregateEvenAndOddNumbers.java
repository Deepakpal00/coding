package coding.com.arrays;

import java.util.Arrays;

public class SegregateEvenAndOddNumbers {

	public static void main(String[] args) {
		Integer array[] = { 1, 3, 2, 4, 7, 6, 9, 10 };

		Integer result[] = segregateEvenAndOdd(array, array.length);
		printArray(result);
	}

	private static void printArray(Integer[] result2) {
		System.out.println(Arrays.deepToString(result2));

	}

	private static Integer[] segregateEvenAndOdd(Integer[] array, int length) {

		int oddIndexMaintain = 0;
		int arrayIndex = 0;

		while (arrayIndex != length) {
			if (array[arrayIndex] % 2 == 0) {
				int temp = array[oddIndexMaintain];
				array[oddIndexMaintain] = array[arrayIndex];
				array[arrayIndex] = temp;
				oddIndexMaintain++;
			}
			arrayIndex++;

		}

		return array;

	}

}
