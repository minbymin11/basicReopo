package create;

public class CustomThreadA extends Thread { //1. �����带 ��ӹ޴´�
	
	@Override   //2. ��ӹ��� �����带 �������Ѵ�
	public void run() {
		boolean b = true;
		while(b){
		System.out.println("A."+Thread.currentThread().getName()+" ����");
		System.out.println("B."+Thread.currentThread().getName()+" ��ȯ");
		}
		System.out.println("C."+Thread.currentThread().getName()+" ��ȯ");
	}

}
