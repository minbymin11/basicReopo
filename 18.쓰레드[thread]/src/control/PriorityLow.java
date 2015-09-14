package control;

public class PriorityLow extends Thread{
	
	@Override
	public void run() {
		while (true) {
			System.out.print("low");
		}
	}

}
