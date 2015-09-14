package com.itwill.lang;

public class MathMain {

	public static void main(String[] args) {

		System.out.println(Math.max(12, 345));
		System.out.println(Math.min(12, 345));
		System.out.println(Math.abs(-234));		//절대값
		System.out.println(Math.floor(5.6));		//내림
		System.out.println(Math.ceil(5.6));			//올림
		System.out.println(Math.round(5.4));  //반올림
		
		double dr= Math.random();  //파라메타 없이 double 반환
		System.out.println(dr);
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println("1~10까지의 정수를 랜덤하게 추출");
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println("------------lotto번호생성--------------");
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
	}

}
