package variabledeclare;
import org.omg.CORBA.DynAnyPackage.Invalid;

public class Operater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ��������� - ����: +,-,*,/,%
		 */

		int a = 1;
		int b = 2;

		int result;

		result = a + b;
		System.out.println("a + b =" + result);
		result = a - b;
		System.out.println("a - b =" + result);
		result = a * b;
		System.out.println("a * b =" + result);
		result = a / b;
		System.out.println("a / b =" + result);
		
		double dresult;
		dresult = (double)a/b;
		System.out.println("double : a/b = "+ dresult);

		int c;
		int d;

		c = 2015;
		d = 4;

		result = c % d;
		System.out.println("2015 % 4 =" + result);
		result = a % b;
		System.out.println("1 % 2 =" + result);
		
		//bit������
		int z = 2;
		
		int shiftResult = z << 1;
		
		System.out.println("2<<1="+ shiftResult);
		

		/*
		 * ����(��)���� - ����: >,<,>=,<=,==,!= - ���迬���� ������� ���� ����Ÿ�̴�(true,false)
		 */

		int e = 10;
		int f = 20;
		boolean result2;

		result2 = e > f;
		System.out.println("10>20 = " + result2);
		result2 = e < f;
		System.out.println("10<20 = " + result2);
		result2 = e >= f;
		System.out.println("10>=20 = " + result2);
		result2 = e <= f;
		System.out.println("10<=20 = " + result2);
		result2 = e == f;
		System.out.println("10==20 = " + result2);
		result2 = e != f;
		System.out.println("10!=20 = " + result2);

		char c1, c2;
		c1 = 'A';
		c2 = 'B';

		result2 = c2 > c1;
		System.out.println("'B'>'A' = " + result2);

		/*
		 * - �������� - ����: ||(Logical OR) , && (Logical AND) ( |,& ) - �¿���������
		 * ��������Ÿ�̴�. - ����� ��������Ÿ�̴�. ex> true || false, false && false
		 */

		boolean b1, b2, b3, b4;
		b1 = false;
		b2 = false;
		b3 = true;
		b4 = true;

		boolean result3;
		// ����( || )

		result3 = b1 || b2;
		System.out.println("false || false =" + result3);
		result3 = b3 && b4;
		System.out.println("true && true =" + result3);
		result3 = b1 || b3;
		System.out.println("false || true=" + result3);
		result3 = b1 && b4;
		System.out.println("false && true =" + result3);

		int kor = 89;

		boolean isValid;

		isValid = kor >= 0 && kor <= 100;
		System.out.println("��ȿ�������ΰ���?" + isValid);

		double height = 170.0;
		double weight = 90.0;

		isValid = height >= 170 && weight <= 90;
		System.out.println("�����Դϱ�?" + isValid);

		int time = 30;
		int salary = 3000;

		isValid = time <= 30 || salary >= 3000;
		System.out.println("�Ի�" + isValid);

		/*
		 * ���׿�����(+, -) - ����,���ҿ����� ex> i++ , i-- , ++i , --i - �ڱ��ڽ��ǰ��� ���� 1��ŭ ������Ű�ų�
		 * ���ҽ�Ű�� ������
		 * !(not) ������
		 * ex> !true --> false
		 */
		
		int g = 23;
		int result4;

		result4 = +g;
		System.out.println("+23 = " + result4);
		result4 = -g;
		System.out.println("-23 = " + result4);
		
		boolean result5;
		boolean turn=true;
		result5 = !turn;
		System.out.println("!true = "+ result5);
		
		int i = 5;
		int j = 5;
		++i;
		--j;
		
		System.out.println("++5 --> " + i );
		System.out.println("--5 --> " + j);
		
		i=5;
		j=5;
		
		i++;
		j--;
		
		System.out.println("5++ --> " + i);
		System.out.println("5-- --> " + j);
		
		int resulti;
		int resultj;
		
		resulti = ++i;
		resultj = --j;
		System.out.println("++5  -->" + i);
		System.out.println("--5  -->" + j);
		System.out.println("resulti = ++5;  -->" + resulti);
		System.out.println("resultj = --5;  -->" + resultj);

		
		
	}

}
