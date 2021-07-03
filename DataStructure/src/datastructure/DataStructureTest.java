package datastructure;

public class DataStructureTest {

	public static void main(String[] args) {
		LinkedList<Integer> intList = new LinkedList<>();
		
		intList.insertElement(123);
		
		for (int i = 1; i < 12; i++) intList.insertElement(i+1, i);
		
		for (int i = 0; i < intList.size(); i++) System.out.println(intList.getElement(i));
		
		intList.removeElement(0);
		for (int i = 0; i < intList.size(); i++) System.out.println(intList.getElement(i));
		intList.removeElement(intList.size()-1);
		for (int i = 0; i < intList.size(); i++) System.out.println(intList.getElement(i));
	}

}
