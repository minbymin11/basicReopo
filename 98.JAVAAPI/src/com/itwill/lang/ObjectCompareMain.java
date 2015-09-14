package com.itwill.lang;

public class ObjectCompareMain {

	public static void main(String[] args) {
		//기본비교형
		int i = 10;
		int j = 20;
		if (i<j) {
			System.out.println("10<20");
			
		}
		if (i==j) {
			System.out.println("20==20");
			
		}
		if (i!=j) {
			System.out.println("10!=20");
			
		}
		
		//참조형비교(주소비교)
		
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = o2;
		if (o1!=o2) {
			System.out.println("o1과 o2의 주소가 같지 않다");
		}
		if (o1==o2) {
			System.out.println("o1과 o2의 주소가 같다");
		}
		
		if (o2==o3) {
			System.out.println("o2와 o3의 주소가 같다");
			
		}
		if(o1.equals(o2)){
			System.out.println("o1과 o2의 주소는 같지 않다");
		}
		if(o2.equals(o3)){
			System.out.println("o2와 o3의 주소가 같다");
		}
		
		/*
		 * <<객체주소리터럴 null>>
		 *  - 주소값이 없다는 객체리터럴
		 */
		
	}

}
