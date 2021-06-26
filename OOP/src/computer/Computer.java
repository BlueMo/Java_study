package computer;

public abstract class Computer {
	
	abstract void display();
	abstract void typing();
	
	public void turnOn() {
		System.out.println("컴퓨터를 킵니다");
	}
	
	public void turnOff() {
		System.out.println("컴퓨터를 끕니다");
	}
}