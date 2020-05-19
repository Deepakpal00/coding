package coding.com.linkedList;

public class NthToLast {
	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}

	}

	Node head = null;
	public void createNodeAtend(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}else {
			Node temp =   head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = newNode;
			
			
		}

	}
	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp= temp.next;
		}
	}

	public static void main(String[] args) {
		NthToLast n= new NthToLast();
		n.createNodeAtend(1);
		n.createNodeAtend(2);
		n.createNodeAtend(3);
		n.createNodeAtend(4);
		n.createNodeAtend(5);
		n.display();
}

}
