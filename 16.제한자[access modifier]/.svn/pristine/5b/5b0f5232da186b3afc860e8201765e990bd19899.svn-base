package korea.president;

import america.president.Bush;
import korea.prince.DJChild;
import korea.prince.YSChild;

public class YS {

	
	public int a;
	protected int b;
	int c;
	private int d;
	
	public void a(){
		System.out.println("public a()");
	}
	public void b(){
		System.out.println("protected b()");
		
	}
	public void c(){
		System.out.println(" c()");
		
	}
	public void d(){
		System.out.println("private d()");
		
	}
	
	public void access(){
	/*
	 * 같은 패키지	
	 */
		
		DJ dj=new DJ();
		dj.a=1;
		dj.b=2;
		dj.c=3;
		//dj.d=4;
		
		
		dj.a();
		dj.b();
		dj.c();
		dj.d();

		/*
		 * 다른 패키지
		 */

		Bush bs = new Bush();
		bs.a=1;	
		//bs.b=1;	
		//bs.c=1;	
		//bs.d=1;	
		
		bs.a();
		//bs.b();
		//bs.c();
		//bs.d();
		
		
		/*
		 * 같은 패키지
		 */

		YSChild ysc=new YSChild();
		ysc.a=1;
		ysc.b=2;
		//ysc.c=3;
		//ysc.d=4;
		DJChild djc=new DJChild();
		djc.a=1;
		djc.b=2;
		//djc.c=3;
		//djc.d=4;
		
	}
}
