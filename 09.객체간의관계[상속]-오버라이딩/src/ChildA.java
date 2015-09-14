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
	@Override
	public void print(){//부모객체에도 print()가 있는데 자식객체에서 동일한 이름을 사용하면서 재정의됨
		/*
		 * super : 부모로부터 상속받아 은폐된 메소드의 호출시사용하는 셀프참조변수
		 */
	   //this.parentPrint();                                    //부모에게 상속받은 프린트 메소드
		super.print();// 부모에게 상속받은 프린트 메소드 사용
		System.out.println("member3 : "+ this.member3);//자식객체에서 재정의한 프린트메소드 사용
		System.out.println("member4 : "+ this.member4);
	}
}
