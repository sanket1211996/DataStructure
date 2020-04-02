package test.linkedlist.stack;

import builder.linkedlist.stack.Stack;

public class StackTest {
	public void run() {
		Stack linkedListArray = new Stack();
		linkedListArray.push(1);
		linkedListArray.peek();
		
		linkedListArray.push(2);
		linkedListArray.peek();
		
		linkedListArray.push(3);
		linkedListArray.peek();
		
		linkedListArray.push(4);
		linkedListArray.peek();
		
		linkedListArray.push(5);
		linkedListArray.peek();
		linkedListArray.pop();
		
		linkedListArray.push(6);
		linkedListArray.peek();
		linkedListArray.pop();
		
		linkedListArray.push(7);
		linkedListArray.peek();
		linkedListArray.pop();
		linkedListArray.pop();
		linkedListArray.pop();
		linkedListArray.pop();
		linkedListArray.pop();

		linkedListArray.peek();
		
	}
}
