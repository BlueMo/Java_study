package datastructure;

public class MyListNode<T> {
	
	private T data;
	public MyListNode<T> prev, next;
	
	public MyListNode() {
		data = null;
		next = prev = null;
	}
	
	public MyListNode(T data) {
		this.data = data;
		next = prev = null;
	}
	
	public MyListNode(T data, MyListNode<T> prev, MyListNode<T> next) {
		this.data = data;
		this.prev = prev;
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
