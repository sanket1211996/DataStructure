package builder.linkedlist.bst;

import java.util.LinkedList;
import java.util.Queue;

import container.linkedlist.BNode;

public class BinarySearchTree {
	BNode root;
	
	public BinarySearchTree() {
		root = null;
	}
	
	public BNode getRoot() {
		return root;
	}

	public void setRoot(BNode root) {
		this.root = root;
	}
	
	public void insert(int data) {
		root = insert(root, data);
	}

	public BNode insert(BNode iterator, int data) {
		BNode newNode = new BNode(data);
		
		if(iterator == null) {
			iterator = newNode;
		}
		
		else if (data > iterator.getData()) {
			iterator.setRight(insert(iterator.getRight(),data));
		}
		
		else if (data < iterator.getData()) {
			iterator.setLeft(insert(iterator.getLeft(),data));
		}
		
		return iterator;
	}
	
	public void remove(int data) {
		root = remove(root, data);
	}
	
	public BNode remove(BNode iterator, int data) {
		
		if(iterator == null) {
			return null;
		}
		
		if(data < iterator.getData()) {
			iterator.setLeft(remove(iterator.getLeft(),data));
		}
		
		else if(data > iterator.getData()) {
			iterator.setRight(remove(iterator.getRight(),data));
		}
		//it is equal to data to be removed
		else {
			if(iterator.getLeft() != null && iterator.getRight() != null) {
				BNode lowestSuccesor = getLowestSuccesor(iterator.getRight());
				iterator.setData(lowestSuccesor.getData());
				//
				iterator.setRight(remove(iterator.getRight(),lowestSuccesor.getData()));
			}
			
			else if(iterator.getLeft() != null)
				iterator = iterator.getLeft();
			else if(iterator.getRight() != null)
				iterator = iterator.getRight();
			else 
				iterator = null;
		}
		
		return iterator;
	}
	
	public BNode getLowestSuccesor(BNode iterator) {
		if(iterator.getLeft() == null) {
			return iterator;
		}
		else {
			return getLowestSuccesor(iterator.getLeft());
		}
	}
	
	
	
	
	
	
	public void bfsTraverse() {
		if(root == null) {
			loggerln("Tree Empty");
			return;
		}
		logger("BFS Traverse: [");
		Queue<BNode> bfsQueue = new LinkedList<>();
		bfsQueue.add(root);
		while(!bfsQueue.isEmpty()) {
			BNode currenBNode =  bfsQueue.remove();
			logger(currenBNode.getData()+",");
			if(currenBNode.getLeft() != null) 
				bfsQueue.add(currenBNode.getLeft());
			if(currenBNode.getRight() != null)
				bfsQueue.add(currenBNode.getRight());
		}
		loggerln("]");
	}
	
	public void loggerln(String msg) {
		System.out.println(msg); //NOSONAR
	}
	
	public void logger(String msg) {
		System.out.print(msg); //NOSONAR
	}
}
