package trycatchlearn;

import java.io.FileInputStream;
import java.io.IOException;

public class ThrowsException {
	
	@SuppressWarnings("all")
	public Class loadClass(String fileName, String className) throws ClassNotFoundException, IOException {
		
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		
		if (fis != null) fis.close();
		return c;
	}
	
	public static void main(String[] args) {
	
		ThrowsException test = new ThrowsException();
		
		try {
			test.loadClass("a.txt", "abc");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("end");
	}
}
