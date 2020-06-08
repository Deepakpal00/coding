package coding.com.arrays;

public class SearchElementInSortedAndRotared {

	public static void main(String[] args) {
		int array[] = new int[] { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
		// 0 1 2 3 4 5 6 7 8
		int key = 10;

		searchForKey(array, key, array.length);

	}

	private static void searchForKey(int[] array, int key, int length) {
		int left = 0, right = length - 1;
		while (left <= right) {
			int mid = (left + right) >> 1;
			mid = (left + right) / 2;
			System.out.println(" l " + array[left] + " mid " + array[mid] + " right " + array[right]);
			if (array[mid] == key) {
				System.out.println(key +" is found at position  : " + mid);
			}

			if (array[left] < array[mid]) {

				if (key >= array[left] && key <= array[mid]) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			} else {
				if (key >= array[mid] && key <= array[right]) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}
		}

	}

}
