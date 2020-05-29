package coding.com.arrays;

import java.util.Arrays;

public class PythagoreanTriplet {

	public static void main(String[] args) {
		int array[] = { 3, 1, 4, 6, 5 };
		findTriplet(array, array.length);
	}

	private static void findTriplet(int[] array, int length) {
		int l = 0,r=0;
		for(int i =0;i<length;i++) {
			array[i] = array[i]*array[i];
		}
		Arrays.sort(array);
		for(int i=length-1;i>2;i--) {
;			l=0;
			r=i-1;
			while(l<r) {
				if(array[l]+array[r]==array[i]) {
					System.out.println(array[l]+" + "+array[r]+" = "+array[i]);
					break;
				}
				else {
					if(array[l]+array[r]<array[i]) {
						l++;
					}else {
						r--;
					}
				}
			}
			
		}
		
		

	}
}
