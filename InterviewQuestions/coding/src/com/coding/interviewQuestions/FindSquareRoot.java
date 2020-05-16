package com.coding.interviewQuestions;

public class FindSquareRoot {
	public static int findSquareRoot(int number) {
		
		int l =1,r = number/2;
		while(l<=r) {
		int	result = (l+r)/2;
			
		
		if(result * result == number)
			return result;
			if(result*result<number)
				l = result+1;
			

			if(result*result>number)
				r = result-1;
		}
		return r;
	}

	public static void main(String[] args) {
		System.out.println(findSquareRoot(23));
	}

}
