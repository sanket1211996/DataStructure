package builder.linkedlist;

import container.linkedlist.DNode;

public class DoublyLinkedList {
	private static  int counter = -1;
	private DNode head;
	private DNode tail;
	
	public DoublyLinkedList (Object data) {
		createDLL(data);
	}
	
	public void createDLL(Object data) {
		head = tail = new DNode(data);
		head.setNext(null);
		head.setPrev(null);
		incCounter();
	}
	
	public static int getCounter() {
		return counter;
	}

	public static void incCounter() {
		DoublyLinkedList.counter++;
	}
	
	public static void decCounter() {
		DoublyLinkedList.counter--;
	}
	
	public void addNode(Object data) {
		addNode(data, DoublyLinkedList.getCounter());
	}
	
	public void addStartNode(Object data) {
		addNode(data, -1);
	}
	
	public void addNode(Object data, int index) {
		
		DNode dnode = new DNode(data);
		
		//Index Out Of Bound
		if(index > DoublyLinkedList.getCounter()) {
			loggerln("LinkedList Index Out Of Bound");
			return;
		}
		
		if(head == null) {
			createDLL(data);
		} 
		
		//Adding at Start
		else if (index == -1){
			dnode.setPrev(null);
			dnode.setNext(head);
			head.setPrev(dnode);
			head = dnode;
		}
		
		//Adding at End
		else if (index == DoublyLinkedList.getCounter()) {
			dnode.setPrev(tail);
			dnode.setNext(null);
			tail.setNext(dnode);
			tail = dnode;
		}
		
		//adding dnode in between
		else {
			DNode tempDNode = head; 
			for(int pos = 0;  pos < index-1; pos++)
				tempDNode = tempDNode.getNext();
			
			dnode.setNext(tempDNode.getNext());
			dnode.setPrev(tempDNode);
			dnode.getNext().setPrev(dnode);
			tempDNode.setNext(dnode);
			
		}
		incCounter();	
	}
	
	public void printLinkedList() {		
		
		if(head == null) {
			loggerln("Empty LinkedList");
			return;
		}
		
		DNode iterator = head;
		
		logger("Linked List Data: [");
		for(int pos = 0; pos <= DoublyLinkedList.getCounter(); pos++) {
			logger(iterator.getData().toString() + ",");
			iterator = iterator.getNext();
		}	
		loggerln("]");
	}
	
	public void printReverseLinkedList() {		
		
		if(head == null) {
			loggerln("Empty LinkedList");
			return;
		}
		
		DNode iterator = tail;
		
		logger("Reverse Linked List Data: [");
		
		for(int pos = DoublyLinkedList.getCounter(); pos >= 0; pos--) {
			logger(iterator.getData().toString() + ",");
			iterator = iterator.getPrev();
		}
		
		loggerln("]");
	}
	
	public void removeStartNode() {
		removeNodeAt(0);
	}
	
	public void removeEndNode() {
		removeNodeAt(DoublyLinkedList.getCounter());
	}
	
	public void removeNodeAt(int index) {
		
		if(index > DoublyLinkedList.getCounter()) {
			loggerln("Index Out of Bound");
			return;
		}
		
		if(head == null) {
			loggerln("Doubly LinkedList Empty");
			return;
		}
			
		
		if(head == tail) {
			head.setPrev(null);
			head.setNext(null);
			head = tail = null;
			
		} 
		
		//remove at start 
		else if (index == 0) {
			head = head.getNext();
			head.setPrev(null);
		}
		
		//remove at end
		else if(index == DoublyLinkedList.getCounter()) {
			tail = tail.getPrev();
			tail.setNext(null);
		}
		
		else {	
			DNode iterator =  head;
			for(int nodeIdx = 0 ; nodeIdx < index-1; nodeIdx++) {
				iterator = iterator.getNext();
			}
			iterator.setNext(iterator.getNext().getNext());
			iterator.getNext().setPrev(iterator);
		}
		decCounter();
	}
	
	public void search(Object data) {
		DNode iterator =  head;
		for(int nodeIdx = 0 ; nodeIdx <= DoublyLinkedList.getCounter(); nodeIdx++) {
			if(iterator.getData().equals(data)) {
				loggerln("Data found at index: " + nodeIdx );
				return;
			}
			iterator = iterator.getNext();
		}
		loggerln("Data not found");

	}
	
	
	public void loggerln(String msg) {
		System.out.println(msg); //NOSONAR
	}
	
	public void logger(String msg) {
		System.out.print(msg); //NOSONAR
	}
	
	
}
