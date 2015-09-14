
public class ReferenceTypeArray {

	public static void main(String[] args) {

		Account acc=new Account();
		
		ManyAccountMain ma=new ManyAccountMain();
		ma.acc0 = new Account("1", "k", 12, 0.1);
		ma.acc1 = new Account("2", "L", 34, 0.2);
		ma.acc2 = new Account("3", "M", 56, 0.3);
		ma.acc3 = new Account("4", "N", 78, 0.4);
		ma.acc4 = new Account("5", "B", 90, 0.5);
		
		

				/******************* 1차원 참조형 배열 **********************/
		// Assingment. 밑에 배열 메모리 구조 그리기 
		Account[] accArray = new Account[5];//Account[] accArray
																					//accArray=new Account[5]
																					//accArray를 Account[]타입으로 5개 만듦
		
		accArray[0] = new Account("0", "Q", 1111, 1.0); //accArr[0]번지에 Account타입의 객체를 생성하겠다
		accArray[1] = new Account("1", "W", 2222, 1.1);
		accArray[2] = new Account("2", "E", 3333, 1.2);
		accArray[3] = new Account("3", "R", 4444, 1.3);
		accArray[4] = new Account("4", "T", 5555, 1.4);
		
		 	accArray[0].headerPrint();
		for (int i = 0; i < accArray.length; i++) {
			accArray[i].print();
		}
		System.out.println("-------------------enhanced for --------------------------");
		for (Account account : accArray) {
			
		}
		
		
		
		System.out.println("---------------------참조형배열초기화--------------");
		
		Account[] accounts={
				new Account("0", "Q", 1111, 1.0),
				new Account("1", "W", 2222, 1.1),
				new Account("2", "E", 3333, 1.2),
				new Account("3", "R", 4444, 1.3),
				new Account("4", "T", 5555, 1.4)
		};
		acc.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
	}

}
