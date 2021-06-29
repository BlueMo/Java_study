package calc;

public interface Calc {
	
	double PI = 3.14159;
	int ERROR = -99999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("정수 계산기를 구현합니다");
		myMethod();
	}
	
	static int total(int[] arr) {
		int total = 0;
		
		for (int i : arr) total += i;
		
		// myMethod();			// Error (static method는 private static method를 사용해야함)	
		myStaticMethod();
		return total;
	}
	
	private void myMethod() {
		System.out.println("myMethond");
	}
	
	private static void myStaticMethod() {
		System.out.println("myStaticMethod");
	}
}
