package builder.linkedlist;

import container.linkedlist.Node;

public class SinglyLinkedList {
	private static  int counter;
	private Node head;
	private Node tail;
	
	public SinglyLinkedList (Object data) {
		head = tail = new Node(data);
		incCounter();
	}
	
	public void addNode(Object data) {
		
		Node temp = new Node(data);
		tail.setNext(temp);
		tail = temp;	
		incCounter();
	}
	
	public static int getCounter() {
		return counter;
	}

	public static void incCounter() {
		SinglyLinkedList.counter++;
	}
	
	public static void decCounter() {
		SinglyLinkedList.counter--;
	}

	public void addNode(Object data, int index) {
		
		Node temp = new Node(data);
		
		if(head == null) {
			head = tail = temp;
		} else {
			Node iterator = head.getNext();
			for(int nodeIdx = 1; nodeIdx < index-1; nodeIdx ++) {
				iterator = head.getNext();
			}
			temp.setNext(iterator.getNext());
			iterator.setNext(temp);
		}
		incCounter();	
	}
	
	public void printLinkedList() {
		
		if(head == null) {
			System.out.println("Empty LinkedList");
			return;
		}
		
		Node iterator = head;
		
		System.out.print("Linked List Data: [");
		while(null != iterator) {
			System.out.print(iterator.getData().toString());
			
			if(null != iterator.getNext())
				System.out.print(",");
			
			iterator = iterator.getNext();
		}
		System.out.println("]");
	}
	
	public void removeStartNode() {
		if(head == tail) {		
			tail = head = null;
		} else {
			head = head.getNext();
		}
		decCounter();
	}
	
	public void removeEndNode() {
		if(head == tail) {
			head = tail = null;
		} else {	
			Node iterator =  head;
			for(int nodeIdx = 0 ; nodeIdx < SinglyLinkedList.getCounter()-2; nodeIdx++) {
				iterator = iterator.getNext();
			}
			tail = iterator;
			tail.setNext(null);
		}
		decCounter();
	}
	
	public void removeIndexNode(int index) {
		
		if(index > SinglyLinkedList.getCounter()-1) {
			System.out.println("Index Out of Bound");
			return;
		}
			
		
		if(head == tail) {
			head = tail = null;
		} else {	
			Node iterator =  head;
			for(int nodeIdx = 0 ; nodeIdx < index-1; nodeIdx++) {
				iterator = iterator.getNext();
			}
			iterator.setNext(iterator.getNext().getNext());
			if(index == SinglyLinkedList.getCounter()-1)
				tail = iterator;
		}
		
		decCounter();
	}
	
}
