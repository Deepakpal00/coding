package coding.com.linkedList;

 class LinkedList {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public void createList(int data) {// 3 2 1
		Node newNode = new Node(data); // 4
		Node temp = head;
		if (temp == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;

		}

	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
 }
	public class AddOneTOGivenLinkedList{
	public static void main(String[] args) { // 1 9 9 //
		LinkedList a = new LinkedList();
		a.createList(9);
		a.createList(9);
		a.createList(9);
		a.createList(1);
		a.display();


	}
	}
	


