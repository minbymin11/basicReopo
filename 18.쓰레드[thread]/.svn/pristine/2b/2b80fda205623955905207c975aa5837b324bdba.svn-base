package control;

public class AnimationThread extends Thread{

	boolean isMove=true;
	@Override
	public void run() {
		int cnt=0;
		String circle="¡Û";

		while(isMove){
			try {
			String blank="";
			for (int i = 0; i < cnt; i++) {
				blank+=" ";
			}
			System.out.println(blank+circle);
			cnt++;
			
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
