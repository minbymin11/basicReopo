package inheritance;
//부모에게 상속받으면 멤버변수, 멤버메소드는 자식의것
public class ChildA extends Parent{
 
	
	public int member3;
	public int member4;
	public void method3(){
		System.out.println("method3()--->member3 :"+this.member3);
	}
	public void method4(){
		System.out.println("method4()--->member4 :"+this.member4);
	}
	
	public void childPrint(){
		this.parentPrint();                                    //부모에게 상속받은 프린트 메소드
		System.out.println("member3 : "+ this.member3);
		System.out.println("member4 : "+ this.member4);
	}
}
