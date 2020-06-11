package coding.com.arrays;

import java.util.Arrays;

public class EvenNumbersAtEvenIndexAndOddNumbersAtOddIndex {

	public static void main(String[] args) {
		int array[] = { 2, 5, 7, 8, 1, 6, 9 };

		rearrange(array, array.length);

	}

	private static void rearrange(int[] array, int length) {

		int evenIndex = 0;
		int oddIndex = 1;

		while (evenIndex < length && oddIndex < length) {
			while (evenIndex < length && array[evenIndex] % 2 == 0) {
				evenIndex += 2;
			}
			while (oddIndex < length && array[oddIndex] % 2 != 0) {
				oddIndex += 2;
			}

			if (evenIndex < length && oddIndex < length) {
				swap(array, evenIndex, oddIndex);
			}

		}
		System.out.println(Arrays.toString(array));

	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}

}
