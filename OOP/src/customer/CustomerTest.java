package customer;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10000, "Lee");
		VIPCustomer customerKim = new VIPCustomer(10001, "Kim", 100);
		Customer customerMoon = new VIPCustomer(10002, "Moon", 101);		// Class up-casting
		// customerMoon.salesRatio = 0.1;	// Error : Class up-casting -> VIPCustomer() Class 변수, 메서드는 접근불가
		Customer customerCha = new GoldCustomer(10003, "Cha");
		
		/*int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		int priceMoon = customerMoon.calcPrice(10000);		// Up-casting이 되더라도 인스턴스 타입의 메서드가 호출됨 (Virtual method)
 		System.out.println(customerLee.customerName + ": " + priceLee + "\n" + 
						   customerKim.customerName + ": " + priceKim + "\n" +
						   customerMoon.customerName + ": " + priceMoon);
 		*/
 		
		// 다형성(Polymorphism)
		ArrayList<Customer> customerList = new ArrayList<>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerMoon);
		customerList.add(customerCha);
		
		System.out.println("==== 고객 정보 ====");
		for (Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("==== 할인율, 보너스 포인트 계산 ====");
		for (Customer customer : customerList) {
			int cost = customer.calcPrice(10000);
			System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불하였습니다.");
			System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트: " + customer.bonusPoint + "점입니다.");
		}
	}

}
