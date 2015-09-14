
public class Child extends Parent{
	public String member3;
	
	//부모클래스의 기본생성자 호출
	
	public Child() {
		super(); //parent();
		System.out.println("Child() : 기본생성자");
	}

	public Child(String member1, String member2, String member3) {
		super(member1, member2);
		//this.member1 = member1;
		//this.member2 = member2;
		//this.setMember1(member1);
		//this.setMember2(member2);
		this.member3 = member3;
		System.out.println("String member1, String member2, String member3"+super.getMember1()+super.getMember2()+this.member3);
	}
	

}
