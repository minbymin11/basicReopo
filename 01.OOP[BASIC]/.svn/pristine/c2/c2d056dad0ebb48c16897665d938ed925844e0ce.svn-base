
public class MemberMethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. main start ");
		
	
		
		MemberMethod mm = new MemberMethod(); //오브젝트형 별명 = 새롭게 맍들자! 오브젝트형의 생성자호출
																//heap영역에 새로운 객체를 하나 만들겠다!!!!!!!!!!!!!!!!!!!!!!!!!!!!	
		mm.memberVar1=888;
		
		mm.print();
		
		System.out.println("가> mm.memberVar1 :"+mm.memberVar1);
		
		System.out.println("2. mm의 method1메소드를 호출");
		/*
		 * public void method1();
		 */
		mm.method1();
		System.out.println("3. mm의 method1메소드를 호출후 반환된 쓰레드가 실행");
		
		/*
		 * public void method2(String name) //메소드의 정의
		 *
		 */
		
		mm.method2("김경호");
		mm.method2("장동건");
		/**
		 * 
		 * public void method3(String name, int age)
		 * */
		
		mm.method3("양진석", 30);
		mm.method3("보거스", 45);
		
		//public String method4();
		
		String returnMsg=mm.method4();
		System.out.println("4."+returnMsg);
		
		//public int method5(int a, int b)
		
		int result = mm.method5(123, 456);
		System.out.println("5."+result);
		
		System.out.println("4. main end");
		System.out.println("5. main return");
		return;
	}

}
