package layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowLayoutFrame extends Frame {
	Button b1,b2,b3,b4,b5;

	public FlowLayoutFrame() {
		b1=new Button("FIRST");
		b2=new Button("SECOND");
		b3=new Button("THIRD");
		b4=new Button("FORTH");
		b5=new Button("FIFTH");
		
		FlowLayout fl=new FlowLayout();
		setLayout(fl); 
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		
		
		
		setSize(300, 400);
		setVisible(true);
	}

	
	
	
	public static void main(String[] args) {
		new FlowLayoutFrame();
	}

}
