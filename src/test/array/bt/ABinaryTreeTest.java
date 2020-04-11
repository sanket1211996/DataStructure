package test.array.bt;

import builder.array.bt.ABinaryTree;

public class ABinaryTreeTest {
	public void run() {
		ABinaryTree aBinaryTree =  new ABinaryTree(11);
		
		for(int index = 0; index<10;index++) {
			aBinaryTree.insert(new Integer(index));
		}
		
		aBinaryTree.bfsTraverse();
		System.out.println("Preorder Traverser");
		aBinaryTree.preOrder(1);
		System.out.println("\n Inorder Traverser");
		aBinaryTree.inOrder(1);
		System.out.println("\n PostOrder Traverser");
		aBinaryTree.postOrder(1);
		System.out.println("\n Removing Nodes");
		
		for(int index = 0; index<10;index++) {
			aBinaryTree.remove(index);
			aBinaryTree.bfsTraverse();
		}
		
	}
}
	
