package gamelevel;

public abstract class PlayerLevel {
	
	public abstract void run();
	public abstract boolean jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go(int count) {
		run();
		while (count-- > 0) {
			if (jump() == true) break;
		}
		turn();
		showLevelMessage();
	}
}
