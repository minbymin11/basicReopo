
public class Parent extends Object {

	private String member1;
	private String member2;
	
	//�⺻������ - ���ڰ��� �ϳ��� ���� ������
	public Parent() {
		//super(); //object ();
		System.out.println("Parent() : �⺻������");//�⺻������ ȣ��ƾ��
	}

	public Parent(String member1, String member2) {
		this.member1 = member1;
		this.member2 = member2;
		System.out.println("String member1, String member2, String member3");
	}

	//getter, setter
	public String getMember1() {
		return member1;
	}

	public String getMember2() {
		return member2;
	}

	public void setMember1(String member1) {
		this.member1 = member1;
	}

	public void setMember2(String member2) {
		this.member2 = member2;
	}
	
}
