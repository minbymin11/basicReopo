package control;

public class SleepThreadMain {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("1.main");	
		SleepThread st = new SleepThread();
			st.start();
			System.out.println("2.main sleep  10초 대기");
			Thread.sleep(10000);
			System.out.println("3.main 10초 대기후 awake");
			
			System.out.println("99.main return");	
	}

}
