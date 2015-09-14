package control;

public class SleepThread extends Thread{

	//run method는 thorws 구문 사용할 수 없음
	@Override
	public void run(){
		//super.run();
		/*
		 * public static void sleep(long millis throws InterruptedException
		 * slepp메소드는 InterruptedException 발생
		 */
		try {
			System.out.println("A."+Thread.currentThread().getName()+"실행");
			System.out.println("B."+Thread.currentThread().getName()+"쓰레드 sleep  5초 대기 ");
			Thread.sleep(5000);
			System.out.println("C."+Thread.currentThread().getName()+"쓰레드 awake");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //5초 sleep메소드단위 long 타입 밀리세컨즈
		
	}
	
}
