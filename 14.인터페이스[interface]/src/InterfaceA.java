/*
 �������̽�
    1. Ŭ���������� ��� �޽�尡 �߻�޽����
    2. ���߻���� ȿ���� ��
       (Ŭ������ �Ұ����ϳ� �������̽��°����ϴ�)
   -����
     * class keyword ��ſ� interface ��� keyword�����
     * �߻�޽��տ� abstract �� �������ʴ´�.
     ex>public interface Test{
     		public void method1();
     		public void method2();
        }
   - ���
       1. interface�� ���(implements)�޾Ƽ�
       2. �߻�޽�带 ������(����)���� ����Ѵ�.
       
       ex> public class TestImpl implements Test{
       			public void method1(){}
     			public void method2(){}
          }
*/
public interface InterfaceA {

	public static final int MEMBER1=1;
	public static final int MEMBER2=2;
	public void method1();
	public void method2();
	
}
