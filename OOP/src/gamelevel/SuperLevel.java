package gamelevel;

public class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("��û ������ �޸��ϴ�.");
	}

	@Override
	public boolean jump() {
		System.out.println("���� ���� jump �մϴ�.");
		return false;
	}

	@Override
	public void turn() {
		System.out.println("turn �մϴ�.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****** ����� �����Դϴ�. ******");
	}
	
}
