package studymap;

import java.util.*;

public class MemberTreeSet {
	
	private TreeSet<Member> treeSet;

	public MemberTreeSet(){
		treeSet = new TreeSet<Member>(new Member());	// comparator�� ����� �� comparator ��� ��ü�� ����������
	}
	
	public void addMember(Member member){
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId){

		Iterator<Member> it = treeSet.iterator();
		
		while(it.hasNext()){
			Member member = it.next();
			if(member.getMemberId() == memberId){
				it.remove();
				return true;
			}
		}
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�");
		return false;
	}
	
	public void showAllMember(){
		treeSet.forEach(member -> System.out.println(member));
	}

}
