import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		int array[] = { 4, 5, 1, 2 };
		reverse(array, array.length);

	}

	private static void reverse(int[] array, int length) {
		int start = 0, end = length-1;
		while(start <=  end) {
			
			int temp = array[end];
			array[end] = array[start];
			array[start] = temp;
			start++;end--;
			
		}
		System.out.println(Arrays.toString(array));
		
	}

}
