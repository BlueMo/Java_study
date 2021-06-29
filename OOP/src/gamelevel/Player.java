package gamelevel;

public class Player {
	
	private PlayerLevel level = null;
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public void upgradeLevel() {
		if (level instanceof BeginnerLevel) {
			level = new AdvancedLevel();
		}
		else if (level instanceof AdvancedLevel) {
			level = new SuperLevel();
		}
		else {
			System.out.println("�̹� �ִ� �����Դϴ�.");
		}
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void play(int count) {
		level.go(count);
	}
}
