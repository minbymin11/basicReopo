package layout;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
/*
GUI 프로그램방법
	1. 컨테이너준비(Frame,Dialog,Window)
    2. 컴포넌트 준비 (Button,List,Canvas,TextArea,TextField)
	3. 컨테이너에 컴포넌트를 붙인다.(add)
	4. 컨테이너의 크기설정
	5. 컨테이너 보여주기.
*/
public class NullLayoutFrame extends Frame {
	Button loginB,cancleB;
	Label idL,passL;
	TextField idTF,passTF;
	
	public NullLayoutFrame() {
		
		loginB=new Button("로그인");
		cancleB=new Button("치이소");
		
		loginB.setBackground(Color.BLUE);
		loginB.setForeground(Color.ORANGE);
		
		
		idL=new Label("아이디");
		passL=new Label("패쓰워드");
		idL.setForeground(Color.MAGENTA);
		idL.setBackground(Color.YELLOW);
		
		
		idTF=new TextField();
		passTF=new TextField();
		passTF.setEchoChar('●');
		/*
		 *Frame의 디폴트배치관리자를 제거
		 */
		this.setLayout(null);
		
		loginB.setBounds(50, 180, 100, 25);
		cancleB.setBounds(150, 180, 100, 25);
		idL.setBounds(50, 100, 70, 25);
		passL.setBounds(50, 140, 70, 25);
		idTF.setBounds(150, 100, 100, 25);
		passTF.setBounds(150, 140, 100, 25);
		
		add(loginB);
		add(cancleB);
		add(idL);
		add(passL);
		add(idTF);
		add(passTF);
		
		setTitle("NullLayout");
		setResizable(false);
		setSize(300, 400);
		setVisible(true);
	}

	
	public static void main(String[] args) {
		new NullLayoutFrame();

	}

}
