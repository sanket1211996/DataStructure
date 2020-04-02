package builder.linkedlist.queue;

import container.linkedlist.Node;

public class LLQueue {
	Node startNode, currentNode;
	public static int queueSize = -1;
	
	public static int getQueueSize() {
		return queueSize;
	}

	public static void incQueueSize() {
		LLQueue.queueSize++;
	}
	
	public static void decQueueSize() {
		LLQueue.queueSize--;
	}

	public void loggerln(String msg) {
		System.out.println(msg); //NOSONAR
	}
	
	public void logger(String msg) {
		System.out.print(msg); //NOSONAR
	}
	
	
	public void enQueue(Object data) {
		Node tempNode = new Node(data); 
		if(isEmpty())
			startNode = currentNode = tempNode;
		else {
			currentNode.setNext(tempNode);
			currentNode = tempNode;	
		}
		loggerln("Enequeued:" +data.toString());
		incQueueSize();
	}
	
	public void deQueue() {			
		
		if(isEmpty())
			return;
		
	    loggerln("Dequeued:" +startNode.getData().toString());
		startNode = startNode.getNext();


	}
	
	public boolean isEmpty() {
		if (startNode == null ) {
			loggerln("Queue is Empty.");
			return true;
		}
		return false;
	}

}
