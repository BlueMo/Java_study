package singleton;

public class Company {
	
	private static Company instance = null;
	private Company() {}
	
	public static Company getInstance() {
		if (instance == null)
			instance = new Company();
		return instance;
	}
}
