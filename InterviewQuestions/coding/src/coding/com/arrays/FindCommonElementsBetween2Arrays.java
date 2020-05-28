package coding.com.arrays;

import java.util.HashSet;
import java.util.Set;

public class FindCommonElementsBetween2Arrays {

	public static void main(String[] args) {
		int firstArray [] = {10,30,50,70};
		int SecondArray [] = {20,10,40,60,50};
		
		findCommon(firstArray,SecondArray,firstArray.length,SecondArray.length);
	}

	private static void findCommon(int[] firstArray, int[] secondArray, int firstArrayLength, int secondArrayLength) {
		Set<Integer>set = new HashSet<Integer>();
		for(int i : firstArray) {
			set.add(i);
		}
		for(int i : secondArray) {
			if(set.add(i)==false) {
				System.out.println(i+" ");
			}
		}
		
	}

}
