package coding.com.arrays;

import java.util.Arrays;
import java.util.Collections;

public class KLargestElements {

	public static void main(String[] args) {
		Integer[]array = {12,8,5,9,10}; // 1 2
		
		int k = 3;
		KLargestElements(array,k);
	}

	private static void KLargestElements(Integer[] array, int k) {
		Arrays.sort(array, Collections.reverseOrder());
		for(int i=0;i<k;i++ ) {
			System.out.println(array[i]+" ");
		}
		
	}

}
