/*
 * �������̵�(������)
 *   1. ��Ӱ��迡�� �߻��ϴ� �޽���� ������ ����̴�
 *   2. �ڹ��� ������ ��������ϳ��̴�.
 *   
 *   -���� : �θ�Ŭ���������� �� �޽���� �̸�,����Ÿ��,���ڰ�
 *          ������ �޽�带 �ڽ�Ŭ������ ����(������)�ϴ°�
 * 
 *   - ex> public class Super{
 *   			public void print(){
 *   			}		
 *   		}
 *        
 *        public class Sub extends Super{
 *        		public void print(){
 *        		}
 *        }
 * 
 */


public class Parent extends Object {

	public int member1;
	public int member2;
	
	public void method1(){
		System.out.println("method1()-->member1: "+this.member1);
	}
	public void method2(){
		System.out.println("method2()-->member2: "+this.member2);
		
	}
	public void print(){
		
		System.out.println("member1 : "+ this.member1);
		System.out.println("member2 : "+ this.member2);
	}
}
