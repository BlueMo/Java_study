package studymap;

import java.util.*;

public class MemberHashMap {
	
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if (hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�");
		return false;
	}
	
	public void showAllMember() {
		hashMap.forEach((memberId, member) -> System.out.println(member));
	}
}
