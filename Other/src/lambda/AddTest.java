package lambda;

public class AddTest {

	public static void main(String[] args) {
		Add add = (x, y) -> x + y;			// functional interface : �� �ϳ��� abstract method�� ���� �� ����
		Add substract = (x, y) -> x - y;
	
		System.out.println(add.apply(2, 3));
		System.out.println(substract.apply(2, 3));
	}

}
