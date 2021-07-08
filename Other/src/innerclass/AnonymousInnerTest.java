package innerclass;

class Outer{
	
	int outNum = 100;
	static int sNum = 1;
	
	/*
	// Method-local inner class example
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
	*/
	
	// Anonymous inner class example
	Runnable getRunnable(final int i) {
		
		int num = 10;		// Effectively final
		
		return new Runnable() {
			
			int localNum = 1000;
			@Override
			public void run() {
				
				System.out.println("i =" + i); 
				System.out.println("num = " +num);  
				System.out.println("localNum = " +localNum);
					
				System.out.println("outNum = " + outNum + "(�ܺ� Ŭ���� �ν��Ͻ� ����)");
				System.out.println("Outter.sNum = " + Outer.sNum + "(�ܺ� Ŭ���� ���� ����)");
				
			}
		};
	}
	
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable �� ������ Anonymous Class");
		}
	};
}

public class AnonymousInnerTest {

	public static void main(String[] args) {
			
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);	// ���� �� method ���� -> ���� ���� �ʱ�ȭ
		
		runner.run();	// �޼ҵ� �� ������ final�� �ƴ� �� ���� ������ �ʱ�ȭ�Ǿ��־� ������ �Ұ�����
		
		out.runner.run();
	}

}
