/* OOP �� ��� 
 *   1. ĸ��ȭ
 *   2. ��Ӽ�
 *   3. ������(�����ε�,���ٶ��̵�,��ü����ȯ)
 */

/*
 * 1. ĸ��ȭ
 *    - �ܺ�Ŭ������(��ü)�� ��������� ������ ����
 *      ��� �޽�忡�� �����Ҽ��ֵ��� Ŭ������ �����ϴ¹��
 *      
 *    - ���� : ������� �� ���������ڸ� private
 *              ��������� ���������ڴ� public �����Ѵ�. 
 *              public ==> � �ܺ�Ŭ����(��ü)�������� ���ٰ���
 *              private==> � �ܺ�Ŭ����(��ü)�������� ���ٺҰ���
 */

public class EncapsulationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//������ ����
		Encapsulation ec= new Encapsulation();
		//ec.member1=100;
		ec.setMember1(100);
		//ec.member2=200;
		ec.setMember2(200);
		
		//System.out.println(ec.member1);
		//System.out.println(ec.member2);
		//getMember �޼ҵ� ȣ���ؼ� ���ϰ� ��ȯ
		int m1=ec.getMember1();
		int m2=ec.getMember2();
		System.out.println(m1);
		System.out.println(m2);
		ec.print();
		
		
	
	}

}
