/*
 * static 제한자(제어자,modifier)
 *   1.멤버변수나,메쏘드 앞에 부칠수있다
 *   (nested(inner) class인 경우에는 클래스앞에도 부칠수있다)
 * 	 2.static 제한자가 붙어있는 멤버변수나 메쏘드는
 *     객체생성 없이도 사용이가능하다.
 *   3.클래스가 가지고있는 변수나메쏘드이다.
 *     -->클래스변수,클래스메쏘드라고도한다.
 *   4.클래스로부터 생성되는 객체들이 공유하는
 *     변수(메쏘드)이다.      
 *     -->공용변수(메쏘드)라고도한다.
 *     
 *  -형식: 
 *  	멤버변수: public static int i;
 * 		멤버메쏘드:public static void print(){}
 * 
 */
public class Static {
	public int instance_memberVar;			//객체멤버변수
	public static int static_memberVar;		//정적멤버변수
	
	public void instance_methid(){				//객체메소드
		System.out.println("instance_method");
	}
	/*
	*Static context 내에서 this를 사용할 수 없다
	*셀프 참조 변수가 없다. 객체생성과 무관 
	*System.out.println("instance_memverVar:"+this.static_memberVar);
	*/
	public static void static_method(){		//정적(static,공용메소드,클래스)멤버메소드
		System.out.println("static_method()");
		System.out.println("static_memverVar:"+Static.static_memberVar);
	}
	
}
