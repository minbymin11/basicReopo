package variabledeclare;

public class ForNested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("1.---------------------------------");
		for(int i=0; i<5; i++){
			for (int j = 0; j < 8; j++) {
				System.out.print("★");
				}
			System.out.println();
		}
		
		System.out.println("2.---------------------------------");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i>=j){
					//System.out.print("\n");
					System.out.print("★");
				}else if(i==j){
					System.out.print("\n");
					//System.out.print("★");
				}
			}
			System.out.println();
			
		}
System.out.println("3.---------------------------------");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i<=j){
					//System.out.print("\n");
					System.out.print("★");
				}else if(i==j){
					System.out.print("\n");
					//System.out.print("★");
				}
			}
			System.out.println();
			
		}
		System.out.println("4.---------------------------------");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i>j){
					System.out.print("☆");
					//System.out.print("★");
				}else{
					//System.out.print("\n");
					System.out.print("★");
				}
			}
			System.out.println();
			
		}
		
System.out.println("5.-마름모찍고싶다--------------------------------");
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				//if(){
					System.out.print("☆");
					//System.out.print("★");
					
			//	}else if(){
					//System.out.print("\n");
					System.out.print("★");
				}
			}
			System.out.println();
			
		}
		
	}

