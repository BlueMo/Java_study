package studymap;

public class MemberTest {

	public static void main(String[] args) {
		MemberTreeSet memberHashSet = new MemberTreeSet();
		
		Member memberLee = new Member(1005, "�̼���");
		Member memberKim = new Member(1004, "������");
		Member memberKang = new Member(1003, "������");
		
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberKang);
		memberHashSet.showAllMember();

	}

}
