package coding.com.arrays;

// https://www.youtube.com/watch?v=mj7N8pLCJ6w&list=PLtZXy3uciru5lqRh6_MIt3aV1UAyrPEdW&index=4

public class BuyAndSellStock {

	public static void main(String[] args) {
		int array[] = { 7, 1, 5, 3, 6, 4 };
		int result = findMaxProfit(array.length, array);
		System.out.println(result);
	}

	private static int findMaxProfit(int length, int[] array) {
		int min = Integer.MAX_VALUE;
		int profit = 0;

		for (int i = 0; i < length; i++) {
			if (array[i] < min) {
				min = array[i];
			} else {
				profit = Math.max(profit, array[i] - min);
			}
		}
		return profit;
	}

}
