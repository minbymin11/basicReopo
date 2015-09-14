package control;

import java.util.Date;

public class ClockThread extends Thread{

	boolean isPlay=false;
	
	@Override
	public void run() {
		while(isPlay){
			try {
				Thread.sleep(1000);
				System.out.println(new Date().toString());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
