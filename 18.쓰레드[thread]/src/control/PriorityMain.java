package control;

public class PriorityMain {

	public static void main(String[] args) {

		PriorityHigh ph = new PriorityHigh();
		PriorityLow pl = new PriorityLow();
		
		// 각 스레드 우선순위 부여
		ph.setPriority(10);			
		pl.setPriority(3);
		//스레드 시작
		ph.start();
		pl.start();
	}

}
 