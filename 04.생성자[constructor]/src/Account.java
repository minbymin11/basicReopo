
public class Account {

	private String no; //계좌번호
	private String  owner;//계좌주
	private int balance; // 잔고
	private double rate;//이율
	
	
	
	//생성자
	public Account() {																	//매개변수가 없는 생성자
		// TODO Auto-generated constructor stub
	}
	
	public Account(String no, String owner, int balance, double rate) {       //매개변수가 있는 생성자
		//super();
		this.setNo(no);
		this.setOwner(owner);
		this.setBalance(balance);
		this.setRate(rate);
	}



	// AccountData set method
	/*
	public void setAccountData(String no, String owner, int balance, double rate) {
		//this.no=no;
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.rate=rate;
		
		

	}
	*/
	
	//입금
	public void deposit(int m){
		balance+=m;
		
	}
	//출금
	
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
	
	//출력	
	public void print(){
		System.out.println(no+"\t"+owner+"\t"+balance+"\t"+rate+"\n");
		
	}
	
	public void headerPrint(){
		System.out.println("계좌번호"+"\t"+"이름"+"\t"+"잔고"+"\t"+"이율"+"\n");
		
	}
	
	

	//getter
	
	public String getNo() {
		return no;
	}

	public String getOwner() {
		return owner;
	}

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
