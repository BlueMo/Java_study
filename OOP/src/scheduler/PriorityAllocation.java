package scheduler;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("�켱������ ���� ���� �켱������ �����˴ϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���õ� ���� �������� �켱������ ��е˴ϴ�.");
	}

}
