package builder.linkedlist.stack;

import container.linkedlist.Node;

public class Stack {

	Node stackTop;
    public static int elementCount = -1;
	
	public static int getStackSize() {
		return elementCount;
	}

	public static void incSize() {
		Stack.elementCount++;
	}
	
	public static void decSize() {
		Stack.elementCount--;
	}

	
	public void loggerln(String msg) {
		System.out.println(msg); //NOSONAR
	}
	
	public void logger(String msg) {
		System.out.print(msg); //NOSONAR
	}
	
	
	public void push(Object data) {
		Node newNode = new Node(data);
		newNode.setNext(stackTop);
		stackTop = newNode;
		incSize();
	}
	
	public void pop() {
		if(!isEmpty()) {
			loggerln(stackTop.getData().toString());
			stackTop = stackTop.getNext();
			decSize();
		}
	}
	
	public boolean isEmpty() {
		if (stackTop == null) {
			loggerln("Stack is Empty.");
			return true;
		}
		
		return false;
	}
	
	public void peek() {
		if(!isEmpty())
			loggerln(stackTop.getData().toString());
	}
	
}
