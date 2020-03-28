package builder.linkedlist;

import container.linkedlist.Node;

public class CircularSinglyLinkedList {
	private static  int counter;
	private Node head;
	private Node tail;
	
	public CircularSinglyLinkedList (Object data) {
		head = tail = new Node(data);
		tail.setNext(head);
		incCounter();
	}
	
	public void addNode(Object data) {
		
		Node temp = new Node(data);
		tail.setNext(temp);
		tail = temp;
		tail.setNext(head);
		incCounter();
	}
	
	public static int getCounter() {
		return counter;
	}

	public static void incCounter() {
		CircularSinglyLinkedList.counter++;
	}
	
	public static void decCounter() {
		CircularSinglyLinkedList.counter--;
	}

	public void addNode(Object data, int index) {
		
		Node temp = new Node(data);
		
		if(head == null) {
			head = tail = temp;
			tail.setNext(head);
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
		int i = 1 ;
		while(i<=CircularSinglyLinkedList.getCounter()*2 && iterator.getNext() !=null) {
			System.out.print(iterator.getData().toString());
			
			if(null != iterator.getNext())
				System.out.print(",");
			
			iterator = iterator.getNext();
			i++;
		}
		System.out.println("]");
	}
	
	public void removeStartNode() {
		if(head == tail) {	
			tail.setNext(null);
			tail = head = null;
			
		} else {
			head = head.getNext();
			tail.setNext(head);
		}
		decCounter();
	}
	
	public void removeEndNode() {
		if(head == tail) {
			tail.setNext(null);
			head = tail = null;
		} else {	
			Node iterator =  head;
			for(int nodeIdx = 0 ; nodeIdx < CircularSinglyLinkedList.getCounter()-2; nodeIdx++) {
				iterator = iterator.getNext();
			}
			tail = iterator;
			tail.setNext(head);
		}
		decCounter();
	}
	
	public void removeIndexNode(int index) {
		
		if(index > CircularSinglyLinkedList.getCounter()-1) {
			System.out.println("Index Out of Bound");
			return;
		}
			
		
		if(head == tail) {
			tail.setNext(null);
			head = tail = null;
		} else {	
			Node iterator =  head;
			for(int nodeIdx = 0 ; nodeIdx < index-1; nodeIdx++) {
				iterator = iterator.getNext();
			}
			iterator.setNext(iterator.getNext().getNext());
			if(index == CircularSinglyLinkedList.getCounter()-1)
				tail = iterator;
		}
		
		decCounter();
	}
	
}
