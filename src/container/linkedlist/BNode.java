package container.linkedlist;

public class BNode {
	BNode right;
	BNode left;
	public BNode getLeft() {
		return left;
	}

	public void setLeft(BNode left) {
		this.left = left;
	}

	public BNode getRight() {
		return right;
	}

	public void setRight(BNode right) {
		this.right = right;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	int data;
	
	public BNode(int dataValue) {
		data  =  dataValue;
		right = null;
		left  = null;
	}
	
}
