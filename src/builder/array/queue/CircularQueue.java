package builder.array.queue;

public class CircularQueue {
	private static  int topOfQueue = -1, beginingOfQueue = -1;
	Object[] queue;

	
	public CircularQueue (int size) {
		this.queue = new Object [size];
	}
	
	public void loggerln(String msg) {
		System.out.println(msg); //NOSONAR
	}
	
	public void logger(String msg) {
		System.out.print(msg); //NOSONAR
	}
	
	
	public void enQueue(Object data) {
		
		if(isFull())
			return;
		if(topOfQueue+1 == queue.length) {
			topOfQueue = 0;

		} else {
			topOfQueue++;
		}
		queue[topOfQueue] = data;
		loggerln("Enqueued:" + data.toString());
		if(beginingOfQueue == -1)
			beginingOfQueue++;
		
	}
	
	public void deQueue() {	
		
		if(isEmpty())
			return;
		
		loggerln("Dequeued:" + queue[beginingOfQueue].toString());
		this.queue[beginingOfQueue] = Integer.MIN_VALUE;
		if(beginingOfQueue == topOfQueue)
			beginingOfQueue = topOfQueue = -1;
		else if (beginingOfQueue + 1 == queue.length)
			beginingOfQueue = 0;
		else 
			beginingOfQueue++;
		
		
	}
	
	public boolean isEmpty() {
		if (topOfQueue == -1 ) {
			loggerln("Queue is Empty.");
			return true;
		}
		
		return false;
	}
	
	public boolean isFull() {
		if (topOfQueue + 1 == beginingOfQueue || (beginingOfQueue == 0 && topOfQueue+1 == queue.length)) {
			loggerln("Queue is Full.");
			return true;
		} 
		return false;
	}
}
