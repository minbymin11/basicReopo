package com.itwill.util;

import java.util.Calendar;


public class CalendarMain {

	public static void main(String[] args) {
		
		Calendar cal=Calendar.getInstance();   //Calendar 추상객체 --> 메소드를 생성할 수 없음
		System.out.println(cal);
		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH);
		int date=cal.get(Calendar.DATE);
		int hour=cal.get(Calendar.HOUR);
		int minute=cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		
		System.out.println(year+"년"+(month+1)+"월"+date+"일"+hour+"시"+minute+"분"+sec+"초");

		
		
		
	}

}
