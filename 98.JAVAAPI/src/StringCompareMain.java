
public class StringCompareMain {

	public static void main(String[] args) {
		
		String str1="JAVA";
		String str2="JAVA";
		
		String str3=new String("JAVA");
		String str4=new String("JAVA");
		
		if(str1.equals(str2)){
			System.out.println("str1�� str2�� ���ڿ��� ���� ����");
		}
		if(str1.equals(str3)){
			System.out.println("str1�� str3�� ���ڿ��� ���� ����");
			
		}
		if(str1.equals(str4)){
			System.out.println("str1�� str4�� ���ڿ��� ���� ����");
			
		}
		
		if(str1.equals("JAVA")){
			System.out.println("str1�� \"JAVA\" �� ���ڿ��� ���� ����");
			
		}
		if("JAVA".equals("JAVA")){
			System.out.println("\"JAVA\"�� \"JAVA\" �� ���ڿ��� ���� ����");
			
		}
		if(!str4.equals("java")){
			System.out.println("str4�� \"java\" �� ���ڿ��� ���� �����ʴ�");
			
		}
		//��ҹ��� �����ϰ� ��
		if(str4.equalsIgnoreCase("java")){
			System.out.println("str4�� \"java\" �� ���ڿ��� ���� ����(��ҹ��� ����)");
		}
		
	}

}
