package coding.com.linkedList;

class Node {
	public Node(int data2) {
		this.data = data2;
	}

	int data;
	Node next;
}

public class ReverseList {
	private static Node head;

	public void insertAtBeg(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;

	}

	private void printList(Node head) {
		Node display = head;
		while (display != null) {
			System.out.print(display.data);
			display = display.next;
		}
		System.out.println();

	}

	public static void main(String[] args) {
		ReverseList reverseList = new ReverseList();
		int array[] = { 1, 2, 3, 2, 1 };
		for (int i : array) {
			reverseList.insertAtBeg(i);
		}
		reverseList.printList(head);

		reverseList.reverse();
		reverseList.findMid(head);
		

	}

	private void findMid(Node head) {
		Node temp = head;
		Node slow = head, fast = head;

 		while (fast.next!= null && fast.next.next != null ) {
			slow = slow.next;
			fast = fast.next.next;
			
		}

	}

	private void reverse() {
		Node p = head;
		Node pre = new Node(p.data);

		while (p.next != null) {
			Node temp = new Node(p.next.data);
			temp.next = pre;
			pre = temp;
			p = p.next;

		}
		printList(pre);

	}

}
