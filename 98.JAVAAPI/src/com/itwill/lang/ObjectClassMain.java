package com.itwill.lang;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;

public class ObjectClassMain {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Object o1 = new Object();
		String str = o1.toString();
		Account acc1 = new Account("1234", "kim", 1, 2.0);
		Account acc2 = new Account("5678","lim",2,4.0);
		
		
		System.out.println(str);
		Date today=new Date();
		String todayStr = today.toString();
		System.out.println(today.toString());
		
		String str1="오늘은 화요일";   
		String str2 = str1.toString();
		System.out.println(str2);
		
		ObjectChild oc=new ObjectChild();
		System.out.println(oc.toString());
		
		Socket socket = new  Socket("www.naver.com",80);
		System.out.println(socket.toString());
		
		System.out.println("----------------toString메소드 자동 호출--------------------");
		System.out.println(o1);
		System.out.println(today);
		System.out.println(str1);
		System.out.println(oc);
		System.out.println(socket);
		System.out.println(acc1);
		System.out.println(acc2);
	}

}
