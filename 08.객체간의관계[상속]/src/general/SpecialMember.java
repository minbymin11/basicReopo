package general;

public class SpecialMember extends GeneralMember{
	public int bounusPoint; //GeneralMember�� �����ִ� �������
	public SpecialMember() {
		// TODO Auto-generated constructor stub
	}
	//�θ�κ��� no, address, bonusPoint ��� �޾����� ĸ��ȭ������ ���� ������ �Ұ���
	//this.no=no �Ұ���
	public SpecialMember(int no, String name, String address, int bonusPoint){
		this.setNo(no);
		this.setName(name);
		this.setAddress(address);
		this.setBounusPoint(bonusPoint);
	}
	public int getBounusPoint() {
		return bounusPoint;
	}
	public void setBounusPoint(int bounusPoint) {
		this.bounusPoint = bounusPoint;
	}
	
	public void sPrint(){
		this.gPrint();//�θ𿡰� ��ӹ��� ����Ʈ �޼ҵ� ȣ��� �ѹ�, �̸�, �ּ� ���
		System.out.println(bounusPoint); 
	}

}
