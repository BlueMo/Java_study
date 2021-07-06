package datastructure;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyHeap<T extends Comparable<T>>{
	
	private T[] heapArray;
	private boolean isMaxHeap = true;
	private int size = 0;
	private static final int DEFAULT_SIZE = 1024;
	
	@SuppressWarnings("unchecked")
	public MyHeap() {
		heapArray = (T[]) new Comparable[DEFAULT_SIZE];
	}
	
	public MyHeap(boolean isMaxHeap) {
		this();
		this.isMaxHeap = isMaxHeap;
	}
	
	public void push(T data) {
		if (size + 1 == heapArray.length) increaseCapacity();
		heapArray[++size] = data;
		
		for (int i = size; i != 1; i/=2) {
			if (compareElement(heapArray[i], heapArray[i/2]) == true) swap(i, i/2);
			else break;
		}
	}
	
	public T pop() {
		if (size == 0) throw new NoSuchElementException();
		else if (size == 1) {
			size = 0;
			return heapArray[1];
		}
		swap(1, size);
		size--;
		
		for (int i = 1; i*2 < size; ) {
			if (compareElement(heapArray[i*2], heapArray[i*2+1]) == true) {
				if (compareElement(heapArray[i*2], heapArray[i]) == true) {
					swap(i, i*2);
					i *= 2;
				}
				else break;
			}
			else {
				if (compareElement(heapArray[i*2 + 1], heapArray[i]) == true) {
					swap(i, i*2 + 1);
					i = i*2 + 1;	
				}
				else break;
			}
		}
		if (size % 2 == 0 && compareElement(heapArray[size], heapArray[size/2]) == true)
			swap(size, size/2);
			
		return heapArray[size+1];
	}
	public boolean compareElement(T x, T y) {
		if (isMaxHeap == true)
			return (x.compareTo(y) > 0) ? true : false;
		else
			return (x.compareTo(y) < 0) ? true : false;
	}
	
	public void swap(int x, int y) {
		T temp = heapArray[x];
		heapArray[x] = heapArray[y];
		heapArray[y] = temp;
	}
	
	public void increaseCapacity() {
		heapArray = Arrays.copyOf(heapArray, size*2);
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		if (size == 0) return true;
		return false;
	}
	
	public void printHeapArray() {
		for (int i = 1; i <= size; i++) {
			System.out.print(heapArray[i] + " ");
		}
		System.out.println(" ");
	}
}

