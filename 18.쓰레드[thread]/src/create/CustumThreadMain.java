package create;

public class CustumThreadMain {

	public static void main(String[] args) {
		System.out.println("1. main ");
		CustomThreadA ct1 = new CustomThreadA();//3. 스레드 글래스 객체 생성
//		CustomThreadA ct2=new CustomThreadA();
		CustomThreadB ct3=new CustomThreadB();
		ct1.start();  																//4. 스레드 시작
		ct3.start();
		boolean b=true;
		//while(b){
		System.out.println("98. main working............ ");
		//}
		System.out.println("99. main jvm--->return "); 
	}

}
