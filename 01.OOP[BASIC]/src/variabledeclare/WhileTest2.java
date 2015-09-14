package variabledeclare;
import java.util.Collection;

import javax.swing.JOptionPane;

public class WhileTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String endNumStr=JOptionPane.showInputDialog("출력의 마지막 정수를 입력하세요");
			
		
		/**
		 * 1~10까지의 정수 출력
		 * */
		
		int i = 0;
		int endNum = Integer.parseInt(endNumStr);
		while(i<10) {
			int number = i+1;
			System.out.print(number);
			i++;
			if(i!=10)
			System.out.print(",");
		}
		/*
		 * 1-10까지의 정수중 홀수출력
		 * */
		System.out.println(" ");
		i = 0;
		while (i < 10) {
			int number = i + 1;
			if (number % 2 == 1) {
				System.out.print(number + " ");
			}
			i++;
		}
		/*
		 * 1-10까지 정수함(홀수, 짝수)
		 * */
		System.out.println(" ");
		
		i=0;
		int tot = 0;
		int oddTot = 0;
		int evenTot = 0;
		
		while(i<10){
			int number=i+1;
				
				tot+=number; //tot=tot+number
			
			if(number%2==0){
				evenTot+=number;
			}else{
				oddTot+=number;
			}
			
		i++;
		}
		
		System.out.println("전체합:"+ tot);
		System.out.println("짝수합:"+ evenTot);
		System.out.println("홀수합:"+ oddTot);
		
		
		
		/**
		 * 알파벳대문자를 출력하세요
		 * 
		 * */
	
		char c = 'A';
		int lineCount=0;
		while(c<='Z'){
			System.out.println(c+" ");
			lineCount++;
			if(lineCount%5==0){
				System.out.println("\n");
			}
			c++;
			
		}
	
		
	} 
}
