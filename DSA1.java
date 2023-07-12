package Ass13;

public class DSA1 {

	class Node {
		int data;
		Node previous;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	// Represent the head and tail of the doubly linked list
	Node head, tail = null;
	int count = 0;

	// addNode() will add a node to the list
	public void addNode(int data) {
		// Create a new node
		Node newNode = new Node(data);

		// If list is empty
		if (head == null) {
			// Both head and tail will point to newNode
			head = tail = newNode;
			// head's previous will point to null
			head.previous = null;
			// tail's next will point to null, as it is the last node of the list
			tail.next = null;
		} else {
			// newNode will be added after tail such that tail's next will point to newNode
			tail.next = newNode;
			// newNode's previous will point to tail
			newNode.previous = tail;
			// newNode will become new tail
			tail = newNode;
			// As it is last node, tail's next will point to null
			tail.next = null;
		}
		count++;
	}

	public void display() {
		// Node current will point to head
		Node current = head;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of doubly linked list: ");
		while (current != null) {
			// Prints each node by incrementing the pointer.

			System.out.print(current.data + " ");
			current = current.next;
		}

	}

	public static DSA1 modify(DSA1 l1, DSA1 l2) {
		Node current1 = l1.head;
		Node current2 = l2.head;
		Node prev = null;
		;
		if (l1.head == null || l2.head == null) {
			System.out.println("List is empty");
			return null;
		}

		DSA1 t = new DSA1();
		while (current1 != null && current2 != null) {

			if (current1.data > current2.data) {
				t.addNode(current1.data);
			} else {
				t.addNode(current2.data);
			}
			current1 = current1.next;
			current2 = current2.next;

		}
		return t;
	}

	public static void main(String[] args) {

		DSA1 dList = new DSA1();
		// Add nodes to the list
		dList.addNode(1);
		dList.addNode(2);
		dList.addNode(3);
		dList.addNode(4);
		dList.addNode(5);
		DSA1 dList2 = new DSA1();
		dList2.addNode(7);
		dList2.addNode(8);
		dList2.addNode(9);
		dList2.addNode(10);
		dList2.addNode(11);
		DSA1 modify = modify(dList, dList2);
		modify.display();
		// Displays the nodes present in the list
		
	}
}
