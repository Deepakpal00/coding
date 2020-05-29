package coding.com.arrays;

import java.util.Arrays;

public class ReplaceEveryElementWithTheGreatestElementOnRightSide {

	public static void main(String[] args) {
		int array[] = { 16, 17, 4, 3, 5, 2 }; // 17 5 5 5 2 -1
		replacFunction(array, array.length);

	}

	private static void replacFunction(int[] array, int length) {
		int maxFromRight = array[length - 1];
		array[length - 1] = -1;
		int temp;
		for (int i = length - 2; i >= 0; --i) {
			temp = array[i];
			array[i] = maxFromRight;
			if (maxFromRight < temp) {
				maxFromRight = temp;
			}
		}
		System.out.println(Arrays.toString(array));
	}

}
