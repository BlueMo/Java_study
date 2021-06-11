package customer;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10000, "Lee");
		VIPCustomer customerKim = new VIPCustomer(10001, "Kim", 100);
		Customer customerMoon = new VIPCustomer(10002, "Moon", 101);		// Class up-casting
		// customerMoon.salesRatio = 0.1;	// Error : Class up-casting -> VIPCustomer() Class ����, �޼���� ���ٺҰ�
		Customer customerCha = new GoldCustomer(10003, "Cha");
		
		/*int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		int priceMoon = customerMoon.calcPrice(10000);		// Up-casting�� �Ǵ��� �ν��Ͻ� Ÿ���� �޼��尡 ȣ��� (Virtual method)
 		System.out.println(customerLee.customerName + ": " + priceLee + "\n" + 
						   customerKim.customerName + ": " + priceKim + "\n" +
						   customerMoon.customerName + ": " + priceMoon);
 		*/
 		
		// ������(Polymorphism)
		ArrayList<Customer> customerList = new ArrayList<>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerMoon);
		customerList.add(customerCha);
		
		System.out.println("==== �� ���� ====");
		for (Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("==== ������, ���ʽ� ����Ʈ ��� ====");
		for (Customer customer : customerList) {
			int cost = customer.calcPrice(10000);
			System.out.println(customer.getCustomerName() + "���� " + cost + "�� �����Ͽ����ϴ�.");
			System.out.println(customer.getCustomerName() + "���� ���� ���ʽ� ����Ʈ: " + customer.bonusPoint + "���Դϴ�.");
		}
	}

}
