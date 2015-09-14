package control;

public class StopThreadMain {

	public static void main(String[] args) throws InterruptedException {

		StopThread st = new StopThread();
		st.start();
		
		Thread.sleep(8000);
		
		/*******************case1****************** */
		st.isplay=false;
		
		/******************case2******************/
		st.stop();
		
	}

}
