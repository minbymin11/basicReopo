package inheritance;
//�θ𿡰� ��ӹ����� �������, ����޼ҵ�� �ڽ��ǰ�
public class ChildA extends Parent{
 
	
	public int member3;
	public int member4;
	public void method3(){
		System.out.println("method3()--->member3 :"+this.member3);
	}
	public void method4(){
		System.out.println("method4()--->member4 :"+this.member4);
	}
	
	public void childPrint(){
		this.parentPrint();                                    //�θ𿡰� ��ӹ��� ����Ʈ �޼ҵ�
		System.out.println("member3 : "+ this.member3);
		System.out.println("member4 : "+ this.member4);
	}
}
