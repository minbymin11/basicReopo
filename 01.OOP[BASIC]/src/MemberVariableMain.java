
public class MemberVariableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		i=34;
		//FirstClass(��������,Ŭ��������)�������� 
		MemberVariable fc;  //4byte ������ �Ҵ�
		
		//��ü�� ����(�ν��Ͻ�����) : ��������������Ҵ�
		fc = new MemberVariable();//�ʱ�ȭ
		
		//��ü�� ��������� ����Ÿ�� �Է�
		fc.member1=45;
		fc.member2="���ڿ�";
		fc.member3=true;
		
		System.out.println(fc.member1);
		System.out.println(fc.member2);
		System.out.println(fc.member3);
		
	}

}
