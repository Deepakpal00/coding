package coding.com.arrays;

import java.util.*;
import java.util.HashSet;
import java.util.Set;

// https://www.geeksforgeeks.org/rearrange-array-arri/

public class RearrangeAnArraySuchThat {

	public static void main(String[] args) {
		Integer array[] = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };
		Integer[] resultArray = recplace(array, array.length);

		System.out.println(Arrays.toString(resultArray));

		Integer secondArray[] = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };
		Integer[] secondResultArray = usingSwapApproach(secondArray, secondArray.length);
		System.out.println(Arrays.toString(secondResultArray));
	}

	private static Integer[] usingSwapApproach(Integer[] secondArray, int length) {

		for (int i = 0; i < length;) {
			if (secondArray[i] >= 0 && secondArray[i] != i) {

				int temp = secondArray[secondArray[i]];

				secondArray[secondArray[i]] = secondArray[i];

				secondArray[i] = temp;

			} else {
				i++;
			}
		}

		return secondArray;
	}

	private static Integer[] recplace(Integer[] array, int length) {
		Set<Integer> set = new HashSet<>(Arrays.asList(array));

		for (int i = 0; i < length; i++) {

			if (set.contains(i)) {
				array[i] = i;

			} else {
				array[i] = -1;
			}
		}
		return array;
	}

}
