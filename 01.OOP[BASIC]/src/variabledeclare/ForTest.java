package variabledeclare;
/*
	for문
	     -형식:
	       	       
	       for(1;2;3){
	       	//1.반복변수(선언,초기화가능)
	       	//2.반복변수의 조건검사(논리형데이타)
	       	//3.반복변수증,감(++,--)
	       }
	       
	       ex>
	       for(int i=0;i<10;i++){
	       	 stmt1;
	       }
	       ex>무한루프
	       for(;;){
	       	
	       }
	
	*/


public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1.증가--------------------------");
		for (int i = 0; i < 10; i++) {
			System.out.println("stmt:[" + i + "]");
		}

		System.out.println("2.감소--------------------------");
		for (int i =10 ; i >0 ; i--) {
			System.out.println("stmt:[" + i + "]");

		}

		System.out.println("3.짝수출력[1-10]--------------------------");
		for(int i=0; i<10; i++){
			int su = i+1;
			if(su%2==1){
				//홀수조건일때 이후의 모든 문장들을 실행하지 않고
				//다음반복을실행
				continue;
			}
			System.out.println(su+" ");
		}
		System.out.println("4--------4배소출력[1-100]");
		
		for(int i = 0; i <100; i++){
			int su = i+1;
			if(su%4!=0){
				continue;
			}
			System.out.println(su+"");
		}
		
		System.out.println("5--------알파벳 소문자 출력");
		
		for(char c= 'a'; c<='z';c++){
			System.out.println(c+" ");
		}
		
		int lineCount=0;
		System.out.println("6--------모든 문자 출력");
		for(char c = 0 ; c< 65535; c++){
			System.out.print(c);
			lineCount++;
			if(lineCount%100==0){
				System.out.println("\n");
			}
			
		}
		
	}

}
