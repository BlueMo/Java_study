package trycatchlearn;

public class AutoCloseableObj implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("obj close");
	}
	
	
}
