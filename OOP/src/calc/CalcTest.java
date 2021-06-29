package calc;

public class CalcTest {

	public static void main(String[] args) {
		
		Calc calc = new CompleteCalc();
		
		int num1 = 10, num2 = 2;
		
		System.out.println(num1 + " + " + num2 + " = " + calc.add(num1, num2));
		System.out.println(num1 + " - " + num2 + " = " + calc.substract(num1, num2));
		System.out.println(num1 + " * " + num2 + " = " + calc.times(num1, num2));
		System.out.println(num1 + " / " + num2 + " = " + calc.divide(num1, num2));
		System.out.println("=========================================");
		
		num1 = 10;
		num2 = 0;
		
		System.out.println(num1 + " + " + num2 + " = " + calc.add(num1, num2));
		System.out.println(num1 + " - " + num2 + " = " + calc.substract(num1, num2));
		System.out.println(num1 + " * " + num2 + " = " + calc.times(num1, num2));
		System.out.println(num1 + " / " + num2 + " = " + calc.divide(num1, num2));
		
		CompleteCalc calc2 = new CompleteCalc();
		
		//calc.printTest();			// Error
		calc2.printTest();
		
	}

}
