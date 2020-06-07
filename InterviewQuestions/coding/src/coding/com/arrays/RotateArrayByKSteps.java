package coding.com.arrays;

import java.util.Arrays;
// right shift
public class RotateArrayByKSteps {

	public static void main(String[] args) {
		int array[] = new int[] { 1, 2, 3, 4,5,6,7}; // 2 1 7 6 5 4 3 // 3 4 5 6 7 1 2
		System.out.println(Arrays.toString(array));
		int k = 2;
		int leng = array.length;
		k = k % leng;
		//reverse(array, 0, leng - 1 - k);
//		reverse(array, leng - k, leng - 1);

		reverse(array, 0 ,k-1);
		reverse(array, k, leng-1);


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
