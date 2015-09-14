package general;

public class SpecialMember extends GeneralMember{
	public int bounusPoint; //GeneralMember만 갖고있는 멤버변수
	public SpecialMember() {
		// TODO Auto-generated constructor stub
	}
	//부모로부터 no, address, bonusPoint 상속 받았으나 캡슐화때문에 직접 접근은 불가능
	//this.no=no 불가능
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
		this.gPrint();//부모에게 상속받은 프린트 메소드 호출로 넘버, 이름, 주소 출력
		System.out.println(bounusPoint); 
	}

}
