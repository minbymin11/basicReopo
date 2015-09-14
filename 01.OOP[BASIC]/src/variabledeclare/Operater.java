package variabledeclare;
import org.omg.CORBA.DynAnyPackage.Invalid;

public class Operater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 산술연산자 - 형태: +,-,*,/,%
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
		
		//bit연산자
		int z = 2;
		
		int shiftResult = z << 1;
		
		System.out.println("2<<1="+ shiftResult);
		

		/*
		 * 관계(비교)연산 - 형태: >,<,>=,<=,==,!= - 관계연산의 결과값은 논리형 데이타이다(true,false)
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
		 * - 논리연산자 - 형태: ||(Logical OR) , && (Logical AND) ( |,& ) - 좌우측의항이
		 * 논리형데이타이다. - 결과도 논리형데이타이다. ex> true || false, false && false
		 */

		boolean b1, b2, b3, b4;
		b1 = false;
		b2 = false;
		b3 = true;
		b4 = true;

		boolean result3;
		// 논리합( || )

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
		System.out.println("유효한점수인가요?" + isValid);

		double height = 170.0;
		double weight = 90.0;

		isValid = height >= 170 && weight <= 90;
		System.out.println("현입입니까?" + isValid);

		int time = 30;
		int salary = 3000;

		isValid = time <= 30 || salary >= 3000;
		System.out.println("입사" + isValid);

		/*
		 * 단항연산자(+, -) - 증가,감소연산자 ex> i++ , i-- , ++i , --i - 자기자신의값을 정수 1만큼 증가시키거나
		 * 감소시키는 연산자
		 * !(not) 연산자
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
