/*
������: 
   - ���α׷��ڵ带 �����Ű�� �� 
   - ���ξ�����,AWT ������,��������� ������
   - ���� �����--> �ΰ������� ���ÿ� �ؾ��Ҷ�..
 
- �����尴ü ����� ���(����)
	type A:
	1. Thread Ŭ������ ��ӹ޴´�.
	2. Thread class�� run method�� overriding �Ѵ�.
		�������:public void run()
	3. Thread ��ü�� �����Ѵ�.
	4. Thread�� ���۽�Ų��.

    type B:
	1. Runnable interface�� implements �Ѵ�.
	2. Runnable interface�� implements �Ѱ�ü��
	   Thread Ŭ������ �����ڿ� �־ Thread ��ü�� �����Ѵ�
    	3. Thread �� ���۽�Ų��.

   ����>>
    1. Thread Ŭ������ ��ӹ޾Ƽ� �����..
      ex> class ThreadEx extends Thread{
          		// run �޽�带 ������ �ؾ��Ѵ�.
          		 public void run(){
          		 	//����ڰ����� ������ �� �������ڵ�
          		 }
          } 
    2. Runnable interface�� implements �ؼ������
      ex>  class ThreadImpl implements Runnable{
           		public void run(){
          		 }
           } 

*/
package main;

public class MainThreadMain {

	public static void main(String[] args) {
		Thread mainThread=Thread.currentThread();  // ���� ����ϰ� �ִ� ������ ��ü ��ȯ?
		String name = mainThread.getName();				// 	���� ����ϴ� ������ �̸� ��ȯ
		System.out.println("1. current Thread name: "+ name); // ���� ����ϴ� ������ ����غ�
		int priority = mainThread.getPriority(); // ���� �������� �켱������?
		System.out.println("2. current Thread priority: "+priority);
		
		MainThreadCalled mtc= new MainThreadCalled();  //���ν����忡�� mainthreadcalled��ü ȣ�� ��ȯ
		mtc.main_called();
		System.out.println("3. main JVM---return");
		
	}

}
