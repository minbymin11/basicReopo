/*
 * class 선언(정의)
 *  - 형식
 *       접근제한자  class  클래스이름{
 *       	- 접근제한자:public,protected,없는거
 *       
 *       } 
 *       ex> public class Car{
 *           }
 *           
 *  -구성요소
 *     1.멤버변수선언(속성)
 *        접근제한자(public,protected,없는거,private) 타입 identifier;
 *        ex> public String carName;
 *        
 *     2.멤버메쏘드 선언(행위)    
 *        접근제한자 리턴타입 메쏘드이름(인자){
 *           -인자: 나를 호출한놈이 데이타를 넣어줄 통로(변수의 선언) *           
 *        	 -리턴타입: 나를 호출한놈에게 줄 데이타타입 
 *                     void --> 줄데이타가 없는경우
 *        }
 *        ex> public int test(int a){
 *             
 *                return 0;		        	  	
 *            }
 */


public class MemberVariable {
	 
	public int member1; //접근제한자 타입 식별자
	public String member2;
	public boolean member3;
	
}
