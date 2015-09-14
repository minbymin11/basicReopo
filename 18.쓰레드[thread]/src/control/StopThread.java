package control;

public class StopThread extends Thread{
	
		boolean isplay = true;
	@Override
	public void run() {
			while(isplay){
				System.out.println("work1");
				System.out.println("work2");
				System.out.println("work3");
				System.out.println("work4");
				System.out.println("work5");
				System.out.println("work6");
				System.out.println("work7");
			}
		
		return; //VM으로 스레드가 반환되서 끝남
	}
	
}
