package variabledeclare;

public class IfNested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int eng = 88;

		if (eng < 0 || eng > 100) {
			System.out.println("0-100������ ���������մϴ�.");
			return;
		}
		
		char hakjum=' ';
		if(eng>=90){
			hakjum='A';
		}else{
			if(eng>=80){
				hakjum='B';
				
			}else{
				if(eng>=70){
					hakjum='C';
				}else{
					if(eng>=60){
						hakjum='D';
					}else{
						hakjum='F';
					}
				}
			}
		}
		
		System.out.println("����� ������"+hakjum);
		
		hakjum = ' ';
		if(eng>=90){
			hakjum='A';
		}else if(eng>=80){
			hakjum='B';
		}else if(eng>=70){
			hakjum='C';
		}else if(eng>=60){
			hakjum='D';
		}else{
			hakjum='F';
		}
		
		System.out.println("����� ������"+hakjum);
			
		
		return;
	}

}
