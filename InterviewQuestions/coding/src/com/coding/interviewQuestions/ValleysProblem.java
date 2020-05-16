package com.coding.interviewQuestions;

import java.util.Scanner;

public class ValleysProblem {

	public static void main(String[] args) { // 8  UDDDUDUU
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of steps");
		int numberOfSteps = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the character string");

		String upDownString = sc.nextLine();
		boolean downSea = false;
		
		int valley = 0;
		int seaLevel = 0;
		
		for(int i =0;i<numberOfSteps;i++) {
			char ud = upDownString.charAt(i);
			if(ud == 'U') {
				seaLevel++;
			}else {
				seaLevel--;
			}
			if(!downSea && seaLevel<0) {
				valley++;
				downSea = true;
				
			}
			if(seaLevel>=0) {
				downSea = true;
			}
			
			
		}
		System.out.println(valley);
	}

}
