package studycollection;

import java.util.*;

public class MemberHashSet {
	
	private HashSet<Member> hashSet;

	public MemberHashSet(){
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member){
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId){

		Iterator<Member> it = hashSet.iterator();
		
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
		hashSet.forEach(member -> System.out.println(member));
	}

}
