package templatemethod;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다");
	}
	
	final public void run() {			// final로 선언하여 재정의를 못하게 방지
		// 흐름 정의
		startCar();
		drive();
		stop();
		turnOff();
	}
}
