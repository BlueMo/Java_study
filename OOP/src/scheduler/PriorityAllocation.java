package scheduler;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("우선순위가 높은 고객이 우선적으로 배정됩니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("숙련도 높은 상담원에게 우선적으로 배분됩니다.");
	}

}
