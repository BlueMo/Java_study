package gamelevel;

public class AdvancedLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("���� �޸��ϴ�");
	}

	@Override
	public boolean jump() {
		System.out.println("���� jump �մϴ�");
		return false;
	}

	@Override
	public void turn() {
		System.out.println("turn ��������");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****** �߱��� �����Դϴ�. ******");
	}
	
}
