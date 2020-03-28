package builder.linkedlist;

import container.linkedlist.DNode;

public class CircularDoublyLinkedList {
	private static  int counter = -1;
	private DNode head;
	private DNode tail;
	
	public CircularDoublyLinkedList (Object data) {
		createDLL(data);
	}
	
	public void createDLL(Object data) {
		head = tail = new DNode(data);
		head.setNext(head);
		head.setPrev(head);
		incCounter();
	}
	
	public static int getCounter() {
		return counter;
	}

	public static void incCounter() {
		CircularDoublyLinkedList.counter++;
	}
	
	public static void decCounter() {
		CircularDoublyLinkedList.counter--;
	}
	
	public void addNode(Object data) {
		addNode(data, CircularDoublyLinkedList.getCounter());
	}
	
	public void addStartNode(Object data) {
		addNode(data, -1);
	}
	
	public void addNode(Object data, int index) {
		
		DNode dnode = new DNode(data);
		
		//Index Out Of Bound
		if(index > CircularDoublyLinkedList.getCounter()) {
			loggerln("LinkedList Index Out Of Bound");
			return;
		}
		
		if(head == null) {
			createDLL(data);
		} 
		
		//Adding at Start
		else if (index == -1){
			dnode.setPrev(tail);
			dnode.setNext(head);
			head.setPrev(dnode);
			head = dnode;
		}
		
		//Adding at End
		else if (index == CircularDoublyLinkedList.getCounter()) {
			dnode.setPrev(tail);
			dnode.setNext(head);
			head.setPrev(dnode);
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
		for(int pos = 0; pos <= CircularDoublyLinkedList.getCounter(); pos++) {
			logger(iterator.getData().toString() + ",");
			iterator = iterator.getNext();
		}	
		loggerln("]");
	}
	
	public void printLinkedListTwice() {		
		
		if(head == null) {
			loggerln("Empty LinkedList");
			return;
		}
		
		DNode iterator = head;
		
		logger("Twice Linked List Data: [");
		for(int pos = 0; pos <= CircularDoublyLinkedList.getCounter()*2; pos++) {
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
		
		for(int pos = CircularDoublyLinkedList.getCounter(); pos >= 0; pos--) {
			logger(iterator.getData().toString() + ",");
			iterator = iterator.getPrev();
		}
		
		loggerln("]");
	}
	
	
	
	
	public void removeStartNode() {
		removeNodeAt(0);
	}
	
	public void removeEndNode() {
		removeNodeAt(CircularDoublyLinkedList.getCounter());
	}
	
	public void removeNodeAt(int index) {
		
		if(index > CircularDoublyLinkedList.getCounter()) {
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
			head.setPrev(tail);
			tail.setNext(head);
		}
		
		//remove at end
		else if(index == CircularDoublyLinkedList.getCounter()) {
			tail = tail.getPrev();
			tail.setNext(head);
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
		for(int nodeIdx = 0 ; nodeIdx <= CircularDoublyLinkedList.getCounter(); nodeIdx++) {
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
