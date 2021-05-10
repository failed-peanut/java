package com.failedpeanut;

/*
 * Reverse a singly linked list
 * Example:
 Input : 1->2->3->4->NULL
 Output: 4->3->2->1->NULL
 */
public class ReverseSinglyLinkedList {

	Node head; // 'head' Node which always points to the starting of LinkedList
	Node tail; // 'tail' Node which points to the subsequent elements; basically Last element
				// in singly LinkedList

	public static void main(String[] args) {
		ReverseSinglyLinkedList rsll = new ReverseSinglyLinkedList();
		/* lets add data in to List */
		rsll.add(1);
		rsll.add(2);
		rsll.add(3);
		rsll.add(4);

		/* Display Data from LinkedList */
		rsll.display();

		/* Reverse the Linked List */
		// rsll.reverse();

		rsll.reverseRecursively();

		/* Display Data from LinkedList after reverse */
		rsll.display();

	}

	private void reverseRecursively() {
		// here we use recursive method to reverse the List

		Node current = head;
		Node prev = null;
		Node next = null;

		head = recursiveReverse(current, prev, next);
	}

	private Node recursiveReverse(Node current, Node prev, Node next) {
		if (null == current)
			return prev;

		next = current.next;
		current.next = prev;
		prev = current;
		current = next;

		return recursiveReverse(current, prev, next);
	}

	private void reverse() {
		// Assume we have this List: [1 | ]->[2 | ]->[3 | ]->[4 | ]->null
		// To reverse we need to change the links of each Node and 'head' should be
		// pointing to last Node.

		Node current = head;// [1 | ]
		// take two temp Nodes; we call it as next and prev initially both are null.
		Node next = null;
		Node prev = null;

		while (current != null) {
			// STEP-1 :'current' Node is head Node, so we assign head.next i.e, current.next
			// to 'next' Node for time being.
			next = current.next;// [2 | ]

			// STEP-2: As we saved current.next to the temp Node (next) we can remove link
			// from current.next and point it to null so that it will act as last Node of
			// our list.
			current.next = prev;// null<-[1 | ]

			// STEP-3: 'prev' Node is null so we need to make 'prev' Node as current Node/In
			// first iteration it will be 'head' Node
			prev = current;// null<-[1 | ]

			// STEP-4:jump to Next Node to change its link, so current node will be 'next'
			// Node
			current = next;// [2 | ]

			// STEP-5: Add all the above STEPS in while loop so that on each iteration the
			// same steps will be repeated.
		}
		// It's like use temp Nodes to change the links of each Node
		// At the end of the while loop the 'prev' Node will be pointing to Last Node,
		// so make it as 'head' Node
		head = prev;

	}

	private void display() {
		// As we already have 'head' Node reference to starting of LinkedList we can
		// easily iterate through List to display Data.

		Node current;
		current = head; // the reason why we use another Node is: if we use 'head' Node to iterate it
						// will not point to starting position once iteration is done.So, better to use
						// a 'temp' Node which points to head
		while (current != null) {
			System.out.println("Data is:" + current.data);
			current = current.next; // get the next node to print which will iterate through while till its null
		}

	}

	private void add(int i) {
		// we need to create links of Nodes which holds data in it.
		// There should be a 'head' Node which always points to the starting of
		// LinkedList- So better declare it at class level

		// STEP-1: create a Node
		Node node = new Node(i);// [1 | ]->null

		// STEP-2: check if its a new Node that we are going to append or head Node
		// (LinkedList is empty)
		if (null == head) {
			head = node; // since for first element we assign it to 'head' Node
			tail = node; // since there is only one element in the List we assign 'tail' Node as same as
							// 'head' Node
		}

		// STEP-3: if LinkedList already have data in it; i.e, 'head' Node is not null
		// then we need to link a new Node to 'head' Node
		// since we are using 'tail' Node here we can use it to assign a new Node when
		// List is Not empty.
		tail.next = node; // we need to link the Node to next Node where it will point & make the Node as
							// tail Node so that it will point to last element/Node.
		tail = node;
		// [1 | ]->[2 | ]->[3 | ]->[4 | ]->null
		// ^                          ^
		// HEAD                      TAIL
	}

	class Node {
		// create a custom class called Node which holds data and pointer to next Node.
		int data;
		Node next;

		// create simple Constructor which sets Data and initialize 'next' Node to null
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

}
