package coding.com.arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 5 };

		findMissing(array, array.length);

	}

	private static void findMissing(int[] array, int arrayLength) {
		int totalSum = (arrayLength+1)*(arrayLength+2)/2;
		
		for(int i : array) 
			totalSum -= i;
		System.out.println(totalSum);

	}

}
