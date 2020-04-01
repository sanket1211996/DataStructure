package builder.linkedlist;

public class StackQueue {
	private static  int topOfQueue = -1, beginingOfQueue = -1;
	Object[] queue;

	
	public StackQueue (int size) {
		this.queue = new Object [size];
	}
	
	public void loggerln(String msg) {
		System.out.println(msg); //NOSONAR
	}
	
	public void logger(String msg) {
		System.out.print(msg); //NOSONAR
	}
	
	
	public void enQueue(Object data) {
		if(!isFull()) {
			this.queue[topOfQueue+1] = data;
			loggerln("Enqueued:" + data.toString());
			topOfQueue++;
			if(beginingOfQueue == -1)
				beginingOfQueue++;
		}
	}
	
	public void deQueue() {			
		
		if(!isEmpty()) {
			loggerln("Dequeued:" +this.queue[beginingOfQueue].toString());
			this.queue[beginingOfQueue] = Integer.MIN_VALUE;
			beginingOfQueue++;
			if(beginingOfQueue > topOfQueue)
				beginingOfQueue = topOfQueue = -1; //Reseting Queue
		}
		else {
			loggerln("Queue is Empty.");
		}
	}
	
	public boolean isEmpty() {
		if (beginingOfQueue == -1) {
			loggerln("Queue is Empty.");
			return true;
		}
		
		return false;
	}
	
	public boolean isFull() {
		if (topOfQueue == queue.length-1) {
			loggerln("Queue is Full.");
			return true;
		}
		return false;
	}
}
