package test.array.queue;

import builder.array.queue.Queue;

public class QueueTest {
	
	public void run() {
		Queue stackQueue = new Queue(4);
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
