package com.coding.interviewQuestions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StocksPair {

	public static void main(String[] args) { // 10 20 20 10 10 30 50 10 20
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total number of stocks");
		int numberofStocks = sc.nextInt();
		System.out.println("enter the number of stocks in array");
		Integer stocks [] = new Integer[numberofStocks];
		
		for(int i =0;i<numberofStocks;i++) {
			stocks[i]=sc.nextInt();
		}
		
		Set<Integer> checkPair = new HashSet<Integer>();
		 int totalPairs =0;
		 
		 for(int i =0;i<numberofStocks;i++) {
			 if(!checkPair.contains(stocks[i])) {
				 checkPair.add(stocks[i]);
			 }
			 else {
				 totalPairs++;
				 checkPair.remove(stocks[i]);
			 }
		 }
		System.out.println("Total pairs are "+totalPairs);
		
	}

}
