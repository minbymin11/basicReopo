/*
�����ε�(��������)
  1. �ڹ� ������������� �����ϳ��̴�.
  2. ����: �����޽�� �̸����� �������� �����ϴ¹��
           - ��Ģ: 
               * �޽���� �̸��� ���ƾ��Ѵ�.
               * �޽���� ������ ���ڰ� �ٸ��ų�
               * �޽���� ������ Ÿ���� �޶���Ѵ�.
               * �޽���� ����Ÿ��,���������ڴ� �������.

*/
public class Overloading {

	public void method(){
		System.out.println("null");
		
	}
	
	public void method(String msg){
		System.out.println("Overloading.methode(String msg1 :"+msg);
		
	}
	
	public void method(String msg1, String msg2){
		System.out.println("Overloading.methode(String msg1, String msg2 :"+msg1+msg2);
		
	}
	
	public void method(String msg, int age ){
		System.out.println("Sting msg, int age"+msg+age);
		
	}
	
}
