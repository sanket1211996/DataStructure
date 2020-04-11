package container.linkedlist;

public class TNode {
	TNode right;
	TNode left;
	public TNode getLeft() {
		return left;
	}

	public void setLeft(TNode left) {
		this.left = left;
	}

	public TNode getRight() {
		return right;
	}

	public void setRight(TNode right) {
		this.right = right;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	Object data;
	
	public TNode(Object dataValue) {
		data  =  dataValue;
		right = null;
		left  = null;
	}
	
}
