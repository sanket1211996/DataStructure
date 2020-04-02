package test.linkedlist;

import builder.linkedlist.CircularDoublyLinkedList;

public class CircularDoublyLinkedListTest {

	public void run() {
		CircularDoublyLinkedList  circularDoublyLinkedList = new CircularDoublyLinkedList(1);
		circularDoublyLinkedList.addNode(2);
		circularDoublyLinkedList.addNode(4);
		circularDoublyLinkedList.addNode(5);
		circularDoublyLinkedList.addNode(6);
		
		System.out.println("\n Adding 1,2,4,5,6. Size: " + circularDoublyLinkedList.getCounter());
		circularDoublyLinkedList.printLinkedList();
		circularDoublyLinkedList.printReverseLinkedList();
		circularDoublyLinkedList.printLinkedListTwice();
		
		System.out.println("\n Adding 3 at 2rd index. Size: " + circularDoublyLinkedList.getCounter());
		circularDoublyLinkedList.addNode(3,2);
		circularDoublyLinkedList.printLinkedList();
		circularDoublyLinkedList.printReverseLinkedList();
		circularDoublyLinkedList.printLinkedListTwice();

		
		System.out.println("\n Remove StartNode. Size: " + circularDoublyLinkedList.getCounter());
		circularDoublyLinkedList.removeStartNode();
		circularDoublyLinkedList.printLinkedList();
		circularDoublyLinkedList.printReverseLinkedList();
		circularDoublyLinkedList.printLinkedListTwice();

		
		System.out.println("\n Remove EndNode. Size: " + circularDoublyLinkedList.getCounter());
		circularDoublyLinkedList.removeEndNode();
		circularDoublyLinkedList.printLinkedList();
		circularDoublyLinkedList.printReverseLinkedList();
		circularDoublyLinkedList.printLinkedListTwice();

		
		System.out.println("\n Remove Node at Index 2. Size: " + circularDoublyLinkedList.getCounter());
		circularDoublyLinkedList.removeNodeAt(2);
		circularDoublyLinkedList.printLinkedList();
		circularDoublyLinkedList.printReverseLinkedList();
		circularDoublyLinkedList.printLinkedListTwice();
		
		System.out.println("\n Searching Data Value 5 . Size: " + circularDoublyLinkedList.getCounter());
		circularDoublyLinkedList.search(5);
		circularDoublyLinkedList.printLinkedListTwice();
		
		System.out.println("\n Searching Data Value 7 . Size: " + circularDoublyLinkedList.getCounter());
		circularDoublyLinkedList.search(7);
		
		System.out.println("\n Removing remaining data " + circularDoublyLinkedList.getCounter());
		circularDoublyLinkedList.removeNodeAt(1);
		circularDoublyLinkedList.printLinkedList();
		circularDoublyLinkedList.printReverseLinkedList();
		circularDoublyLinkedList.printLinkedListTwice();
		
		circularDoublyLinkedList.removeNodeAt(1);
		circularDoublyLinkedList.printLinkedList();
		circularDoublyLinkedList.printReverseLinkedList();
		circularDoublyLinkedList.printLinkedListTwice();

		
		circularDoublyLinkedList.removeNodeAt(1);
		circularDoublyLinkedList.printLinkedList();
		circularDoublyLinkedList.printReverseLinkedList();
		circularDoublyLinkedList.printLinkedListTwice();

		
		circularDoublyLinkedList.removeNodeAt(0);
		circularDoublyLinkedList.printLinkedList();
		circularDoublyLinkedList.printReverseLinkedList();
		circularDoublyLinkedList.printLinkedListTwice();

		
	}
}
