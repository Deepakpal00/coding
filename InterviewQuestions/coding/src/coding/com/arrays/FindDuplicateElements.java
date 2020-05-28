package coding.com.arrays;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElements {

	public static void main(String[] args) {
		int array[] = { 2, 4, 2, 3, 4, 1, 1 };
		firstApproachCheckDuplcate(array, array.length);
		secondApproachCheckDuplicate(array, array.length);

	}

	private static void secondApproachCheckDuplicate(int[] array, int length) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i : array) {
			if (set.add(i) == false) {
				System.out.println(i);
			}
		}

	}

	private static void firstApproachCheckDuplcate(int[] array, int length) {
		int newArray[] = array.clone();
		for (int i = 0; i < length; i++) {
			int commingValue = newArray[Math.abs(newArray[i])];
			if (newArray[Math.abs(newArray[i])] >= 0) {
				newArray[Math.abs(newArray[i])] = -newArray[Math.abs(newArray[i])];
			} else {
				System.out.println(newArray[i]);
			}
		}
	}

}
