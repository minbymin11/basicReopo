/*
제한자(final)
	1. 클래앞에 붙일경우
	   상속금지 
       ex> public final class Test{}
    2. 멤버메쏘드앞에 붙일경우 
       오버라이딩 금지
       ex> public final void print(){}
    3. 멤버변수 앞에붙일경우--> 상수
       ex> public final int PORT_NUMBER=80;
       상수화된다.    
       변경금지
*/

public  class FinalSuper {

	public final  int  PORT_NUMBER; //포트번호(상수) 
	
	public static final  int KOR_SCORE = 0;
	public static final int ENG_SCORE = 1;
	public static final int MATH_SCORE =2;
	
	public FinalSuper() {
		// TODO Auto-generated constructor stub
		PORT_NUMBER = 80;
	}
	
	public void method1(){
	
		System.out.println("일반 메소드");
		System.out.println("this.PORT_NUMBER:"+ this.PORT_NUMBER);
	}
	
	public final void method2(){
		System.out.println("final 메소드 : 재정의 금지=참조만가능");
	}
}
