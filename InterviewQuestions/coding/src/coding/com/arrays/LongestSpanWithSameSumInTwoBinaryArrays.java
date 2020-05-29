package coding.com.arrays;

public class LongestSpanWithSameSumInTwoBinaryArrays {

	public static void main(String[] args) {
		int[] firstArray = { 0, 1, 0, 1, 1, 1, 1 };
		int[] secondArray = { 1, 1, 1, 1, 1, 0, 1 };

		findLongestSpan(firstArray, secondArray);
	}

	private static void findLongestSpan(int[] firstArray, int[] secondArray) {
		int maxLength = 0;
		int length = firstArray.length;
		int firstSum, secondSum;
		for (int i = 0; i < length; i++) {
			firstSum = secondSum = 0;
			for (int j = i; j < length; j++) {
				firstSum += firstArray[j];
				secondSum += secondArray[j];

				if (firstSum == secondSum) {
					int len = j - i + 1;
					if (len > maxLength) {
						maxLength = len;
					}
				}
			}
		}
		System.out.println(maxLength);

	}

}
