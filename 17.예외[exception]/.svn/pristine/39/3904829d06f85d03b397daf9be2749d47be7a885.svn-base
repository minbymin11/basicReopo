/**
 * 
 * @author Administrator
 *
 */
public class Account {

	private String no; //계좌번호
	private String  owner;//계좌주
	private int balance; // 잔고
	private double rate;//이율
	
	/**
	 * 기본값을 가지는 계좌객체생성
	 */
	
	public Account() {																	//매개변수가 없는 생성자
		// TODO Auto-generated constructor stub
	}
	/**
	 * 입력된 인자값을 가지는 계좌객체생성
	 * @param no	계좌번호
	 * @param owner	계좌주
	 * @param balance	 잔고
	 * @param rate 이율
	 */
	public Account(String no, String owner, int balance, double rate) {       //매개변수가 있는 생성자
	//	super();
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.rate = rate;
	}

	/**
	 * 계좌객체 데이타셋 메소드
	 * @param no	계좌번호
	 * @param owner	계좌주
	 * @param balance	 잔고
	 * @param rate 이율
	 */

	public void setAccountData(String no, String owner, int balance, double rate) {
		//this.no=no;
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.rate=rate;
	}
	/**
	 * 입금
	 * @param m 입금할 돈
	 */
	public void deposit(int m){
		balance+=m;
	}
	/**
	 * 출금
	 * @param m 출금할 돈
	 * @return 출금성공여부, false 출금실패, true 출금성공
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
		System.out.print("계좌번호\t"+"계좌주\t"+"잔약\t"+"이율\n");
	}
	
	//출력	
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
 * 잔고조회
 * @return 잔고
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
