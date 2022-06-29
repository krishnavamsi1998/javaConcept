package singleLinkedList;

import java.util.Stack;

public class SingleLinkedListOperations {

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	Node head = null;

	// O(n),O(1)
	void insertNode(int data) {

		Node newNode = new Node(data);

		if (head == null)
			head = newNode;
		else {
			Node tail = head;

			while (tail.next != null)
				tail = tail.next;

			tail.next = newNode;
		}

	}

	// O(1),O(1)
	void InsertAtFirstNode(int data) {

		Node newNode = new Node(data);

		if (head == null)
			head = newNode;
		else {
			newNode.next = head;
			head = newNode;
		}

	}
	// O(n/2),O(1)

	void insertAtMiddle(int data) {

		Node newNode = new Node(data);

		// if it has only one node insert at last
		if (length() == 1) {
			head.next = newNode;

		} else {
			int target = length() / 2;
			int c = 1;

			Node tail = head;

			while (target != c) {
				c++;
				tail = tail.next;
			}
			// means we have reached target position
			newNode.next = tail.next;
			tail.next = newNode;
		}

	}

	// O(n),O(1)

	void deleteLastNode() {

		// make sure linked list is not empty
		if (head != null) {

			if (head.next != null) {
				Node tail = head;
				while (tail.next.next != null)
					tail = tail.next;
				// this means we are at last but one node
				// need to make the next of it to null
				tail.next = null;
			} else
				// this means only one node is there
				head = null;

		}

	}

	// O(1),O(1)

	void deleteFirstNode() {

		// GC (garbage collector take cares of un rechable objects)

		if (head != null) {
			Node temp = head.next;
			head.next = null;
			head = temp;

		}

	}

	int length() {

		int c = 0;

		if (head == null)
			return 0;

		Node tail = head;

		while (tail != null) {
			c++;
			tail = tail.next;
		}

		return c;

	}
	// O(n),O(1)

	boolean search(int key) {
		if (head == null)
			return false;

		Node tail = head;

		while (tail != null) {
			if (tail.data == key)
				return true;
			tail = tail.next;

		}

		return false;

	}
	// O(n),O(1)

	void reverse() {

		Node prev = null;
		Node curr = head;
		Node next = head;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		// starting node will be previous
		head = prev;
		System.out.println(head.data);

	}
	// O(n),O(n)

	void reverseUsingStack() {

		Stack<Node> s = new Stack<>();

		Node tail = head;

		while (tail.next != null) {
			s.add(tail);
			tail = tail.next;
		}

		// now we are at last node
		head = tail;
		while (s.size() != 0) {

			tail.next = s.pop();
			tail = tail.next;
		}

		tail.next = null;

	}
	// O(n),O(1)

	void display() {

		System.out.println();

		if (head == null)
			System.out.println("linked list is empty ");
		else {
			Node tail = head;
			while (tail != null) {
				System.out.print(tail.data + "->");
				tail = tail.next;

			}
		}
		System.out.println();
	}

	public static void main(String[] args) {

		SingleLinkedListOperations list = new SingleLinkedListOperations();

		// inserting nodes with values from 1 to 5
		for (int i = 1; i <= 4; i++)
			list.insertNode(i);

		list.display();
		// list.InsertAtFirstNode(6);
		// list.InsertAtFirstNode(5);
		// System.out.println(list.length());

		// list.insertAtMiddle(6);
		// System.out.println(list.search(6));

		// list.reverse();

		list.reverseUsingStack();
		list.display();
		// list.deleteLastNode();

		// list.deleteFirstNode();
		// list.display();

	}
}
