package datastructure;

import java.util.EmptyStackException;

public class MyStack<T> extends MyLinkedList<T>{
	
	public void push(T data) {
		insertElement(data, count);
	}
	
	public T pop(){
		if (count == 0) throw new EmptyStackException();
		return removeElement(count - 1).getData();
	}
	
	public T top() {
		if (count == 0) return null;
		return rear.getData();
	}
}
