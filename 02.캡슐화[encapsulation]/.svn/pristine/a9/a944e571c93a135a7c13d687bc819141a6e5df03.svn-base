
public class Account {

	private String no; //계좌번호
	private String  owner;//계좌주
	private int balance; // 잔고
	private double rate;//이율
	
	
	// AccountData set method

	public void setAccountData(String no, String owner, int balance, double rate) {
		//this.no=no;
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.rate=rate;
		
		

	}
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
