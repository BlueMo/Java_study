package datastructure;

public class MyLinkedList<T> {
	
	protected MyListNode<T> head, rear;
	private int count;
	
	public MyLinkedList() {
		head = rear = null;
		count = 0;
	}
	
	public MyListNode<T> insertElement(T data, int position) throws IllegalArgumentException{	
		if (position < 0 || position > count) {
			throw new IllegalArgumentException("position value is abnormal.");
		}
		
		
		MyListNode<T> tempNode = null;
		MyListNode<T> newNode = new MyListNode<T>(data);
		
		if (position == 0) {
			tempNode = head;
			newNode.next = tempNode;
			if (count == 0) rear = newNode;
			else tempNode.prev = newNode;
			head = newNode;
		}
		else if (position == count) {
			tempNode = rear;
			tempNode.next = newNode;
			newNode.prev = tempNode;
			rear = newNode;
		}
		else {
			tempNode = head;
			for (int i = 0; i < position; i++) tempNode = tempNode.next;
			tempNode.next.prev = newNode;
			newNode.next = tempNode.next;
			tempNode.next = newNode;
			newNode.prev = tempNode;
		}
		count++;
		
		return newNode;
	}
	
	public MyListNode<T> insertElement(T data){
		return insertElement(data, 0);
	}
	
	public MyListNode<T> removeElement(int position) throws IllegalArgumentException{
		if (position < 0 || position >= count) {
			throw new IllegalArgumentException("position value is abnormal.");
		}
		
		MyListNode<T> tempNode = null;
		if (position == 0) {
			tempNode = head;
			head = head.next;
		}
		else if (position == count - 1) {
			tempNode = rear;
			rear = rear.prev;
		}
		else {
			tempNode = head;
			for (int i = 0; i < position; i++) tempNode = tempNode.next;
			tempNode.prev.next = tempNode.next;
			tempNode.next.prev = tempNode.prev;
		}
		
		count--;
		return tempNode;
	}
	
	public T getElement(int position) throws IllegalArgumentException{
		if (position < 0 || position >= count) {
			throw new IllegalArgumentException("position value is abnormal.");
		}
		
		MyListNode<T> tempNode = head;
		for (int i = 0; i < position; i++) tempNode = tempNode.next;
		
		return tempNode.getData();
	}
	
	public MyListNode<T> getNode(int position) throws IllegalArgumentException{
		if (position < 0 || position >= count) {
			throw new IllegalArgumentException("position value is abnormal.");
		}
		
		MyListNode<T> tempNode = null;
		for (int i = 0; i < count; i++) tempNode = tempNode.next;
		
		return tempNode;
	}
	
	public void clear() {
		head = rear = null;
		count = 0;
	}
	
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		if (count == 0) return true;
		return false;
	}
	public MyListNode<T> getHead() {
		return head;
	}

	public MyListNode<T> getBack() {
		return rear;
	}
	
	public int count() {
		return count;
	}
	
}

