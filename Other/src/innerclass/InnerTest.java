package innerclass;

class OutClass {
	
	private int num = 100;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass {
		
		int inNum = 100;
		//static int sInNum = 200;			// Error: InnerClass는 OuterClass가 생성된 후 생성됨
		
		void inTest(){
			System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수)");
		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
	static class InStaticClass{
			
			int inNum = 100;
			static int sInNum = 200;
			
			void inTest(){
				//num += 10;    // 외부 클래스의 인스턴스 변수는 사용할 수 없음.
				System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)"); 
				System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");
				System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
			}
			
			static void sTest(){
				//num += 10;   // 외부 클래스의 인스턴스 변수는 사용할 수 없음.
				//inNum += 10; // 내부 클래스의 인스턴스 변수는 사용할 수 없음
				
				System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
				System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");
				
			}
		}	

}

public class InnerTest {

	public static void main(String[] args) {
		
		OutClass outClass = new OutClass();
		
		outClass.usingClass();
		
		OutClass.InClass inner = outClass.new InClass();	// 보통 inner class는 private로 선언하여 이렇게 사용하지 않음
		inner.inTest();
		
		OutClass.InStaticClass.sTest();
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		
	}

}
