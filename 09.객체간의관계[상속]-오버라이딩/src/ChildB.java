
public class ChildB extends Parent {
	public String name;
	public boolean isMarried;
	
	public void print(){//부모객체이도 print()가 있는데 재정의된 메소드
		//this.parentPrint();
		super.print();
		System.out.println("name : "+this.name);
		System.out.println("isMarried : "+isMarried);
	}

}
