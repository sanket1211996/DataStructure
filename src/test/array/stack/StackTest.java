package test.array.stack;

import builder.array.stack.Stack;

public class StackTest {
	public void run() {
		Stack stackArray = new Stack(4);
		stackArray.push(1);
		stackArray.peek();
		
		stackArray.push(2);
		stackArray.peek();
		
		stackArray.push(3);
		stackArray.peek();
		
		stackArray.push(4);
		stackArray.peek();
		
		stackArray.push(5);
		stackArray.peek();
		stackArray.pop();
		
		stackArray.push(6);
		stackArray.peek();
		stackArray.pop();
		
		stackArray.push(7);
		stackArray.peek();
		stackArray.pop();
		stackArray.pop();
		stackArray.pop();
		stackArray.pop();
		stackArray.pop();

		stackArray.peek();
		
	}
}
