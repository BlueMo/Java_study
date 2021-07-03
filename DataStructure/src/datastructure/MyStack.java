package datastructure;

public class MyStack<T> extends MyLinkedList<T>{
	
	public void push(T data) {
		insertElement(data, count);
	}
	
	public T pop() throws NullPointerException{
		if (count == 0) throw new NullPointerException("Stack is empty.");
		return removeElement(count - 1).getData();
	}
	
	public T top() {
		if (count == 0) return null;
		return rear.getData();
	}
}
