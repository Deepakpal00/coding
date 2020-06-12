package coding.com.arrays;

// https://www.geeksforgeeks.org/shuffle-a-given-array-using-fisher-yates-shuffle-algorithm/


import java.util.Arrays;
import java.util.Random;

public class ShuffleAGivenArray {
	

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };
		shuffleArray(array, array.length);
	}

	private static void shuffleArray(int[] array, int length) {
		Random random = new Random();
		for (int i = length - 1; i > 0; i--) {
			
			int j = random.nextInt(i + 1);
			
			System.out.println("J is : "+j);
			
			int temp = array[i];
			array[i] = array[j];
			array[j]= temp;

		}
		System.out.println(Arrays.toString(array));

	}

}
