package customer;

public class VIPCustomer extends Customer {
	
	private int agentID;
	private String agentNumber;
	double salesRatio;
	
	/*public VIPCustomer() {
		// super();  // ���� Ŭ���� ������ ȣ�� (default)
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}*/
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);	// ���� Ŭ������ �����ڰ� �ʿ���ϴ� �Ű� ���� �Է�
		
		this.agentID = agentID;
		agentNumber = switch(agentID) {
		case 100 -> "010-1234-6789";
		case 101 -> "010-2345-6790";
		case 102 -> "010-3456-1234";
		default -> "�߸��� agentID �Դϴ�: " + Integer.toString(agentID);
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
		return super.showCustomerInfo() + "��� ���� ��ȣ: " + agentNumber;
	}
	
	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
}
