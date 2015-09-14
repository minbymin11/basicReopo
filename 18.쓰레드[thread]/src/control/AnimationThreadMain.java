package control;

public class AnimationThreadMain {

	public static void main(String[] args) throws InterruptedException {

		AnimationThread at = new AnimationThread();
		at.start();
		
		Thread.sleep(5000);
		
		at.isMove = false;
	}

}
