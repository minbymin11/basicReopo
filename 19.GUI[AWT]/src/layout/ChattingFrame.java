
package layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class ChattingFrame extends Frame {

	Label chatL;
	TextField chatTF;
	TextArea chatTA;
	Button sendB;
	List chatList;
	Panel	 southP; 
	
	public ChattingFrame() {
		
		setFont(new Font(Font.SERIF,Font.BOLD,17));
		setTitle("채팅");
		
		chatL = new Label("가가라이브",Label.CENTER);
		chatL.setBackground(Color.orange);
		chatL.setForeground(Color.blue);
		chatTA = new TextArea();
		chatTF = new TextField();
		chatTA.setEditable(false);
		chatTA.append("ㅇㅈ?\n");
		chatTA.append("ㅇㅇ?\n");
		
		
		chatList= new List();
		chatList.add("user1");
		chatList.add("user2");
		chatList.add("user3");
		chatList.add("user4");
		chatList.add("user5");
		chatList.add("user6");
		
		southP=new Panel();
		southP.setBackground(Color.green);
		
		chatTF=new TextField(30);
		sendB =new Button("전송");
		
		southP.setLayout(new FlowLayout());
		southP.add(chatTF);
		southP.add(sendB);
		
		
		setLayout(new BorderLayout());
		add(chatL,BorderLayout.NORTH);
		add(chatTA,BorderLayout.CENTER);
		add(chatList,BorderLayout.WEST);
		add(southP,BorderLayout.SOUTH);
		
		
		
		setSize(400, 500);
		setVisible(true);
		chatTF.requestFocus();
			
	}
	public static void main(String[] args) {
		new ChattingFrame();
	}

}
