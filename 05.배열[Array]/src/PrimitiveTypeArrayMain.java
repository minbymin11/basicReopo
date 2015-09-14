/*
 배열:  
      - 같은데이타형을 가진 기억장소여러개의 모음타입(배열타입) 
      - 배열타입변수의 선언형식
           데이타타입[] 이름; 
	  - 사용: 
	       1.배열객체의생성	
		   2.배열객체의 초기화 
      -특징   
		  1.모든 배열형의 변수는 참조변수이다.
		    (배열은 객체다.)
		  2.같은타입만 정의가가능하다 
		  3.길이가 고정되어있다. 
		 
 */

public class PrimitiveTypeArrayMain {
	public static int no=0;

	public static void main(String[] args) {
		
		ManyInt mi=new ManyInt();
		mi.i0=0;
		mi.i1=1;
		mi.i2=2;
		mi.i3=3;
		mi.i4=4;
		int pi;
		pi = 90;
		
		/*********************1차형 기본형 배열********************/
		int[] ia;
		ia = new int[5];

		System.out.println("--배열객체멤버변수의 자동초기화--");
		System.out.println("ia[0]:"+ia[0]);
		System.out.println("ia[1]:"+ia[1]);
		System.out.println("ia[2]:"+ia[2]);
		System.out.println("ia[3]:"+ia[3]);
		System.out.println("ia[4]:"+ia[4]);
		
		ia[0]=0;
		ia[1]=1;
		ia[2]=2;
		ia[3]=3;
		ia[4]=4;
		System.out.println("--객체멤버변수의 출력--");

		System.out.println("ia[0]:"+ia[0]);
		System.out.println("ia[1]:"+ia[1]);
		System.out.println("ia[2]:"+ia[2]);
		System.out.println("ia[3]:"+ia[3]);
		System.out.println("ia[4]:"+ia[4]);
		
		System.out.println("배열의 크기(멤버변수의 갯수): "+ia.length);

		
		for (int i = 0; i < ia.length; i++) {
			System.out.println("ia["+i+"]: "+ia[i]);
		}
		
		char[] ca=new char[8];
		ca[0]='H';
		ca[1]='E';
		ca[2]='L';
		ca[3]='L';
		ca[4]='O';
		ca[5]='!';
		ca[6]='자';
		ca[7]='바';
		
		for (int i = 0; i < ca.length; i++) {
			System.out.print(ca[i]);
		}
		System.out.println();
		System.out.println("4.배열객체 생성&초기화");
		
		int[] ia1={34, 45, 66, 12, 34, 39};
		for (int i = 0; i < ia1.length; i++) {
			System.out.print(ia1[i]+" "+"\n");
		}
		
		char[] ca1={'H', 'E', 'L', 'L', 'O', '!', '자', '바'};
		for (int i = 0; i < ca1.length; i++) {
			System.out.print(ca1[i]);
		}
		boolean[] ba = { true, true, false, true, false, true, true };
		int wrongCount = 0;
		int correctCount = 0;

		for (int i = 0; i < ba.length; i++) {
			if (ba[i] == true) {
				correctCount++;
			} else {
				wrongCount++;
			}

		}
		System.out.println("전체문항수:" + ba.length);
		System.out.println(">>정답수:" + correctCount);
		System.out.println(">>오답수:" + wrongCount);

		/*
		 * Quiz:국어점수의 석차를 구하시요.이중 {for()문사용}
		 */
		
		int[] korScore={12, 36, 98, 52, 56, 67, 78, 89, 90, 99};
		int[] korGrade = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		String[] names={"kim","Lee","Prk","yu","jung","sim","Pin","foo","zim","gim"};
		
		for (int i = 0; i < korGrade.length; i++) {
			for (int j = 0; j < korGrade.length; j++) {
				if (korScore[i] < korScore[j]) {
										
					korGrade[i]=korGrade[i]+1;
				
				}

			}
			System.out.println(names[i]+"국어점수는 " + korScore[i] + "이고" + korGrade[i] + "등입니다");

		}

		/*
		 * Quiz : 국어점수를 오름차순으로 정렬하세요(버블정렬).
		 */
		
		for (int i = 0; i < korScore.length; i++) {
			for (int j = 0; j < korScore.length; j++) {
				if(korScore[i]>korScore[j]){
					int temp=0;
					temp=korScore[i];
					korScore[i]=korScore[j];
					korScore[j]=temp;
				}
			}
			System.out.println(korScore[i]);
		}
		
		
		/*********************2차원 기본형 배열**********************/
		
		int ii=0;
		int[] iia=new int[5];
		
		int[][] i2a;
		i2a=new int[3][5];
		
		int [][] i2a1=new int[3][];// 가변 배열을 만들 수 있음
		i2a1[0]= new int[5];
		i2a1[1]= new int[5];
		i2a1[2]= new int[5];
		i2a1[0]= new int[5];
		
		for (int i = 0; i < i2a1.length; i++) {							
			for (int j = 0; j < i2a1[i].length; j++) {
					
				i2a1[i][j]= ++no;
				System.out.println(i2a1[i][j]);
			}
		}
	}

}
