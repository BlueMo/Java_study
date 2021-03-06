package datastructure;

public class DataStructureTest {

	public static void main(String[] args) {
		/*MyQueue<Integer> queue = new MyQueue<Integer>();
		
		for (int i = 0; i < 10; i++) queue.push(i);
		
		while (!queue.isEmpty()) {
			int h = queue.pop().intValue();
			
			System.out.println("pop: " + h);
		}
		
		MyQueue<String> stringQueue = new MyQueue<String>();
		
		for (char ch = 'A'; ch <= 'Z'; ch++) stringQueue.push(String.valueOf(ch));
		
		while (!stringQueue.isEmpty()) {
			System.out.println("pop: " + stringQueue.pop());
		}
		
		
		MyStack<String> stack = new MyStack<String>();
		
		for (char ch = 'a'; ch <= 'g'; ch++) stack.push(String.valueOf(ch));
		
		while (!stack.isEmpty()) {
			System.out.println("pop: " + stack.pop());
		}*/
		
		MyHeap<Integer> maxHeap = new MyHeap<>();
		
		for (int i = 1; i <= 10; i++) {
			maxHeap.push(i);
		}
		
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(maxHeap.pop());
			if (i % 2 == 0) maxHeap.push(i*2);
		//	maxHeap.printHeapArray();
			
		}
		
		while (maxHeap.isEmpty() == false) {
			System.out.println(maxHeap.pop());
		}
	}

}
