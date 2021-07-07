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
		//static int sInNum = 200;			// Error: InnerClass�� OuterClass�� ������ �� ������
		
		void inTest(){
			System.out.println("OutClass num = " +num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass inNum = " + inNum + "(���� Ŭ������ �ν��Ͻ� ����)");
		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
	static class InStaticClass{
			
			int inNum = 100;
			static int sInNum = 200;
			
			void inTest(){
				//num += 10;    // �ܺ� Ŭ������ �ν��Ͻ� ������ ����� �� ����.
				System.out.println("InStaticClass inNum = " + inNum + "(���� Ŭ������ �ν��Ͻ� ���� ���)"); 
				System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������ ����ƽ ���� ���)");
				System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ���� ���)");
			}
			
			static void sTest(){
				//num += 10;   // �ܺ� Ŭ������ �ν��Ͻ� ������ ����� �� ����.
				//inNum += 10; // ���� Ŭ������ �ν��Ͻ� ������ ����� �� ����
				
				System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ���� ���)");
				System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������ ����ƽ ���� ���)");
				
			}
		}	

}

public class InnerTest {

	public static void main(String[] args) {
		
		OutClass outClass = new OutClass();
		
		outClass.usingClass();
		
		OutClass.InClass inner = outClass.new InClass();	// ���� inner class�� private�� �����Ͽ� �̷��� ������� ����
		inner.inTest();
		
		OutClass.InStaticClass.sTest();
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		
	}

}
