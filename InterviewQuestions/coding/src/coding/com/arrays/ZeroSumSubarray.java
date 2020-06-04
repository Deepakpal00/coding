package coding.com.arrays;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class ZeroSumSubarray {

	public static void main(String[] args) {
		int array [] = {1,2,-5,1,2,-1};
		
		int result []=findSubarray(array,array.length);
		System.out.println(Arrays.toString(result));

	}

	private static int [] findSubarray(int[] array, int length) {
		
																					Map<Integer,Integer> sums = new LinkedHashMap<>();
		int sum =0;
		
		for(int i =0;i<length;i++) {
			Integer oldIndex = sums.get(sum);
			if(oldIndex==null) {
				sums.put(sum,i);
				sum +=array[i]; 
			}else {
				return Arrays.copyOfRange(array, oldIndex, i);
			}
		}
		return null;
	}

}
