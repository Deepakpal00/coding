package coding.com.arrays;

import java.util.Arrays;

public class Segregate0sAnd1sInAnArray {

	public static void main(String[] args) {
		int array[]= {1 ,1 ,0 ,1 ,0 ,0 ,1 ,1 ,1 ,1};
		segregateArray(array,array.length);
	}

	private static void segregateArray(int[] arr, int length) {
		int left =0;
		int right = length-1;
		
		
        while (left < right) { 
            if (arr[left] == 1) { 
                // swap 
                arr[right] = arr[right]+ arr[left]; 
                arr[left] = arr[right]-arr[left]; 
                arr[right] = arr[right]-arr[left]; 
                right--; 
            } else { 
            	left++; 
            } 
        }
        System.out.println(Arrays.toString(arr));
		
	}

}
