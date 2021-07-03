package datastructure;

public class DataStructureTest {

	public static void main(String[] args) {
		MyQueue<Integer> queue = new MyQueue<Integer>();
		
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
	}

}
