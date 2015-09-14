/*
오버로딩(다중정의)
  1. 자바 다형성구현기법 중의하나이다.
  2. 정의: 같은메쏘드 이름으로 여러개를 정의하는방법
           - 규칙: 
               * 메쏘드의 이름이 같아야한다.
               * 메쏘드의 인자의 숫자가 다르거나
               * 메쏘드의 인자의 타입이 달라야한다.
               * 메쏘드의 리턴타입,접근지정자는 상관없다.

*/
public class Overloading {

	public void method(){
		System.out.println("null");
		
	}
	
	public void method(String msg){
		System.out.println("Overloading.methode(String msg1 :"+msg);
		
	}
	
	public void method(String msg1, String msg2){
		System.out.println("Overloading.methode(String msg1, String msg2 :"+msg1+msg2);
		
	}
	
	public void method(String msg, int age ){
		System.out.println("Sting msg, int age"+msg+age);
		
	}
	
}
