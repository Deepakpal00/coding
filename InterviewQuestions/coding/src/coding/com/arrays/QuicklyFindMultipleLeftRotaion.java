package coding.com.arrays;

// https://www.geeksforgeeks.org/quickly-find-multiple-left-rotations-of-an-array/

public class QuicklyFindMultipleLeftRotaion {

	public static void main(String[] args) {
		int array[] = { 1, 3, 5, 7, 9 }; // 5 7 9 1 3
		int n = array.length;

		int k = 2;
		leftRotate(array, n, k);
		System.out.println();

		k = 3;
		leftRotate(array, n, k);
		System.out.println();

		k = 4;
		leftRotate(array, n, k);
		System.out.println();
	}

	private static void leftRotate(int[] array, int n, int k) {
		
		for(int i = k; i < n+k;i++) {
			System.out.print(array[i % n] + " ");
		}

	}

}
