package control;

public class ClockThreadMain {

	public static void main(String[] args) throws InterruptedException {

		ClockThread ct = new ClockThread();
		ct.isPlay=true;
		ct.start();
		
		Thread.sleep(100000);
		ct.isPlay=false;
		
	}

}
