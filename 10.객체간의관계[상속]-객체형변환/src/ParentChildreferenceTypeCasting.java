import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

/*
 객체의 형변환
   1. 부모자식관계에있는 클래스들에서만 가능하다.
   
   2. 자식객체주소를 부모클래스타입으로 형변환
       - 자동으로 이루어진다(묵시적)
       Child c = new Child();
       Parent pppp = c; 
   3. 부모 객체를 자식클래스타입으로 형변환
       - 원칙적으로는 불가능하다
       - 부모의 탈을쓴 자식객체는 가능하다.
       Parent p=new Parent();
       Child cccc = p;(X)
    public class Parent{}
    public class Child extends Parent{}
 */

public class ParentChildreferenceTypeCasting {
	//2. 자식객체주소를 부모클래스타입으로 형변환
	
	public static void main(String[] args){
		Child c1 = new Child();
		Parent p1 = c1;
		
		c1.member1=1;
		c1.member2=2;
		c1.member3=3;
		c1.method1();
		c1.method2();
		c1.method3();
		
		p1.member1=1;
		p1.member2=2;
	//	p1.member3=3;
		p1.method1();
		p1.method2();
	//	p1.method3();

/*
 *    3. 부모 객체를 자식클래스타입으로 형변환
       - 원칙적으로는 불가능하다

 */
		Parent p2 = new Parent();
//		Child c2 = p2;
		
//		- 부모의 탈을쓴 자식객체는 가능하다.
		Parent p3 = new Child();
		
		Child c3 = (Child)p3;
	}
	
}
