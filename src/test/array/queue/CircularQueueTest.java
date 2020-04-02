package test.array.queue;

import builder.array.queue.CircularQueue;

public class CircularQueueTest {
	
	public void run() {
		CircularQueue stackQueue = new CircularQueue(4);
		stackQueue.enQueue(1);
		
		stackQueue.enQueue(2);
		
		stackQueue.enQueue(3);
		
		stackQueue.enQueue(4);
		
		stackQueue.enQueue(5);
		stackQueue.deQueue();
		
		stackQueue.enQueue(6);
		stackQueue.deQueue();
		
		stackQueue.enQueue(7);
		stackQueue.enQueue(8);
		stackQueue.deQueue();
		stackQueue.deQueue();
		stackQueue.deQueue();
		stackQueue.deQueue();
		stackQueue.deQueue();
		
	}
}
