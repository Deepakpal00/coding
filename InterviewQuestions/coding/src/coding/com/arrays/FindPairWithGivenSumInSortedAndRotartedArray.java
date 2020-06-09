package coding.com.arrays;

public class FindPairWithGivenSumInSortedAndRotartedArray {

	public static void main(String[] args) {
		int array[] = { 11, 15, 6, 8, 9, 10 }; // 2,4,6,8,10
		int givenSum = 16;

		int maxIndex = findMax(array, array.length);

		// System.out.println(array[max+1]);
		findPair(array, array.length, maxIndex, maxIndex + 1, givenSum);

		// System.out.println(max);

	}

	private static void findPair(int[] array, int length, int max, int small, int givenSum) {
		System.out.println("INSIDE");

		while (small != max) {

			if (array[max] + array[small] == givenSum) {
				System.out.println(array[max] + " + " + array[small]);
				break;
			} else if (array[max] + array[small] < givenSum) {
				//l = (l + 1) % n; 
				small = (small + 1) % length;
			} else {
				max = (length + max - 1) % length; 
			}
		}
	}

	private static int findMax(int[] array, int length) {

		if (length < 0) {
			return -1;
		}
		if (length == 0) {
			return 0;
		}

		int l = 0, r = length - 1;

		if (array[0] < array[r]) {
			return r;
		}

		while (l <= r) {
			int mid = (l + r) >> 2;
			if (array[mid] > array[mid + 1]) {
				return mid;
			}
			if (array[mid] < array[mid - 1]) {
				return mid - 1;
			}

			if (array[l] > array[mid]) {
				r = mid - 1;

			} else {
				l = mid + 1;
			}
		}

		return 0;
	}

}
