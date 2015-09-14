/*
Event program방법

  1. XXXEvent Source 선정(Button)--> ActionEvent
  2. XXXEvent Handler 작성(클래스)-->ActionEvent를 처리할 Handler작성
  	-XXEvent를 감지(처리)할수있는 XXXLListener interface를 implement
  		-->ActionEvent를 감지(처리)할수있는 ActionListener interface를 implement
  		
  3. Event Source 와 Event Handler를 연결해준다.
  	-->ActionEvent source 와 ActionEvent Handler를 연결해준다.
  	ex> eventSourceRef.addXXXListener(eventHanderRef);
  	
  
  
  # XXXEvent Handler 클래스 작성방법
       1.XXXEvent를 감지할수있는 XXXListener interface를 implement
       (WindowEvent)       (WindowListener)
  	   2.XXXListener 추상메쏘드 구현..
	   (WindowListener)

*/
package event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ActionEventFrame extends Frame{
	Button b1;
	
	public ActionEventFrame() {
		setLayout(new BorderLayout());
		
		b1=new Button("ActionEvent Source");
		add(b1,BorderLayout.SOUTH);
		
		//event
		ActionEventHandler actionEventHandler = new ActionEventHandler();
		b1.addActionListener(actionEventHandler); //addActionListener에 참조변수를 넣어줘야함
		
		setSize(300, 400);
		setVisible(true);
	}
	/***********member inner class******************/
	public class ActionEventHandler implements ActionListener{
		int count;
		@Override
		public void actionPerformed(ActionEvent e) { //이벤트 발생시 실행

			System.out.println("button click");
			//ActionEventFrame Title 변경
			setTitle("button click"+ ++count);
		}

	}


	public static void main(String[] args) {
		new ActionEventFrame();
		
	}

}
