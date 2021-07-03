package datastructure;

public class MyQueue<T> extends MyLinkedList<T>{
	
	public void push(T data) {
		insertElement(data, count);
	}
	
	public T pop() {
		return removeElement(0).getData();
	}
	
	public T front() {
		return head.getData();
	}
	
	public T back() {
		return rear.getData();
	}
}
