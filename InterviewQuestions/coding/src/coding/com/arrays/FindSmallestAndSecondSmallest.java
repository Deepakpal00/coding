package coding.com.arrays;

public class FindSmallestAndSecondSmallest {

	public static void main(String[] args) {
		
		int[]array = {12,8,5,9,10}; // 1 2
		
		findSmallestAndSecondSmallest(array,array.length);
	}

	private static void findSmallestAndSecondSmallest(int[] array, int length) {
		int smallest,secondSmallest;
		smallest=secondSmallest = Integer.MAX_VALUE;
		
		for(int i : array) {
			if(i<smallest) {
				secondSmallest = smallest;
				smallest = i;
				
			}else if(i<secondSmallest && i!= smallest) {
				secondSmallest = i;
			}
		}
	printResult(smallest,secondSmallest);
	}

	private static void printResult(int smallest, int secondSmallest) {
System.out.println("Smallest : "+smallest+" And second smallest : "+secondSmallest);		
	}

}
