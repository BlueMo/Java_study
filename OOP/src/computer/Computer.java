package computer;

public abstract class Computer {
	
	abstract void display();
	abstract void typing();
	
	public void turnOn() {
		System.out.println("��ǻ�͸� ŵ�ϴ�");
	}
	
	public void turnOff() {
		System.out.println("��ǻ�͸� ���ϴ�");
	}
}