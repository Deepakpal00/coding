package coding.com.arrays;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class UnionAndIntersectionOfTwoSortedArray {

	public static void main(String[] args) {
		int firstArray[] = { 1, 3, 4, 5, 7 };
		int secondArray[] = { 2, 3, 5, 6 };

		 findIntersectionAndUnionUsingCollections(firstArray, secondArray);
		findIntersectionAndUnionUsingWhileLoop(firstArray, secondArray);

	}

	private static void findIntersectionAndUnionUsingWhileLoop(int[] firstArray, int[] secondArray) {

		 findUnion(firstArray, secondArray, firstArray.length, secondArray.length);
		findIntersection(firstArray, secondArray, firstArray.length, secondArray.length);

	}

	private static void findUnion(int[] firstArray, int[] secondArray, int firstArrayLength, int secondArrayLength) {
		int firstArrayPointer = 0;
		int secondArrayPointer = 0;
		System.out.println("Union ..");
		while (firstArrayPointer < firstArrayLength && secondArrayPointer < secondArrayLength) {
			if (firstArray[firstArrayPointer] < secondArray[secondArrayPointer]) {
				System.out.print(firstArray[firstArrayPointer] + " ");
				firstArrayPointer++;
			} else if (firstArray[firstArrayPointer] > secondArray[secondArrayPointer]) {
				System.out.print(secondArray[secondArrayPointer] + " ");
				secondArrayPointer++;
			} else {
				System.out.print(firstArray[firstArrayPointer] + " ");
				firstArrayPointer++;
				secondArrayPointer++;
			}
		}

		if (firstArrayPointer < firstArrayLength) {
			System.out.print(firstArray[firstArrayPointer]);
			firstArrayPointer++;
		}

		if (secondArrayPointer < secondArrayLength) {
			System.out.print(secondArray[secondArrayPointer]);
			secondArrayPointer++;
		}

	}

	private static void findIntersection(int[] firstArray, int[] secondArray, int firstArrayLength,
			int secondArrayLength) {
		int firstArrayPointer = 0;
		int secondArrayPointer = 0;
		System.out.println();
		System.out.println("Intersection ..");
		while (firstArrayPointer < firstArrayLength && secondArrayPointer < secondArrayLength) {
			if (firstArray[firstArrayPointer] == secondArray[secondArrayPointer]) {
				System.out.print(firstArray[firstArrayPointer] + " ");
				firstArrayPointer++;
				secondArrayPointer++;

			} else if (firstArray[firstArrayPointer] < secondArray[secondArrayPointer]) {
				firstArrayPointer++;
			} else {
				secondArrayPointer++;
			}
		}
		

	}

	private static void findIntersectionAndUnionUsingCollections(int[] firstArray, int[] secondArray) {
		List<Integer> unionResult = new LinkedList<Integer>();
		List<Integer> intersectionResult = new LinkedList<Integer>();
		Set<Integer> set = new HashSet<Integer>();

		for (int i : firstArray) {
			if (set.add(i)) {
				unionResult.add(i);
			} else {
				intersectionResult.add(i);
			}
		}

		for (int i : secondArray) {
			if (set.add(i)) {
				unionResult.add(i);
			} else {
				intersectionResult.add(i);
			}
		}
		Collections.sort(unionResult);
		Collections.sort(intersectionResult);

		System.out.println("Union : " + unionResult);
		System.out.println("Intersection : " + intersectionResult);
	}

}
