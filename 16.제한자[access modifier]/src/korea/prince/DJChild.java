package korea.prince;

import korea.president.DJ;

public class DJChild extends DJ{

	public void access(){
		//패키지는 다르지만 상속받아서 사용가능
		this.a=1;
		this.b=2;
		//this.c=3;
		//this.d=4;
	}
	public void access2(){
		DJChild djc=new DJChild();
		djc.a=1;
		djc.b=2;  
		//djc.c=3;
		
		YSChild ysc=new YSChild();
		ysc.a=1;
		//ysc.b=2; //protected
		//ysc.c=3;  package
		
	}
}
