package inheritance;
/*
 * ���(Ŭ������ ����):
 * 	�θ�Ŭ����(��ü)�� �ν��Ͻ����������� �ڽ�Ŭ����(��ü)�� �����޴°�
 * 
 *  1. ����� ����ϴ�����--> ������ �������� Ŭ������ ����,
 * 						             Ȯ�������ػ���Ѵ�.
 *  2. �ڹٿ����� ���ϻ�Ӹ��� �����ϴ�(�θ�Ŭ������ �Ѱ�������) 
 *  3. �θ�Ŭ����(super)�� �ڽ�Ŭ����(sub)�������Ѵ�.
 *  4. �ڹٿ��� �����Ǿ����� ��� Ŭ�������� Object ����ϴ�
 *     �ֻ��� Ŭ�����κ��� ��ӵǾ�����.
 *  5. ��������� Ŭ�����鵵 Object Ŭ������� �ֻ���Ŭ������
 *     ���  �޾ƾ��Ѵ�. 
 * 
 */

public class Parent extends Object {

	public int member1; //�������
	public int member2;
	
	
	public void method1(){
		System.out.println("method1()-->member1: "+this.member1);
	}
	public void method2(){
		System.out.println("method2()-->member2: "+this.member2);
		
	}
	public void parentPrint(){
		
		System.out.println("member1 : "+ this.member1);
		System.out.println("member2 : "+ this.member2);
	}
}
