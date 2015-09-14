/* OOP 의 방법 
 *   1. 캡슐화
 *   2. 상속성
 *   3. 다형성(오버로딩,오바라이딩,객체형변환)
 */

/*
 * 1. 캡슐화
 *    - 외부클래스에(객체)서 멤버변수에 접근을 막고
 *      멤버 메쏘드에만 접근할수있도록 클래스를 설계하는방법
 *      
 *    - 구현 : 멤버변수 의 접근제한자를 private
 *              멤버변수의 접근제한자는 public 으로한다. 
 *              public ==> 어떤 외부클래스(객체)에서든지 접근가능
 *              private==> 어떤 외부클래스(객체)에서든지 접근불가능
 */

public class EncapsulationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//데이터 셋팅
		Encapsulation ec= new Encapsulation();
		//ec.member1=100;
		ec.setMember1(100);
		//ec.member2=200;
		ec.setMember2(200);
		
		//System.out.println(ec.member1);
		//System.out.println(ec.member2);
		//getMember 메소드 호출해서 리턴값 반환
		int m1=ec.getMember1();
		int m2=ec.getMember2();
		System.out.println(m1);
		System.out.println(m2);
		ec.print();
		
		
	
	}

}
