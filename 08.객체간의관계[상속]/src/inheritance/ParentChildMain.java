package inheritance;

public class ParentChildMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p1 = new Parent(); //Parent class로 p1객체 생성
		p1.member1=100;
		p1.member2=200;
		p1.method1();
		p1.method2();
		
		System.out.println("-----------childA---------");
		/*
		 *ChildA 객체는 멤버변수 3,4밖에 없는데 부모로부터 멤버변수 1,2를 상속 받아서 사용가능하다
		 *ChildA 객체는 멤버메소드 3,4밖에 없는데 무모로 부터 멤버메소드 3,4를 상속받아서 사용가능
		 *부모로 부터 상복받은 ChildA는 부모의 멤버변수, 멤버메소드 모두 사용가능하다
		 */
		ChildA ca1 = new ChildA();
		ca1.member1 = 111;
		ca1.member2 = 222;
		ca1.member3 = 333;
		ca1.member4 = 444;
		ca1.method1();
		ca1.method2();
		ca1.method3();
		ca1.method4();
		ca1.childPrint();
		String ca1Str=ca1.toString();
		System.out.println(ca1Str);
		
		
		System.out.println("-----------childB---------");
		ChildB cb1 = new ChildB();
		cb1.member1 = 1234;
		cb1.member2 = 5555;
		cb1.isMarried= true;
		cb1.name="KANG";
		cb1.method1();
		cb1.method2();
		cb1.childPrint();
	}

}
