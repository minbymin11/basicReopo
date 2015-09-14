package main;

public class MainThreadCalled {

	public void main_called(){
		System.out.println("A"+Thread.currentThread().getName()+" 실행"); 
		System.out.println("B"+Thread.currentThread().getName()+" 반환");
	}
}
