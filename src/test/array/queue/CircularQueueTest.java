package test.array.queue;

import builder.array.queue.CircularQueue;

public class CircularQueueTest {
	
	public void run() {
		CircularQueue circularQueue = new CircularQueue(4);
		circularQueue.enQueue(1);
		
		circularQueue.enQueue(2);
		
		circularQueue.enQueue(3);
		
		circularQueue.enQueue(4);
		
		circularQueue.enQueue(5);
		circularQueue.deQueue();
		
		circularQueue.enQueue(6);
		circularQueue.deQueue();
		
		circularQueue.enQueue(7);
		circularQueue.enQueue(8);
		circularQueue.deQueue();
		circularQueue.deQueue();
		circularQueue.deQueue();
		circularQueue.deQueue();
		circularQueue.deQueue();
		
	}
}
