package test.linkedlist;

import builder.linkedlist.DoublyLinkedList;

public class DoublyLinkedListTest {

	public void run() {
		DoublyLinkedList  doublyLinkedList = new DoublyLinkedList(1);
		doublyLinkedList.addNode(2);
		doublyLinkedList.addNode(4);
		doublyLinkedList.addNode(5);
		doublyLinkedList.addNode(6);
		
		System.out.println("Adding 1,2,4,5,6. Size: " + doublyLinkedList.getCounter());
		doublyLinkedList.printLinkedList();
		doublyLinkedList.printReverseLinkedList();
		
		System.out.println("Adding 3 at 2rd index. Size: " + doublyLinkedList.getCounter());
		doublyLinkedList.addNode(3,2);
		doublyLinkedList.printLinkedList();
		doublyLinkedList.printReverseLinkedList();

		
		System.out.println("Remove StartNode. Size: " + doublyLinkedList.getCounter());
		doublyLinkedList.removeStartNode();
		doublyLinkedList.printLinkedList();
		doublyLinkedList.printReverseLinkedList();

		
		System.out.println("Remove EndNode. Size: " + doublyLinkedList.getCounter());
		doublyLinkedList.removeEndNode();
		doublyLinkedList.printLinkedList();
		doublyLinkedList.printReverseLinkedList();

		
		System.out.println("Remove Node at Index 2. Size: " + doublyLinkedList.getCounter());
		doublyLinkedList.removeNodeAt(2);
		doublyLinkedList.printLinkedList();
		doublyLinkedList.printReverseLinkedList();
		
		System.out.println("Searching Data Value 5 . Size: " + doublyLinkedList.getCounter());
		doublyLinkedList.search(5);
		
		System.out.println("Searching Data Value 7 . Size: " + doublyLinkedList.getCounter());
		doublyLinkedList.search(7);
		
		System.out.println("Removing remaining data " + doublyLinkedList.getCounter());
		doublyLinkedList.removeNodeAt(1);
		doublyLinkedList.printLinkedList();
		doublyLinkedList.printReverseLinkedList();
		
		doublyLinkedList.removeNodeAt(1);
		doublyLinkedList.printLinkedList();
		doublyLinkedList.printReverseLinkedList();
		
		doublyLinkedList.removeNodeAt(1);
		doublyLinkedList.printLinkedList();
		doublyLinkedList.printReverseLinkedList();
		
		doublyLinkedList.removeNodeAt(0);
		doublyLinkedList.printLinkedList();
		doublyLinkedList.printReverseLinkedList();
		
	}
}
