package com.itwill.lotto;
//번호생성, 출력(비지니스객체)
public class LottoManager {
	
	public static int MONEY=1000;
	LottoManager lot = new LottoManager();
	
	/*
	 *  로또 1set 생성(중복되면안됨)
	 */
	public int[] lotMachine(int cnt) {
		
		int[] lot1 = new int[6];
		
		for (int i = 0; i <lot1.length; i++) { // 6번 돌려봐
				double dr = Math.random(); // 랜덤쓴다
				lot1[i] = (int) (dr * 45) + 1; // 난수 45개 만들어서 인트배열객체에 넣음	
				for (int j = 0; j<i; j++) {
					if (lot1[i] == lot1[j]) { // 중복숫자 있으면 한번 더 돌려봐
							i--;
							break;
					}
			}
	
		}
		return lot1;
		
	}

	/*
	 * 입금되는 돈에 따라서 로또번호set를 반복해서 호출하는 메소드
	 */
	
	public void lotByBucks(int bucks){
		int cnt = bucks /MONEY; //1000원당 한게임
		
	}
	
	/*
	 * 생성된번호 출력
	 */
	public void print(){
		System.out.println();
	}

}
