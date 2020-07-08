package coding.com.sortingSearch;

import java.util.Arrays;

public class SelectionSort {
	static int array[] = { 38, 92, 9, 18, 6, 62, 13 };

	public static void main(String[] args) {

		for (int i = 0; i < array.length; i++) {
			int min = i;
			if(i==6) {
				System.out.println("");
			}
			for (int j = i + 1; j < array.length; j++) {
				if(array[min]>array[j]) {
					min=j;
				}
			}
			swap(i,min);

		}
		System.out.println(Arrays.toString(array));
	}

	private static void swap(int i, int min) {
		int temp = array[i];
		array[i]=array[min];
		array[min]=temp;
		
	}

}
