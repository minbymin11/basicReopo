/*
- Wrapper 클래스

	자바데이타형은 기본데이타형과 레퍼런스 데이타 형으로 구분됩니다.
	기본데이타형으로는 int,boolean,double 등이 제공됩니다.
	이런기본 데이타형을 객체로 사용할수있는 방법으로 
	Wrapper 클래스가 제공됩니다.
	Wrapper 클래스는 각종유용한 기능들을 메서드로 제공받을수있다는
	장점이있습니다.
	
	Integer,Boolean,Double,Character,Float,Long,Byte,Short
	
 */
package com.itwill.wrapper;

import java.util.Calendar;

public class WrapperClassMain {

	public static void main(String[] args) {
		/*
		 * int ---> Integer
		 */
		Integer wi1 = new Integer(12);
		Integer wi2 = new Integer("12");
		
		//wrapping된 기본형 변수의 값을 가져온다
		int pi1 = wi1.intValue();
		int pi2 = wi2.intValue();
		System.out.println(pi1);
		System.out.println(pi2);
		
		
		//유용한 메소드
		Integer wi3=Integer.valueOf(23);
		Integer wi4=Integer.valueOf("23");
		//입력된 값을 바이너리로 반환함
		String bitString=Integer.toBinaryString(8);
		System.out.println(bitString);
		//입력된값을 헥사(16진수)로 반환함
		String hexString =Integer.toHexString(35234324);
		System.out.println(hexString);
		int parseInt=Integer.parseInt("12341414");
		System.out.println(parseInt);
		
		String intStr = 12345+"";
		String intStr2 = String.valueOf(12345);
		
		
		/*
		 * double ---> Double
		 */
		Double wd1 = new Double(3.141592);
		Double wd2=new Double("3.141592");
		
		double pd1 = wd1.doubleValue();
		double pd2 = wd2.doubleValue();
		/*
		 * boolean --->Boolean
		 */
		boolean wb1= new Boolean(true);
		boolean wb2= new Boolean("true");
		
		/*
		 * char---->Character
		 */
		Character cw1=new Character('김');
		Character cw2 = 'A';
		char pc1=cw1; //boxing
		char pc2=cw2;
		
		char[] ca={'a', 'A', '김','@','8'};
		String str="hello java";
		
		int type = Character.getType('A');
		if(type==Character.UPPERCASE_LETTER){
			System.out.println("A---->UPPERCASE_LETTER");
		}
		
		for (int i = 0; i < ca.length; i++) {
			type = Character.getType(ca[i]);
			System.out.println(ca[i] + type);
			if (Character.isLetter(ca[i])) {
				System.out.println("Letter" + ca[i]);
			}
			if (Character.isSpaceChar(ca[i])) {
				System.out.println("SpaceCahr" + ca[i]);
			}
		}

	}

}
