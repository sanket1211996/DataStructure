package container.linkedlist;

public class Node {
	Node next;
	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	Object data;
	
	public Node(Object dataValue) {
		data =  dataValue;
		next = null;
	}
	
}
