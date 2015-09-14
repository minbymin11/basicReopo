/**
 * 
 * @author Administrator
 *
 */
public class Account {

	private String no; //���¹�ȣ
	private String  owner;//������
	private int balance; // �ܰ�
	private double rate;//����
	
	/**
	 * �⺻���� ������ ���°�ü����
	 */
	
	public Account() {																	//�Ű������� ���� ������
		// TODO Auto-generated constructor stub
	}
	/**
	 * �Էµ� ���ڰ��� ������ ���°�ü����
	 * @param no	���¹�ȣ
	 * @param owner	������
	 * @param balance	 �ܰ�
	 * @param rate ����
	 */
	public Account(String no, String owner, int balance, double rate) {       //�Ű������� �ִ� ������
	//	super();
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.rate = rate;
	}

	/**
	 * ���°�ü ����Ÿ�� �޼ҵ�
	 * @param no	���¹�ȣ
	 * @param owner	������
	 * @param balance	 �ܰ�
	 * @param rate ����
	 */

	public void setAccountData(String no, String owner, int balance, double rate) {
		//this.no=no;
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.rate=rate;
	}
	/**
	 * �Ա�
	 * @param m �Ա��� ��
	 */
	public void deposit(int m){
		balance+=m;
	}
	/**
	 * ���
	 * @param m ����� ��
	 * @return ��ݼ�������, false ��ݽ���, true ��ݼ���
	 */
	
	public boolean withdraw(int m){
		balance-=m;
		boolean isSuccess=true;
		
		if(balance < 0){
			balance+=m;
			isSuccess=false;
			return isSuccess;
		}
		return isSuccess;
	}
	public void headerPrint(){
		System.out.print("���¹�ȣ\t"+"������\t"+"�ܾ�\t"+"����\n");
	}
	
	//���	
	public void print(){
		System.out.print(no+"\t"+owner+"\t"+balance+"\t"+rate+"\n");
		
	}
	//getter
	public String getNo() {
		return no;
	}

	public String getOwner() {
		return owner;
	}
/**
 * �ܰ���ȸ
 * @return �ܰ�
 */
	public int getBalance() {
		return balance;
	}

	public double getRate() {
		return rate;
	}

	
	//setter
	
	public void setNo(String no) {
		this.no = no;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
	
}
