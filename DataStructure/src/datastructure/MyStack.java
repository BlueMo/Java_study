package datastructure;

public class MyStack<T> extends MyLinkedList<T>{
	
	public void push(T data) {
		insertElement(data, count);
	}
	
	public T pop() {
		return removeElement(count - 1).getData();
	}
	
	public T top() {
		return rear.getData();
	}
}
