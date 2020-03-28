package container.linkedlist;

public class DNode {
	DNode next;
	DNode prev;
	public DNode getPrev() {
		return prev;
	}

	public void setPrev(DNode prev) {
		this.prev = prev;
	}

	public DNode getNext() {
		return next;
	}

	public void setNext(DNode next) {
		this.next = next;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	Object data;
	
	public DNode(Object dataValue) {
		data =  dataValue;
		next = null;
	}
	
}
