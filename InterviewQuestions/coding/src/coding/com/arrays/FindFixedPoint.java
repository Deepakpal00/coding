package coding.com.arrays;

public class FindFixedPoint {

	public static void main(String[] args) {
		int array []= {0,2,5,8,17};
		findFix(array,array.length);

	}

	private static void findFix(int[] array, int length) {
		int left = 0;
		int right = array.length-1;
	while(left<=right) {
		int mid = (left+right)/2;
		if(mid==array[mid]) {
			System.out.println(array[mid]);
			break;
		}else if(mid<array[mid]) {
			right = mid-1;
		}else if(mid>array[mid]) {
			left = mid+1;
		}
	}
		
	}

}
