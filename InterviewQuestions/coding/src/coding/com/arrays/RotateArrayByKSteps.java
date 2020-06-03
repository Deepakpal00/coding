package coding.com.arrays;

import java.util.Arrays;

public class RotateArrayByKSteps {

	public static void main(String[] args) {
		int array[] = new int[] { 1, 2, 3, 8, 9, 10 };
		System.out.println(Arrays.toString(array));
		int k = 3;
		int leng = array.length;
		k = k % leng;
		reverse(array, 0, leng - 1 - k);
		reverse(array, leng - k, leng - 1);
		reverse(array, 0, leng - 1);
		System.out.println(Arrays.toString(array));
	}

	private static void reverse(int[] array, int start, int end) {
		System.out.println(start + " " + end);
		while (start < end) {
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}

		System.out.println(Arrays.toString(array));
	}

}
