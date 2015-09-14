package basic;

import java.awt.Color;
import java.awt.Frame;

public class ChildFrame extends Frame{

	public ChildFrame() {
		this.setTitle("상속에의한 프레임준비");
		this.setBackground(Color.LIGHT_GRAY);
		this.setSize(300, 400);
		this.setVisible(true);
	}
	//메인이 클래스에 포함됨
	public static void main(String[] args) {
		// ChildFrame f = new ChildFrame();
		new ChildFrame();
	}
	
	
}
