package lambda;

public class AddTest {

	public static void main(String[] args) {
		Add add = (x, y) -> x + y;			// functional interface : 단 하나의 abstract method만 가질 수 있음
		Add substract = (x, y) -> x - y;
	
		System.out.println(add.apply(2, 3));
		System.out.println(substract.apply(2, 3));
	}

}
