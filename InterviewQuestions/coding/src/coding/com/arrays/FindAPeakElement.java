package coding.com.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindAPeakElement {

	public static void main(String[] args) {
		int array[] = {10,20,30,40,50};
		findPeak(array,array.length);
	}

	private static void findPeak(int[] array, int length) {
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i =1;i<length-1;++i) {
			if(array[i-1]<array[i] && array[i]>array[i+1]) {
				list.add(array[i]);
				i++;
			}
		}
		if(array[0]>array[1]) {
			list.add(array[0]);
		}if(list.isEmpty() && array[length-1]>array[length-2])
		{
			list.add(array[length-1]);
		}
		System.out.println(list);
	}

}
