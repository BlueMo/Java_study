package templatemethod;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�");
	}
	
	final public void run() {			// final�� �����Ͽ� �����Ǹ� ���ϰ� ����
		// �帧 ����
		startCar();
		drive();
		stop();
		turnOff();
	}
}
