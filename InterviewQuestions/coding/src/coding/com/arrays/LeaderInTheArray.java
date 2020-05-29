package coding.com.arrays;

public class LeaderInTheArray {

	public static void main(String[] args) {
		int array[]= { 16,17,4,3,5,2}; // 17 5 2
		findLeader(array,array.length);
	}

	private static void findLeader(int[] array, int length) {
	int max = array[length-1];
		System.out.print(max+" ");
		for(int i = length-2;i>=0;i--) {
			if(array[i]>max) {
				max=array[i];
				System.out.print(max+" ");
			}
		}
	}

}
