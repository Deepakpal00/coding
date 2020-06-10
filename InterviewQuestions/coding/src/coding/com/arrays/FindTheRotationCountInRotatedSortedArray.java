package coding.com.arrays;
// https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/

public class FindTheRotationCountInRotatedSortedArray {

	public static void main(String[] args) {
		int array[] = new int[] { 15, 18, 2, 3, 6, 12 };
		System.out.println(findTheRotation(array, array.length));

	}
// 3 4 5 1 2 
	private static int findTheRotation(int[] array, int length) {

		int left = 0, right = length - 1;
		
		if(array[left] < array[right]) {
			return left;
		}

		while (left <= right) {

			int mid = (left + right) / 2;

		
			
			if ( array[mid] < array[mid -1]) {
				return mid;
			}
			if ( array[mid] > array[mid +1]) {
				return mid + 1;
			}
			
			if(array[mid]>array[right] ) {
				left = mid + 1;
				
				
				
			}else {
				right = mid -1;
			}
		}

		return 0;

	}

}
