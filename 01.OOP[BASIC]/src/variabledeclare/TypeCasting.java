package variabledeclare;
/*
 * 		����ȯ(Casting)--> ����������Ÿ������ ����

			- ���� :  (����ŸŸ��)����or���;
		    - �ڵ�����ȯ(��������Ÿ-->ū����)upcasting
			     byte-->short-->int-->long-->float-->double
			                   (char)
			- ��������ȯ(ū����Ÿ-->��������Ÿ)downcasting
			     double-->float-->long-->int-->short-->byte
*/
//upcasting(promotion)
public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b = 123;
		short s = 555;
		int i = 666;
		long l = 777;

		float f = 3.14f;
		double d = 3.14;

		// �ڵ�����ȯ(���������� --> ū����) upcasting
		double d1 = b;
		d1 = s;
		d1 = i;
		d1 = l;

		// ��������ȯ(ū������ --> ����������) downcasting

		// int i1 = f;

		double avg = 86.45;
		int intAvg = (int)avg;
		
		System.out.println(intAvg);
		
		
		
		System.out.println("-------����� ����ȯ(���� ū���� Ÿ�������� ��ȯ)------------");
		
		double dr = b+s+i+l+d;
		System.out.println("dr:" + dr);
		
		int ir = b+s;
		System.out.println("ir:"+ ir);
		
		System.out.println("QUIZ---------------------------------------------");
		/*
		 * 
		 * quiz : �Ҽ��� ���� ��°�ڸ����� �ݿø��ϼ�.
		 * 
		 * */
		
		double classAvg = 86.793;
		double _Casting1;
		double _Casting=classAvg * 10;
		System.out.println(_Casting);
		_Casting1 = (int) (_Casting + 0.5);
		System.out.println(_Casting1);
		double _Casting2 =_Casting1/10;
		
		
		System.out.println(_Casting2);
		
		
		
		
		
		
		
		String str1, str2, str3;
		str1="������";
		str2="�����ڿ� ����";
		str3="�����մϴ�";
		
		String strResult = str1+" "+str2+" "+str3+".";
		System.out.println(strResult);
		strResult = "�츮���� �����"+ classAvg + "�Դϴ�.";
		System.out.println(strResult);
		
	}

}
