package coding.com.arrays;

// https://www.geeksforgeeks.org/find-divisors-natural-number-set-1/

public class FindAllDivisors {

	public static void main(String[] args) {
		int number = 20;

		findDivisor(number);

	}

	private static void findDivisor(int number) {
		int count = 0;
		for (int i = 1; i < Math.sqrt(number); ++i) {
			double sqrRoot = Math.sqrt(number);

			if (number % i == 0) {
				if (number / i == i) {
					count = count + 1;
					System.out.printf("%d ", i);
				} else {
					count = count + 2;
					System.out.printf("%d %d ", i, number / i);
				}
			}

		}
		System.out.println(" ");
		System.out.println("Total count is : " + count);

	}

}
