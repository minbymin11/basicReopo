
public class AccountConstructorMain {

	public static void main(String[] args) {

        		Account acc1 = new Account("1111", "kim", 1111, 1.0);
				Account acc2 = new Account("1111", "lee", 2222,2.0);
				Account acc3 = new Account("1111", "park", 3333,3.0);
				Account acc4 = new Account("1111", "choi", 4444,4.0);
				Account acc5=new Account();
				
								
				acc1.deposit(50);
				acc2.deposit(50);
				acc3.deposit(50);
				acc4.deposit(50);
				acc5.deposit(50);
				
				acc1.print();
				acc2.print();
				acc3.print();
				acc4.print();
				acc5.print();
	}

}
