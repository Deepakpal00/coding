package coding.com.arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int array[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
		RemoveDuplicates(array,array.length);
	}

	private static void RemoveDuplicates(int[] array, int length) {
		int count = 0;
		for(int i =0;i<length-1;i++) {
			if(array[i]!=array[i+1]) {
				array[count++] = array[i];
			}
		}
		array[count++] = array[length-1];
		print(array,count);

	}

	private static void print(int[] array, int count) {
for(int i=0;i<count;i++) {		
	System.out.println(array[i]+" ");
}
	}
	 


}
