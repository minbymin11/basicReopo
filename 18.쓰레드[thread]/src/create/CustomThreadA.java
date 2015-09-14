package create;

public class CustomThreadA extends Thread { //1. 스레드를 상속받는다
	
	@Override   //2. 상속받은 스레드를 재정의한다
	public void run() {
		boolean b = true;
		while(b){
		System.out.println("A."+Thread.currentThread().getName()+" 실행");
		System.out.println("B."+Thread.currentThread().getName()+" 반환");
		}
		System.out.println("C."+Thread.currentThread().getName()+" 반환");
	}

}
