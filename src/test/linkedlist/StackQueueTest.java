package test.linkedlist;

import builder.linkedlist.StackQueue;

public class StackQueueTest {
	
	public void run() {
		StackQueue stackQueue = new StackQueue(4);
		stackQueue.enQueue(1);
		
		stackQueue.enQueue(2);
		
		stackQueue.enQueue(3);
		
		stackQueue.enQueue(4);
		
		stackQueue.enQueue(5);
		stackQueue.deQueue();
		
		stackQueue.enQueue(6);
		stackQueue.deQueue();
		
		stackQueue.enQueue(7);
		stackQueue.deQueue();
		stackQueue.deQueue();
		stackQueue.deQueue();
		
	}
}
