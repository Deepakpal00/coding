package coding.com.arrays;

import java.util.HashSet;
import java.util.Set;

public class NumberOccurringOddNumberOfTimes {

	public static void main(String[] args) {
		int array[]= {1,2,3,2,3,1,2};
		findNumberUsingHashSet(array,array.length);
		findNumberUsingXOR(array,array.length);

	}

	private static void findNumberUsingXOR(int[] array, int length) {
		int number = 0;
		for(int i :array) {
			number = number ^ i;
		}
		System.out.println(number);
		
	}

	private static void findNumberUsingHashSet(int[] array, int length) {
		Set<Integer> set = new HashSet<Integer>();
		
		
		for(int i : array) {
			if(set.add(i)) {
				set.add(i);
			}else {
				set.remove(i);
			}
		}
		System.out.println(set);
	}

}
