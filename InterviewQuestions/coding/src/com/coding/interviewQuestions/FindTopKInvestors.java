/**
 * 
 */
package com.coding.interviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author Deepak
 *
 */

/*
 * This is a user defined class INVESTORS
 */
class Investors {
	int id;
	String name;
	int netWorth;

	public Investors(int id, String name, int netWorth) {
		this.id = id;
		this.name = name;
		this.netWorth = netWorth;
	}

	@Override
	public String toString() {
		return "Investors [id=" + id + ", name=" + name + ", netWorth=" + netWorth + "]";
	}

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public int getNetWorth() {
		return netWorth;
	}

	private void setNetWorth(int netWorth) {
		this.netWorth = netWorth;
	}

}

public class FindTopKInvestors {
	// this is a ArrayList used to store the User defined Object's

	static List<Investors> investorsList = new ArrayList<Investors>();

	// this method is used to add the values into Investor object

	private static void addValues(int id[], String name[], int netWorth[]) {
		// List<Investors> investorsList = new ArrayList<Investors>();

		for (int i = 0; i < id.length; i++) {

			investorsList.add(new Investors(id[i], name[i], netWorth[i]));
		}

	}

	// this method is used for finding the top k investors

	private static List<Investors> findTopKInvestors(int k) {

		List<Investors> resultList = new ArrayList<Investors>();
		// Used priority Queue to implement the min heap

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (int i = 0; i < k; i++) {
			pq.add(investorsList.get(i).getNetWorth());
		}

		for (int i = k; i < investorsList.size(); i++) {
			if (investorsList.get(i).getNetWorth() > pq.peek()) {
				pq.poll();
				pq.add(investorsList.get(i).getNetWorth());
			}
		}

		int count = 0;
		int j = 0;
		while (true) {
			if (count == k) {
				break;
			} else if (pq.peek() == investorsList.get(j).getNetWorth()) {
				resultList.add(investorsList.get(j));
				pq.poll();
				investorsList.remove(j);
				j = 0;
				count++;

			} else {
				j++;
			}

		}
		return resultList;
	}

	public static void main(String[] args) {
		int id[] = { 1, 2, 3, 4, 5 };
		String name[] = { "A", "B", "C", "D", "E" };
		int netWorth[] = { 2000, 25, 100, 50, 300 };
		int k = 10;

		if (k < investorsList.size()) {
			FindTopKInvestors.addValues(id, name, netWorth);
			List<Investors> result = findTopKInvestors(k);
			printResultList(result);
		} else {
			System.out.println("K value must be lower than number of Investors Object");
		}

	}

	// for printing the result
	private static void printResultList(List<Investors> result) {
		for (Investors investors : result) {
			System.out.println(investors.getName());
		}

	}

}
