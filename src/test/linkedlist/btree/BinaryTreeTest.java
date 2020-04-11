package test.linkedlist.btree;

import builder.linkedlist.btree.BinaryTree;

public class BinaryTreeTest {
	public void run() {
		BinaryTree binaryTree =  new BinaryTree();
		
		for(int index = 0; index<10;index++) {
			binaryTree.insert(index);
		}
		
		binaryTree.bfsTraverse();
		System.out.println("Preorder Traverser");
		binaryTree.preOrderTraverse(binaryTree.getRoot());
		System.out.println("\n Inorder Traverser");
		binaryTree.inOrderTraverse(binaryTree.getRoot());
		System.out.println("\n PostOrder Traverser");
		binaryTree.postOrderTraverse(binaryTree.getRoot());
		System.out.println("\n Removing Nodes");
		
		for(int index = 0; index<10;index++) {
			binaryTree.remove(index);
			binaryTree.bfsTraverse();
		}
		
	}
}
	
