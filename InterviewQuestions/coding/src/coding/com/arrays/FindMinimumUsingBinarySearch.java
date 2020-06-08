package coding.com.arrays;

public class FindMinimumUsingBinarySearch {

	public static void main(String[] args) {
		int array[] = {5,1,2,3,4 };
		System.out.println(findMinimum(array, array.length));

	}

	private static int findMinimum(int[] array, int length) {
		if (length < 0) {
			return -1;
		}
		if (length == 0) {
			return array[0];
		}

		int l = 0, r = length - 1;
		
		if(array[0]<array[r]) {
			return array[0];
		}

		while (l <= r) {

			int mid = (l + r) / 2;
			if (array[mid] > array[mid + 1]) {
				return array[mid + 1];
			}
			if (array[mid] < array[mid - 1]) {
				return array[mid];
			}

			
			if (array[l] > array[mid]) {
				r = mid - 1;
			}else {
				l = mid + 1;
			}
		}

		return -1;

	}

}
