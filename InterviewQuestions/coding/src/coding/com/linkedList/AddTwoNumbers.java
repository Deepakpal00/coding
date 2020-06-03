package coding.com.linkedList;

public class AddTwoNumbers { //(2 -> 4 -> 3) + (5 -> 6 -> 4)

	public static void main(String[] args) {
		ReverseList firstList = new ReverseList();
		ReverseList secondList = new ReverseList();
		int firstaAray[] = { 3,4,2 };
		for (int i : firstaAray) {
			firstList.insertAtBeg(i);
		}
		
		int secondArray[] = { 5,6,4 };
		for (int i : secondArray) {
			secondList.insertAtBeg(i);
		}
		 addTwoList(firstList,secondList);
	}

	private static void addTwoList(ReverseList firstList, ReverseList secondList) {
		Node newNode = new Node(0);
		
		ReverseList first = firstList;
		ReverseList second = secondList;
		
		while(first!=null || second!=null) {
			
			int firstElement = (first!=null)?first.data
		}
		
		
		
	}
}