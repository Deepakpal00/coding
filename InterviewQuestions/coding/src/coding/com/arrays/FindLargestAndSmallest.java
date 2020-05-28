package coding.com.arrays;

public class FindLargestAndSmallest {

	public static void main(String[] args) {
		Integer array[] = { 1, 200, 30, 1, 50 };
		
		findLargestAndSmallest(array, array.length);
	}

	private static void findLargestAndSmallest(Integer[] array, int length) {
		Integer min = Integer.MAX_VALUE;
		Integer max = Integer.MIN_VALUE;
		for(int currentEement : array) {
			if(currentEement>max) 
				max=currentEement;
			if(currentEement<min)
				min=currentEement;
		
		}
		System.out.println(min +" "+max);
	}

}
