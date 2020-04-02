package builder.array.stack;

public class Stack {
	private static  int stackTop = -1;
	Object[] stack;

	
	public Stack (int size) {
		createArrayStack(size);
	}
	
	public void createArrayStack(int size) {
		this.stack = new Object [size];
		incStackTop();
	}
	
	public static int getStackTop() {
		return stackTop;
	}

	public static void incStackTop() {
		Stack.stackTop++;
	}
	
	public static void decStackTop() {
		Stack.stackTop--;
	}

	
	public void loggerln(String msg) {
		System.out.println(msg); //NOSONAR
	}
	
	public void logger(String msg) {
		System.out.print(msg); //NOSONAR
	}
	
	
	public void push(Object data) {
		if(!isFull()) {
			this.stack[getStackTop()] = data;
			incStackTop();
		}
	}
	
	public void pop() {
		if(!isEmpty()) {
			this.stack[getStackTop()-1] = Integer.MIN_VALUE;
			decStackTop();
		}
	}
	
	public boolean isEmpty() {
		if (getStackTop() == 0) {
			loggerln("Stack is Empty.");
			return true;
		}
		
		return false;
	}
	
	public boolean isFull() {
		if (getStackTop() == this.stack.length) {
			loggerln("Stack is Full.");
			return true;
		}
		return false;
	}
	
	public void peek() {
		if(!isEmpty())
			loggerln(this.stack[getStackTop()-1].toString());
	}
	
}
