package coding.com.hackerrank;

public class BitwiseOperatorExperiment {

	public static void main(String[] args) {
		bitWiseAnd();
		bitWiseLeftShift();

	}

	private static void bitWiseLeftShift() {
		int num = 10;
		System.out.println(10<<3);
		
	}

	private static void bitWiseAnd() {   //     1 0 1 0
		int num = 10;					//      0 0 0 1 
		if((num & 1)==1) {
			System.out.println("ODD");
		}else {
			System.out.println("EVEN");
		}
		//System.out.println((num & 1));
		
	}

	private static void bitWiseXOr() {
		// TODO Auto-generated method stub
		
	}

	private static void bitWiseOr() {
		// TODO Auto-generated method stub
		
	}

}
