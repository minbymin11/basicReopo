
public class StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ����������� ���ٽ� Ŭ�����̸��� ����ؼ� ����
		 * ex> Ŭ�����̸�.�������
		 */
		
		System.out.println("Static.static_memberVar"+Static.static_memberVar);
		Static.static_memberVar=888;
		Static.static_method();  //�������� ���� ȣ�Ⱑ��
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
		//��������� static�� ���ٰ���, ������ ���� ����
		System.out.println("2."+st1.static_memberVar);
		System.out.println("3."+st2.static_memberVar);
		
		
	}

}
