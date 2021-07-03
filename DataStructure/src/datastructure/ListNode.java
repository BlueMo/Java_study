package datastructure;

public class ListNode<T> {
	
	private T data;
	public ListNode<T> prev, next;
	
	public ListNode() {
		data = null;
		next = prev = null;
	}
	
	public ListNode(T data) {
		this.data = data;
		next = prev = null;
	}
	
	public ListNode(T data, ListNode<T> prev, ListNode<T> next) {
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
