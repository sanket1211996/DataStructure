package test.linkedlist;

import builder.linkedlist.SinglyLinkedList;

public class SinglyLinkedListTest {

	public void run() {
		SinglyLinkedList  singlyLinkedList = new SinglyLinkedList(1);
		singlyLinkedList.addNode(2);
		singlyLinkedList.addNode(4);
		singlyLinkedList.addNode(5);
		singlyLinkedList.addNode(6);
		
		System.out.println("Adding 1,2,4,5,6. Size: " + SinglyLinkedList.getCounter());
		singlyLinkedList.printLinkedList();
		System.out.println("Adding 3 at 3rd index");
		
		System.out.println("Adding 3 at 3rd index. Size: " + SinglyLinkedList.getCounter());
		singlyLinkedList.addNode(3,3);
		singlyLinkedList.printLinkedList();
		
		System.out.println("Remove StartNode. Size: " + SinglyLinkedList.getCounter());
		singlyLinkedList.removeStartNode();
		singlyLinkedList.printLinkedList();
		
		System.out.println("Remove EndNode. Size: " + SinglyLinkedList.getCounter());
		singlyLinkedList.removeEndNode();
		singlyLinkedList.printLinkedList();
		
		System.out.println("Remove Node at Index 2. Size: " + SinglyLinkedList.getCounter());
		singlyLinkedList.removeIndexNode(2);
		singlyLinkedList.printLinkedList();
		singlyLinkedList.removeIndexNode(1);
		singlyLinkedList.printLinkedList();
		
		singlyLinkedList.removeIndexNode(1);
		singlyLinkedList.printLinkedList();
		
		singlyLinkedList.removeIndexNode(1);
		singlyLinkedList.printLinkedList();
		
		singlyLinkedList.removeIndexNode(0);
		singlyLinkedList.printLinkedList();
		
	}
}
