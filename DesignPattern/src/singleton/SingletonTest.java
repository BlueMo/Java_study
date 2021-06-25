package singleton;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);
		
		// output : same address
	}

}
