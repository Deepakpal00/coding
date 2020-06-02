package coding.com.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindTwoNumOfTarget {

	public static void main(String[] args) {
		int array[] = {2, 7, 11, 15};
		int target = 22;
		
		int result []=findIndices(array,target);
		System.out.println(Arrays.toString(result));

	}

	private static int [] findIndices(int[] array, int target) {
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i =0;i<array.length;i++) {
			int ramaining= target-array[i];
			if(map.containsKey(ramaining)) {
				return new int[] { map.get(ramaining), i };
			
		}
			map.put(array[i], i);
		
	}
		return new int[0];
}
}