package coding.com.arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromUnsortedArray {

	public static void main(String[] args) {
		int array[] = {2,7,3,2,7,1,3};
		Integer arr[] = {2,7,3,2,7,1,3};
		removeDplicateUsingSet(arr,array.length);
		removeDplicateUsingStream(array,array.length);
	}

	private static void removeDplicateUsingStream(int[] array, int length) {
		int arr[] = Arrays.stream(array).distinct().toArray();
		
		System.out.println(Arrays.toString(arr));

	}

	private static void removeDplicateUsingSet(Integer[] array, int length) {
		
		Set<Integer> set = new LinkedHashSet<>(Arrays.asList(array));
		
		Integer resultArray[] = set.toArray(new Integer[] {});
		System.out.println(Arrays.toString(resultArray));
	}

}
