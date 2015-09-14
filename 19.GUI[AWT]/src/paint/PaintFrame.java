package paint;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class PaintFrame extends Frame {
	Image penguinImage1;
	Image penguinImage2;
	Image penguinImage3;
	Image backImage;
	
	public PaintFrame() {
		
		penguinImage1=Toolkit.getDefaultToolkit().getImage("penguin1.gif");
		penguinImage2=Toolkit.getDefaultToolkit().getImage("penguin2.gif");
		penguinImage3=Toolkit.getDefaultToolkit().getImage("penguin3.gif");
		backImage=Toolkit.getDefaultToolkit().getImage("penguin_back.jpg");
		setSize(300,400);
		setVisible(true);
		
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		//배경이미지
		g.drawImage(backImage, 0, 0,getWidth(),getHeight(), this);
		System.out.println("paint: "+Thread.currentThread().getName());
		//String
		g.drawString("페인트", 100, 100);
		g.setColor(Color.blue);
		g.drawLine(0, 0, getWidth(), getHeight());
		g.drawLine(getWidth(), 0, 0, getHeight());
		
		//rect
		g.setColor(Color.red);
		g.drawRect(10, 50, 50, 50);
		g.setColor(Color.orange);
		g.drawRect(10, 100, 50, 50);
		
		//circle
		g.setColor(Color.cyan);
		g.fillOval(getWidth()/2-10, getHeight()/2-10, 20, 20);
		g.drawOval(getWidth()/2-10, getHeight()/2-10, 20, 20);
		g.drawOval(getWidth()/2-20, getHeight()/2-20, 40, 40);
		
		//image
		g.drawImage(penguinImage1, 100, 300, this);
		g.drawImage(penguinImage2, 50, 300, this);
		g.drawImage(penguinImage3, 150, 300, this);
		
		
	}
	
	public static void main(String[] args) {

		new PaintFrame();
	}

}
