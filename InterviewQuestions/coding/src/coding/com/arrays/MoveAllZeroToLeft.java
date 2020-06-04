package coding.com.arrays;

import java.util.Arrays;

public class MoveAllZeroToLeft {

	public static void main(String[] args) {
		int array[] = { 0, 1, 2, 0, 3, 0 };
		swapOperation(array, array.length);
		swapotherMethod(array, array.length);
	}

	private static void swapotherMethod(int[] array, int length) {
		int maintainZeroNumber = 0;
		
		for(int i =0;i<length;i++) {
			if(array[i]!=0) {
				swap(i, maintainZeroNumber, array, length);
				maintainZeroNumber++;
			}
		}
		printArray(array, length);
		
	}

	private static void swapOperation(int[] array, int length) {
		int j;
		for (int i = 0; i < length; i++) {

			if (array[i] == 0) {
				j = findNonZero(i, array, length);
				if (j != 0) {
					swap(i, j, array, length);
				}
			}
		}
		printArray(array, length);

	}

	private static void printArray(int[] array, int length) {
		System.out.println(Arrays.toString(array));

	}

	private static int[] swap(int i, int j, int[] array, int length) {
		int temp;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;

		return array;

	}

	private static int findNonZero(int i, int[] array, int length) {
		for (int j = i; j < length; j++) {
			if (array[j] != 0) {
				return j;
			}
		}
		return 0;

	}

}
