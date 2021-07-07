package studycollection;

import java.util.*;

public class MemberArrayList {
	
	private ArrayList<Member> memberList;
	
	public MemberArrayList() {
		memberList = new ArrayList<>();
	}
	
	public MemberArrayList(int initCapacity) {
		memberList = new ArrayList<>(initCapacity);
	}
	
	public void addMember(Member member) {
		memberList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		/*for (int i = 0; i < memberList.size(); i++) {
			Member member = memberList.get(i);
			
			if (member.getMemberId() == memberId) {
				memberList.remove(i);
				return true;
			}
		}*/
		Iterator<Member> it = memberList.iterator();
		while (it.hasNext()) {
			Member member = it.next();
			if (member.getMemberId() == memberId) {
				// memberList.remove(member);			// �˻� �߰� �ð� �ҿ�
				it.remove();
				return true;
			}
		}
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		memberList.forEach(member -> System.out.println(member) );
	}
}
