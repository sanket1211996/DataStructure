package test.linkedlist;

import builder.linkedlist.CircularSinglyLinkedList;

public class CircularSinglyLinkedListTest {

	public void run() {
		CircularSinglyLinkedList  circularSinglyLinkedList = new CircularSinglyLinkedList(1);
		circularSinglyLinkedList.addNode(2);
		circularSinglyLinkedList.addNode(4);
		circularSinglyLinkedList.addNode(5);
		circularSinglyLinkedList.addNode(6);
		
		System.out.println("Adding 1,2,4,5,6. Size: " + circularSinglyLinkedList.getCounter());
		circularSinglyLinkedList.printLinkedList();
		System.out.println("Adding 3 at 3rd index");
		
		System.out.println("Adding 3 at 3rd index. Size: " + circularSinglyLinkedList.getCounter());
		circularSinglyLinkedList.addNode(3,3);
		circularSinglyLinkedList.printLinkedList();
		
		System.out.println("Remove StartNode. Size: " + circularSinglyLinkedList.getCounter());
		circularSinglyLinkedList.removeStartNode();
		circularSinglyLinkedList.printLinkedList();
		
		System.out.println("Remove EndNode. Size: " + circularSinglyLinkedList.getCounter());
		circularSinglyLinkedList.removeEndNode();
		circularSinglyLinkedList.printLinkedList();
		
		System.out.println("Remove Node at Index 2. Size: " + circularSinglyLinkedList.getCounter());
		circularSinglyLinkedList.removeIndexNode(2);
		circularSinglyLinkedList.printLinkedList();
		circularSinglyLinkedList.removeIndexNode(1);
		circularSinglyLinkedList.printLinkedList();
		
		circularSinglyLinkedList.removeIndexNode(1);
		circularSinglyLinkedList.printLinkedList();
		
		circularSinglyLinkedList.removeIndexNode(1);
		circularSinglyLinkedList.printLinkedList();
		
		circularSinglyLinkedList.removeIndexNode(0);
		circularSinglyLinkedList.printLinkedList();
		
	}
}
