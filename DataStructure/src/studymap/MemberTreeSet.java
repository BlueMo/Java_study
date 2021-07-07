package studymap;

import java.util.*;

public class MemberTreeSet {
	
	private TreeSet<Member> treeSet;

	public MemberTreeSet(){
		treeSet = new TreeSet<Member>(new Member());	// comparator를 사용할 땐 comparator 대상 객체를 명시해줘야함
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
		
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}
	
	public void showAllMember(){
		treeSet.forEach(member -> System.out.println(member));
	}

}
