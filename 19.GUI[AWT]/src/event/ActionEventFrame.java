/*
Event program���

  1. XXXEvent Source ����(Button)--> ActionEvent
  2. XXXEvent Handler �ۼ�(Ŭ����)-->ActionEvent�� ó���� Handler�ۼ�
  	-XXEvent�� ����(ó��)�Ҽ��ִ� XXXLListener interface�� implement
  		-->ActionEvent�� ����(ó��)�Ҽ��ִ� ActionListener interface�� implement
  		
  3. Event Source �� Event Handler�� �������ش�.
  	-->ActionEvent source �� ActionEvent Handler�� �������ش�.
  	ex> eventSourceRef.addXXXListener(eventHanderRef);
  	
  
  
  # XXXEvent Handler Ŭ���� �ۼ����
       1.XXXEvent�� �����Ҽ��ִ� XXXListener interface�� implement
       (WindowEvent)       (WindowListener)
  	   2.XXXListener �߻�޽�� ����..
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
		b1.addActionListener(actionEventHandler); //addActionListener�� ���������� �־������
		
		setSize(300, 400);
		setVisible(true);
	}
	/***********member inner class******************/
	public class ActionEventHandler implements ActionListener{
		int count;
		@Override
		public void actionPerformed(ActionEvent e) { //�̺�Ʈ �߻��� ����

			System.out.println("button click");
			//ActionEventFrame Title ����
			setTitle("button click"+ ++count);
		}

	}


	public static void main(String[] args) {
		new ActionEventFrame();
		
	}

}
