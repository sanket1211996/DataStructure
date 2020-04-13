package test.array.bst;

import builder.linkedlist.bst.BinarySearchTree;

public class BinarySearchTreeTest {
	public void run() {
		BinarySearchTree binarySearchTree =  new BinarySearchTree();
		

		binarySearchTree.insert(10);
		binarySearchTree.insert(6);
		binarySearchTree.insert(14);
		binarySearchTree.insert(8);
		binarySearchTree.insert(4);
		binarySearchTree.insert(16);
		binarySearchTree.insert(12);
		binarySearchTree.insert(13);
		binarySearchTree.insert(15);
	
		
		binarySearchTree.bfsTraverse();
		System.out.println("\n Removing Nodes");
		

		binarySearchTree.remove(10);
		binarySearchTree.bfsTraverse();
		binarySearchTree.remove(6);
		binarySearchTree.bfsTraverse();
		binarySearchTree.remove(14);
		binarySearchTree.bfsTraverse();
		binarySearchTree.remove(8);
		binarySearchTree.bfsTraverse();
		binarySearchTree.remove(4);
		binarySearchTree.bfsTraverse();
		binarySearchTree.remove(16);
		binarySearchTree.bfsTraverse();
		binarySearchTree.remove(12);
		binarySearchTree.bfsTraverse();
		binarySearchTree.remove(13);
		binarySearchTree.bfsTraverse();
		binarySearchTree.remove(15);
		binarySearchTree.bfsTraverse();
		
	}
}
	
