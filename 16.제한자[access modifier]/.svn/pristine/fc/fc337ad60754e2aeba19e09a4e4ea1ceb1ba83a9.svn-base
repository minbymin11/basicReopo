package korea.prince;

import korea.president.YS;

public class YSChild extends YS{
	
	public void access(){
		this.a=1;
		this.b=2;//protected 멤버에 접근가능
		//this.c=3;
		//this.d=4;
	}

	public void access2(){
		DJChild djc=new DJChild();
		djc.a=1;
		//djc.b=2; protected DJ에서 상속받아서 YSChild에서 접근 불가능
		//djc.c=3;
		
		YSChild ysc=new YSChild();
		ysc.a=1;
		ysc.b=2; //protected
		//ysc.c=3;  package
		
	}
}
