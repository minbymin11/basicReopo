/*
������(constructor)
1. Ŭ���� �̸��������ϸ� ����Ÿ���� ��������ʴ� �޽��(???)
2. �ϳ��� Ŭ�������� �ݵ�� �ϳ��̻��� �����ڸ޼ҵ尡 �����Ͽ����Ѵ�
--> �����ڸ� ��������������� �����Ϸ��� ���ڰ��ϳ�������
    ������(������ ������)�� �ڵ����� �־ �������Ѵ�.    
3. ��ü������ ���ѹ� ȣ��ȴ�.
4. �ַ� ��ü�ʱ�ȭ�� �뵵�� ����Ѵ�.
5. ��ü�� �����ҷ��� �ݵ�� �����ڸ� ȣ���Ͽ����Ѵ�.
	
	-����: 
	 	public class Test{
	 		//�������� ����(����)
	 	    public Test(){
	 	    }
	 	}
	 	
    -���: 
           Test t = new Test(); 
	 	   Ŭ������ ���������̸� = new Ŭ������();
	 	   new ��� �����ڴ� �ݵ�� ������ �տ��־���ϸ�
	 	   �̿����ڿ����� ��ü�� �����Ѵ�.
*/




public class Constructor {
	
	private int member1;
	private int member2;
	
	
	public Constructor() {
	 
		System.out.println("Constructor()����Ʈ������ȣ��");
		this.member1=100;
		this.member2=200;
		
	
	}
	
	/**
	 * �����ڸ޽���� �����ε�(��������)
	 * 
	 */
	
	public Constructor(int member1){
		System.out.println("Constructor(int member1)����Ʈ������ȣ��"+member1);
		this.member1=member1;
		this.member2=100;
		
	}
	
	public Constructor(int member1, int member2){
		System.out.println("Constructor(int member1, member2)����Ʈ������ȣ��"+member1+member2);
		this.member1=member1;
		this.member2=member2;
	}
	
	public void print(){
		System.out.println("member1:"+member2);
		System.out.println("member2:"+member2);
	}
	

}
