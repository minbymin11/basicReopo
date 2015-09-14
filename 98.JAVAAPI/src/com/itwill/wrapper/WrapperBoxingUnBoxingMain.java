package com.itwill.wrapper;

public class WrapperBoxingUnBoxingMain {

	public static void main(String[] args) {
		Integer wi1 = new Integer(12);
		//auto boxing 위에처럼 해야되는데 밑에 처럼 써도 됨
		Integer wi2 = 23;
		
		int pi1 = wi1.intValue();
		//auto unboxing 위에 처럼 안쓰고 그냥 넣어도 들어감(주소값)=값을 가져올수 있음
		int pi2 = wi2;
		
		Integer[] wiArr1=new Integer[3];
		wiArr1[0] = new Integer(1);
		//위에 처럼 쓸 필요 없음
		//밑에 처럼 boxing하면됨
		wiArr1[1] =2;
		wiArr1[2] = 3;
		//unboxing
		for (int i = 0; i < wiArr1.length; i++) {
			int tempInt=wiArr1[i];
			System.out.println(tempInt);
		}
		Object[] oArr = new Object[3];
		oArr[0]= new Integer(1);
		//위에 처럼 쓸 필요 없음
		//밑에 처럼 boxing하면됨
		oArr[1]=2;
		oArr[2]=3;
		//unboxing
		for (int i = 0; i < oArr.length; i++) {
			int tempInt = (Integer)oArr[i]; //Object 타입이라 인티져 타입으로 casting해야댐
			System.out.println(tempInt);
		}
		
		/************연산****************/
		Integer wi31 = new Integer(30);
		Integer wi41 = new Integer(40);
		Integer wi5 = new Integer(50);
		
		//주소끼리 연산이 가능함?ㅇㅇ가능하데
		int result = wi31 + wi41;
		result = wi31 - wi5;
		result = wi31 -20;
		boolean bResult = wi31< wi5;  //주소끼리 대소를 구분함? ㅇㅇ가능
		bResult = wi31>500;
		
		System.out.println("---------------###주의###--------------");
		
		if(wi31==30){
			System.out.println("wi3==30: "+"값이 같다");
		}
		//주소끼리 들어가면 주소로 비교함
		if(wi31==wi41){
			System.out.println("wi==wi4: "+"주소가 같다");
		}else{
			System.out.println("wi!=wi4: "+ "주소가 다르다");
		}
		//값이 같은지 비교하려면 equals() 사용
		if(wi31.equals(wi41)){
			System.out.println("wi3 equals wi : 값이 같다");
		}else{
			System.out.println("wi3 equals wi : 값이 다르다");
			
		}
		
		
	}

}
