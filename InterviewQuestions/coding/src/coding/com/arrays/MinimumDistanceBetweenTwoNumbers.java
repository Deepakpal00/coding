package coding.com.arrays;

public class MinimumDistanceBetweenTwoNumbers {

	public static void main(String[] args) {
		int array[] = { 2, 5, 3, 2, 4, 4, 2, 3 };
		findMinimumDistance(array, 3, 2);

	}

	private static void findMinimumDistance(int[] array, int x, int y) {
		boolean xFound = false;
		boolean yFound = false;
		int firstFound = 0;
		int secondFound = 0;
		int mindistance = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == x) {
				xFound = true;
				firstFound = i;
			}
			if (array[i] == y) {
				yFound = true;
				secondFound = i;
			}
			if (xFound && yFound) {
				mindistance = Math.min(mindistance, Math.abs(secondFound - firstFound));
			}
		}
		System.out.println(mindistance);

	}

}
