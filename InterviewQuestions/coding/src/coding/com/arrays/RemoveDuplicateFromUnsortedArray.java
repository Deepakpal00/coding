package coding.com.arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromUnsortedArray {

	public static void main(String[] args) {
		Integer array[] = {2,7,3,2,7,1,3};
		removeDplicateUsingSet(array,array.length);
	}

	private static void removeDplicateUsingSet(Integer[] array, int length) {
		
		Set<Integer> set = new LinkedHashSet<>(Arrays.asList(array));
		
		Integer resultArray[] = set.toArray(new Integer[] {});
		System.out.println(Arrays.toString(resultArray));
	}

}
