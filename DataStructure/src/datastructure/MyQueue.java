package datastructure;

import java.util.NoSuchElementException;

public class MyQueue<T> extends MyLinkedList<T>{
	
	public void push(T data) {
		insertElement(data, count());
	}
	
	public T pop(){
		if (count() == 0) throw new NoSuchElementException();
		return removeElement(0).getData();
	}
	
	public T front() {
		if (count() == 0) return null;
		return head.getData();
	}
	
	public T back() {
		if (count() == 0) return null;
		return rear.getData();
	}
}
