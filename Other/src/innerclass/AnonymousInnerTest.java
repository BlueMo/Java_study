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
					
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outter.sNum = " + Outer.sNum + "(외부 클래스 정적 변수)");
				
			}
		}
		return new MyRunnable();
	}
}

public class AnonymousInnerTest {

	public static void main(String[] args) {
			
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);	// 생성 후 method 종료 -> 스택 영역 초기화
		
		runner.run();	// 메소드 내 변수가 final이 아닐 시 스택 영역이 초기화되어있어 참조가 불가능함
	}

}
