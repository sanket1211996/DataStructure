package builder.linkedlist;

public class StackQueue {
	private static  int topOfQueue = -1, beginingOfQueue = -1;
	Object[] queue;

	
	public StackQueue (int size) {
		this.queue = new Object [size];
		beginingOfQueue++;
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
		}
	}
	
	public void deQueue() {
		if(beginingOfQueue <= topOfQueue && beginingOfQueue <= queue.length -1) {
			loggerln("Dequeued:" +this.queue[beginingOfQueue].toString());
			this.queue[beginingOfQueue] = Integer.MIN_VALUE;
			beginingOfQueue++;
		}
		else {
			loggerln("Queue is Empty.");
		}
	}
	
	public boolean isEmpty() {
		if (topOfQueue != queue.length-1) {
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
