/*
쓰레드: 
   - 프로그램코드를 실행시키는 힘 
   - 메인쓰레드,AWT 쓰레드,사용자정의 쓰레드
   - 언제 만드냐--> 두가지일을 동시에 해야할때..
 
- 쓰레드객체 만드는 방법(형식)
	type A:
	1. Thread 클래스를 상속받는다.
	2. Thread class의 run method를 overriding 한다.
		동사원형:public void run()
	3. Thread 객체를 생성한다.
	4. Thread를 시작시킨다.

    type B:
	1. Runnable interface를 implements 한다.
	2. Runnable interface를 implements 한객체를
	   Thread 클래스의 생성자에 넣어서 Thread 객체를 생성한다
    	3. Thread 를 시작시킨다.

   형식>>
    1. Thread 클래스를 상속받아서 만든다..
      ex> class ThreadEx extends Thread{
          		// run 메쏘드를 재정의 해야한다.
          		 public void run(){
          		 	//사용자가만든 쓰레드 가 실행할코드
          		 }
          } 
    2. Runnable interface를 implements 해서만든다
      ex>  class ThreadImpl implements Runnable{
           		public void run(){
          		 }
           } 

*/
package main;

public class MainThreadMain {

	public static void main(String[] args) {
		Thread mainThread=Thread.currentThread();  // 현재 사용하고 있는 스레드 객체 반환?
		String name = mainThread.getName();				// 	현재 사용하는 스레드 이름 반환
		System.out.println("1. current Thread name: "+ name); // 현재 사용하는 스레드 출력해봐
		int priority = mainThread.getPriority(); // 현재 스레드의 우선순위는?
		System.out.println("2. current Thread priority: "+priority);
		
		MainThreadCalled mtc= new MainThreadCalled();  //메인스레드에서 mainthreadcalled객체 호출 반환
		mtc.main_called();
		System.out.println("3. main JVM---return");
		
	}

}
