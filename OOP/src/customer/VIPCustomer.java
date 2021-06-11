package customer;

public class VIPCustomer extends Customer {
	
	private int agentID;
	private String agentNumber;
	double salesRatio;
	
	/*public VIPCustomer() {
		// super();  // 상위 클래스 생성자 호출 (default)
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}*/
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);	// 상위 클래스의 생성자가 필요로하는 매개 변수 입력
		
		this.agentID = agentID;
		agentNumber = switch(agentID) {
		case 100 -> "010-1234-6789";
		case 101 -> "010-2345-6790";
		case 102 -> "010-3456-1234";
		default -> "잘못된 agentID 입니다: " + Integer.toString(agentID);
		};
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return (int)(price * (1 - salesRatio));
	}
	
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "담당 상담원 번호: " + agentNumber;
	}
	
	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
}
