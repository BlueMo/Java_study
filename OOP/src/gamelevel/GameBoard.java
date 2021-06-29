package gamelevel;

public class GameBoard {

	public static void main(String[] args) {
		Player player = new Player();
		
		player.play(3);
		player.upgradeLevel();
		player.play(3);
		player.upgradeLevel();
		player.play(3);
		
	}

}
