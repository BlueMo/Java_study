package streamlearn;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		
		for (int num : arr) {
			System.out.println(num);
		}
		
		Arrays.stream(arr).forEach(n->System.out.println(n));
		
		IntStream is = Arrays.stream(arr);
		System.out.println(is.sum());
		
		//System.out.println(is.count());  // ���� stream ���꿡�� �̹� is�� �Ҹ�� -> ���� �����ؾ���
		
		IntStream is2 = Arrays.stream(arr);
		System.out.println(is2.count());
	}

}
