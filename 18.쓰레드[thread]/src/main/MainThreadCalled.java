package main;

public class MainThreadCalled {

	public void main_called(){
		System.out.println("A"+Thread.currentThread().getName()+" ����"); 
		System.out.println("B"+Thread.currentThread().getName()+" ��ȯ");
	}
}
