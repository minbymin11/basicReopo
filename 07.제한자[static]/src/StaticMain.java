
public class StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 정적멤버들은 접근시 클래스이름을 사용해서 접근
		 * ex> 클래스이름.정적멤버
		 */
		
		System.out.println("Static.static_memberVar"+Static.static_memberVar);
		Static.static_memberVar=888;
		Static.static_method();  //참조변수 없이 호출가능
		System.out.println("Static.static_member:"+Static.static_memberVar);
		
		Static st1=new Static();
		st1.instance_memberVar=999;
		st1.instance_methid();
		System.out.println("st1.instance_memberVar:"+st1.instance_memberVar);
		
		Static st2=new Static();
		st2.instance_memberVar=666;
		st2.instance_methid();
		
		System.out.println("st2.instance_memberVar:"+st2.instance_memberVar);
		
		System.out.println("1."+Static.static_memberVar);
		//멤버변수로 static에 접근가능, 오류는 나지 않음
		System.out.println("2."+st1.static_memberVar);
		System.out.println("3."+st2.static_memberVar);
		
		
	}

}
