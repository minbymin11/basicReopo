package com.itwill.wrapper;

import java.awt.Color;
import java.awt.Frame;
import java.util.Calendar;
import java.util.Date;

public class ObjectCastingMain {

	public static void main(String[] args) {
		
			Object o1 = new String("aaa");
			Object o2 = new Frame("bbb");
			Object o3= new Color(0,0,0);
			Object o4= new Date();
			Object o5= Calendar.getInstance();
			
			//기본형 데이터를 오브젝트형 변수에 넣을 수 없어
			int i = 1;
			Object o6 = i;
			Object o7=3.2;
			Object o8=true;
			
			Object[] oa = new ObjectCastingMain[5];
			oa[0] = new String("qqqq");
			oa[1] = new Frame();
			oa[2] = new Date();
			oa[3]= new Object();
			oa[4] = Color.DARK_GRAY;
			
	}

}
