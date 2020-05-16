package com.coding.interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GradeProblem {

	public static Integer[] findGrades(Integer[] studentsArray) { // 4 - 73 67 38 33
		for (int i = 0; i < studentsArray.length; i++) {
			if (studentsArray[i] >= 38) {
				int multiOfFive = 5 - (studentsArray[i] % 5) + studentsArray[i];
				if (multiOfFive - studentsArray[i] < 3) {
					studentsArray[i] = multiOfFive;
				}
			}
		}

		return studentsArray;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students");
		int numberOfStudents = sc.nextInt();
		System.out.println("Enter students grades");
		Integer[] studentsArray = new Integer[numberOfStudents];
		for (int i = 0; i < numberOfStudents; i++) {
			studentsArray[i] = sc.nextInt();
		}
		Integer result[] = findGrades(studentsArray);
		
		/*
		 * for (int i = 0; i < result.length; i++) { System.out.println(result[i]); }
		 */
		List<Integer> list = Arrays.asList(result);
		list.forEach(System.out::println);
	}

}
