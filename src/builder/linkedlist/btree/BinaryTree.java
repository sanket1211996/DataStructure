package builder.linkedlist.btree;

import java.util.LinkedList;
import java.util.Queue;

import container.linkedlist.TNode;

public class BinaryTree {
	TNode root;
	
	public TNode getRoot() {
		return root;
	}

	public void setRoot(TNode root) {
		this.root = root;
	}

	public BinaryTree () {
		this.root = null;
	}
	
	public void bfsTraverse () {
		Queue<TNode> bfsQueue = new LinkedList<>();
		if(root == null) {
			loggerln("Tree Empty");
			return;
		}
			
		logger("Breadth First Search: [");
		bfsQueue.add(root);
		while(!bfsQueue.isEmpty()) {
			if(bfsQueue.peek() == null) 
				break;
			bfsQueue.add(bfsQueue.peek().getLeft());
			bfsQueue.add(bfsQueue.peek().getRight());		
			logger(bfsQueue.remove().getData().toString() + ",");
		}
		loggerln("]");
	}
	
	public void postOrderTraverse(TNode iterator) {
		if(iterator ==  null)
			return;	
		postOrderTraverse(iterator.getLeft());
		postOrderTraverse(iterator.getRight());
		logger(iterator.getData().toString());
	}
	
	public void inOrderTraverse(TNode iterator) {
		if(iterator ==  null)
			return;	
		inOrderTraverse(iterator.getLeft());
		logger(iterator.getData().toString());
		inOrderTraverse(iterator.getRight());
	}
	
	public void preOrderTraverse(TNode iterator) {
		if(iterator ==  null)
			return;	
		logger(iterator.getData().toString());
		preOrderTraverse(iterator.getLeft());
		preOrderTraverse(iterator.getRight());
	}
	
	public void insert(Object data) {
		TNode tempNode =  new TNode(data);
		
		if(root == null) {
			root = tempNode;
			loggerln("Data:" + data.toString() + "Inserted at root"); 
			return;
		}
		
		Queue<TNode> bfsQueue = new LinkedList<>();
		bfsQueue.add(root);
		while(!bfsQueue.isEmpty()) {
			TNode currentNode =  bfsQueue.remove();
			if(currentNode.getLeft() == null) {
				currentNode.setLeft(tempNode);
				loggerln("Data:" +data.toString()+ 
						 " Add to Left Node of "+ currentNode.getData().toString());
				break;
			}
			
			if(currentNode.getRight() == null) {
				currentNode.setRight(tempNode);
				loggerln("Data:" +data.toString()+ 
						 " Add to Right Node of "+ currentNode.getData().toString());
				break;
			}
				
			bfsQueue.add(currentNode.getLeft());
			bfsQueue.add(currentNode.getRight());		
		}
		
	}
	
	public void remove(Object data) {
		
		if(root == null) {
			loggerln("Binary Tree Empty"); 
			return;
		}
		
		Queue<TNode> bfsQueue = new LinkedList<>();
		bfsQueue.add(root);
		while(!bfsQueue.isEmpty()) {
			TNode currentNode =  bfsQueue.remove();
			if(currentNode.getData() == data) {
				currentNode.setData(getDeepestNode().getData());
				deleteDeepestNode();
				logger("Node Removed: " + data.toString());
				return;
			}
			
			if(currentNode.getLeft() != null)
				bfsQueue.add(currentNode.getLeft());
			if(currentNode.getRight() != null)
				bfsQueue.add(currentNode.getRight());;		
		}
		logger("Node not found");
	}
	
	public TNode getDeepestNode () {
		if(root == null)
			return null;
		Queue<TNode> bfsQueue = new LinkedList<>();
		TNode currentNode =  null;
		bfsQueue.add(root);
		while(!bfsQueue.isEmpty()) {
			currentNode =  bfsQueue.remove();
			if(currentNode.getLeft() != null)
				bfsQueue.add(currentNode.getLeft());
			if(currentNode.getRight() != null)
				bfsQueue.add(currentNode.getRight());
		}
		return currentNode;
	}
	
	public void deleteDeepestNode() {
		if(root == null)
			return;
		Queue<TNode> bfsQueue = new LinkedList<>();
		TNode currentNode = null , previousNode =  null;
		bfsQueue.add(root);
		while(!bfsQueue.isEmpty()) {
			previousNode = currentNode;
			currentNode  = bfsQueue.remove();
			if(currentNode.getLeft() == null) {
				if(previousNode ==  null) 
					root = null;
				else
					previousNode.setRight(null);
				return;
			}
			else if(currentNode.getRight() == null) {
				currentNode.setLeft(null);
				return;
			}
			else {
				bfsQueue.add(currentNode.getLeft());
				bfsQueue.add(currentNode.getRight());
			}
		}
	}
	
	
	public void loggerln(String msg) {
		System.out.println(msg); //NOSONAR
	}
	
	public void logger(String msg) {
		System.out.print(msg); //NOSONAR
	}
	

}
