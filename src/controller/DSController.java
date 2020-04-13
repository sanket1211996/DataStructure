package controller;

import java.util.Scanner;

import test.array.bst.BinarySearchTreeTest;
import test.array.bt.ABinaryTreeTest;
import test.array.queue.CircularQueueTest;
import test.array.queue.QueueTest;
import test.array.stack.StackTest;
import test.linkedlist.CircularDoublyLinkedListTest;
import test.linkedlist.CircularSinglyLinkedListTest;
import test.linkedlist.DoublyLinkedListTest;
import test.linkedlist.SinglyLinkedListTest;
import test.linkedlist.btree.BinaryTreeTest;
import test.linkedlist.queue.LLQueueTest;

public class DSController {

	public static void main(String[] args) {
		
		System.out.println("Welcome to data structure");
		System.out.println("0. Singly Linked List Test  1. Circular Singly Linked List Test");
		System.out.println("2. Doubly Linked List Test  3. Circular Doubly Linked List Test");
		System.out.println("4. Array Stack Test         5. Linked List Stack Test");
		System.out.println("6. Array Queue Test         7. Array Circular Queue Test");
		System.out.println("8. LinkedList Queue Test    9. Binary Tree Test");
		System.out.println("10. Binary Tree Test(Array) 11. Binary Search Tree Test");
		
		System.out.println("Select the Test to run:");
		Scanner scanner =  new Scanner(System.in);
		int option = 0;
		option = scanner.nextInt();
		
		switch (option) {
		case 0:
			System.out.println("Singly Linked List Test");
			SinglyLinkedListTest  singlyLinkedListTest =  new SinglyLinkedListTest();
			singlyLinkedListTest.run();
			break;
			
		case 1:
			System.out.println("Cicular Singly Linked List Test");
			CircularSinglyLinkedListTest circularSinglyLinkedListTest = new
			CircularSinglyLinkedListTest(); circularSinglyLinkedListTest.run();
			break;
			
		case 2:
			System.out.println("Doubly Linked List Test");
			DoublyLinkedListTest  doublyLinkedListTest =  new DoublyLinkedListTest();
			doublyLinkedListTest.run();
			break;
			
		case 3:
			System.out.println("Doubly Linked List Test");
			CircularDoublyLinkedListTest circulardoublyLinkedListTest = new CircularDoublyLinkedListTest();
			circulardoublyLinkedListTest.run();
			break;
			
		case 4:
			System.out.println("Array Stack Test"); 
			StackTest stackTest = new StackTest(); 
			stackTest.run();
			break;
			
		case 5:
			System.out.println("LinkedList Stack Test"); 
			test.array.stack.StackTest llstackTest = new test.array.stack.StackTest (); 
			llstackTest.run();
			break;		
		case 6:
			System.out.println("Array Queue Test"); 
			QueueTest queueTest = new QueueTest(); 
		    queueTest.run();
			break;
			
		case 7:
			System.out.println("Array Circular Queue Test"); 
			CircularQueueTest circularQueueTest = new CircularQueueTest(); 
			circularQueueTest.run();
			break;
			
		case 8:
			System.out.println("LinkedList Queue Test"); 
			LLQueueTest llQueueTest = new LLQueueTest(); 
			llQueueTest.run();
			break;
		case 9:
			System.out.println("Binary Tree Test"); 
			BinaryTreeTest binaryTreeTest = new BinaryTreeTest(); 
			binaryTreeTest.run();
			break;
			
		case 10:
			System.out.println("Binary Tree Test(Array)"); 
			ABinaryTreeTest aBinaryTreeTest = new ABinaryTreeTest(); 
			aBinaryTreeTest.run();
			break;
			
		case 11:
			System.out.println("Binary Search Tree Test"); 
			BinarySearchTreeTest binarySearchTreeTest = new BinarySearchTreeTest(); 
			binarySearchTreeTest.run();
			break;	
			
			
		default:
			break;
		}	 
		
		scanner.close(); 
	}

}
