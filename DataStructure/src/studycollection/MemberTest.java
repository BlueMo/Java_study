package studycollection;

public class MemberTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "�̼���");
		Member memberKim = new Member(1002, "������");
		Member memberKang = new Member(1003, "������");
		
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberKang);
		memberHashSet.showAllMember();
		System.out.println("=================================");
		
		Member memberHong = new Member(1003, "ȫ�浿");		// Set: �ߺ� ��� X
		memberHashSet.addMember(memberHong);
		memberHashSet.showAllMember();


	}

}
