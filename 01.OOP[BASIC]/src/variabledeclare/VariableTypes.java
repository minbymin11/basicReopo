package variabledeclare;

public class VariableTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. ������
		char munja1, munja2, munja3, munja4;
		munja1 = 'A';
		munja2 = 65; // Ÿ���̶� �ĺ��� ũ�Ⱑ �ٸ�
		munja3 = '��';
		munja4 = 44608; // Ÿ���̶� �ĺ��� ũ�Ⱑ �ٸ�

		System.out.println(munja1);
		System.out.println(munja2);
		System.out.println(munja3);
		System.out.println(munja4);

		// 2. ������
	
		// 2-1. ������
		byte b;
		short s;
		int i;
		long l;

		b = 127; //�ĺ��� 4����Ʈ Ÿ�� 1����Ʈ �o��??
		s = 32767; // �ĺ��� 4����Ʈ Ÿ�� 2����Ʈ �o��??
		i = 2147483647;

		l = 2147483648L;
		
		// 2-2. �Ǽ���
		float f;
		double d;

		f = 3.123456789f;
		d = 3.12345678;

		System.out.println(f);
		System.out.println(d);

		// 3. ����
		boolean b1;
		boolean b2;

		b1 = true;
		b2 = false;

		System.out.println(b1);
		System.out.println(b2);
	}

}
