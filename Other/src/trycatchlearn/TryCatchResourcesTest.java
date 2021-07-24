package trycatchlearn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchResourcesTest {
	
	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("a.txt")){  // try�� ������ resource���� �ڵ����� close ���� (AutoCloseable)
			System.out.println("Read");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return;
		} catch (IOException e) {
			e.printStackTrace();
			return;
		} finally {
			System.out.println("Finally");
		}
		System.out.println("Complete");
	}
}
