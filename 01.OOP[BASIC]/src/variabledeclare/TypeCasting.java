package variabledeclare;
/*
 * 		형변환(Casting)--> 숫자형데이타간에만 가능

			- 형식 :  (데이타타입)변수or상수;
		    - 자동형변환(작은데이타-->큰변수)upcasting
			     byte-->short-->int-->long-->float-->double
			                   (char)
			- 강제형변환(큰데이타-->작은데이타)downcasting
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

		// 자동형변환(작은데이터 --> 큰변수) upcasting
		double d1 = b;
		d1 = s;
		d1 = i;
		d1 = l;

		// 강제형변환(큰데이터 --> 작은데이터) downcasting

		// int i1 = f;

		double avg = 86.45;
		int intAvg = (int)avg;
		
		System.out.println(intAvg);
		
		
		
		System.out.println("-------연산시 형변환(가장 큰항의 타입으로형 변환)------------");
		
		double dr = b+s+i+l+d;
		System.out.println("dr:" + dr);
		
		int ir = b+s;
		System.out.println("ir:"+ ir);
		
		System.out.println("QUIZ---------------------------------------------");
		/*
		 * 
		 * quiz : 소수점 이하 둘째자리에서 반올림하셈.
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
		str1="오늘은";
		str2="연잔자에 대해";
		str3="공부합니다";
		
		String strResult = str1+" "+str2+" "+str3+".";
		System.out.println(strResult);
		strResult = "우리반의 평균은"+ classAvg + "입니다.";
		System.out.println(strResult);
		
	}

}
