package control;

public class JoinThreadMain {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("1. main ");
		
		JoinFirstThread ft = new JoinFirstThread();
		ft.start();
		JoinSecondThread st = new JoinSecondThread();
		st.start();
	
		ft.join();   //first thread가 끝나기 전까지 main(주스레드) return이 안됨
		st.join(); //second thread가 끝나기 전까지 main return 안됨. waits for this thread to die.
		
		System.out.println("99. main ---> jvm return");
	}

}
