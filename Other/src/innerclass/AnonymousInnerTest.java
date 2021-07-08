package innerclass;

class Outer{
	
	int outNum = 100;
	static int sNum = 1;
	
	Runnable getRunnable(final int i) {
		
		int num = 10;		// Effectively final
		
		class MyRunnable implements Runnable {
			
			int localNum = 1000;
			@Override
			public void run() {
				
				System.out.println("i =" + i); 
				System.out.println("num = " +num);  
				System.out.println("localNum = " +localNum);
					
				System.out.println("outNum = " + outNum + "(�ܺ� Ŭ���� �ν��Ͻ� ����)");
				System.out.println("Outter.sNum = " + Outer.sNum + "(�ܺ� Ŭ���� ���� ����)");
				
			}
		}
		return new MyRunnable();
	}
}

public class AnonymousInnerTest {

	public static void main(String[] args) {
			
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);	// ���� �� method ���� -> ���� ���� �ʱ�ȭ
		
		runner.run();	// �޼ҵ� �� ������ final�� �ƴ� �� ���� ������ �ʱ�ȭ�Ǿ��־� ������ �Ұ�����
	}

}
