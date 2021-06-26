package computer;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer computer = new Desktop();
		computer.display();
		computer.typing();
		
		Notebook myNote = new MyNotebook();
		
		myNote.display();
		myNote.typing();
		
	}

}
