package stringconcat;

public class StringConcatTest {

	public static void main(String[] args) {
		StringConcatImpl strConcat = new StringConcatImpl();
		String s1 = "Hello ";
		String s2 = "World!";
		
		strConcat.makeString(s1, s2);
		
		StringConcat strConcatLambda = (x, y) -> System.out.println(x + y);
		strConcatLambda.makeString(s1, s2);
		
		// ���� lambda���� �Ʒ��ڵ�� ��ȯ�Ǿ� ����� (Anonymous inner class)
		StringConcat strConcatLambda2 = new StringConcat() {

			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + s2);
			}
			
		};
		strConcatLambda2.makeString(s1, s2);
	}

}
