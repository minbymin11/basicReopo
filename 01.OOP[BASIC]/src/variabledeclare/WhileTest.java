package variabledeclare;
/*
�ݺ���
     stmt1;
     while(���ǹ�){
		 //���ǹ�--> ��������Ÿ�� ��ȯ�ϴ� ��(��������, ���ͷ�) 
		stmt2;
	 }
	 stmt3;
     
	 �帧  stmt1 -->���ǽ��� ����Ÿ�� true�ε��Ƚ���--> stmt3

*/

public class WhileTest {

	public static void main(String[] args) {
		System.out.println("");
		// TODO Auto-generated method stub
		/*
		while(true){
			System.out.println("stmt1");
			}
		*/
		
			System.out.println("1.--------------------");
			boolean isAlive = true;
			int i = 0;
			while(isAlive){
				System.out.println("i������ ��:"+i);
				i++;
				if(i==10)
					isAlive=false;
				
			}
			System.out.println("2.--------------------");
			
			isAlive = true;
			int j = 0;
			
			while(isAlive){
				System.out.println("j������ ��"+j);
				j++;
				if(j==10)
					break;
			}
			
			System.out.println("3.--------------------");
			
			int k = 0;
			while(k<10){
				System.out.println("A.K������" + k);
			}
				
			
		
	}

}
