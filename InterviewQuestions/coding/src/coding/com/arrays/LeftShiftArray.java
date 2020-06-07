package coding.com.arrays;

import java.util.Arrays;

public class LeftShiftArray {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6, 7 }; // 3,4,5,6,7,1,2
		int rotations = 2;
		rotateLeft(array, 0, rotations - 1);
		rotateLeft(array, rotations , array.length-1);
		rotateLeft(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));

	}

	private static void rotateLeft(int[] array, int start, int end) {
		while (start < end) {
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;

		}
	}

}
