package travel;

import java.util.*;

public class TravelTest {

	public static void main(String[] args) {
		List<TravelCustomer> list = new ArrayList<TravelCustomer>();
		
		list.add(new TravelCustomer("Moon", 26, 1000));
		list.add(new TravelCustomer("Lee", 25, 1500));
		list.add(new TravelCustomer("Kim", 30, 1200));
		
		System.out.println("고객 명단 출력");
		list.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		int cost = list.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("여행 비용 총합: " + cost);
		
	}

}
