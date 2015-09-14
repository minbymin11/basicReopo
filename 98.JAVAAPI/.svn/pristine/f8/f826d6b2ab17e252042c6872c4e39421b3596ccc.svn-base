package com.itwill.util.collection;

public class GenericClassMain {
	
	public static void main(String[] args){
		
		/***************noGeneric***************************/
	NoGenericClass ng = new NoGenericClass();
	ng.setMember(new Account());
	Account getAccount = (Account)ng.getMember();//멤버변수가 오브젝트 타입이라서 Account타입으로  캐스팅해줘야함
	
/*********************Generic*************************/	
	GenericClass<Account> gc = new GenericClass<Account>();
	gc.setMember(new Account());
	Account getAcc=gc.getMember();//캐스팅이 필요없다
	
	}

}
