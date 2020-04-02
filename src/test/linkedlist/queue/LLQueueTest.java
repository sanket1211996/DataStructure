package test.linkedlist.queue;

import builder.linkedlist.queue.LLQueue;

public class LLQueueTest {
	
	public void run() {
		LLQueue llQueue = new LLQueue();
		llQueue.enQueue(1);
		
		llQueue.enQueue(2);
		
		llQueue.enQueue(3);
		
		llQueue.enQueue(4);
		
		llQueue.enQueue(5);
		llQueue.deQueue();
		
		llQueue.enQueue(6);
		llQueue.deQueue();
		
		llQueue.enQueue(7);
		llQueue.enQueue(8);
		llQueue.deQueue();
		llQueue.deQueue();
		llQueue.deQueue();
		llQueue.deQueue();
		llQueue.deQueue();
		llQueue.deQueue();
		llQueue.deQueue();
		llQueue.enQueue(1);
		
	}
}
