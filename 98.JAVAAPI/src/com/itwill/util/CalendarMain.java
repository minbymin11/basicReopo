package com.itwill.util;

import java.util.Calendar;


public class CalendarMain {

	public static void main(String[] args) {
		
		Calendar cal=Calendar.getInstance();   //Calendar �߻�ü --> �޼ҵ带 ������ �� ����
		System.out.println(cal);
		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH);
		int date=cal.get(Calendar.DATE);
		int hour=cal.get(Calendar.HOUR);
		int minute=cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		
		System.out.println(year+"��"+(month+1)+"��"+date+"��"+hour+"��"+minute+"��"+sec+"��");

		
		
		
	}

}
