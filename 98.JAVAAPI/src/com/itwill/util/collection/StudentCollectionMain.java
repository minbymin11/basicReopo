package com.itwill.util.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class StudentCollectionMain {

	public static void main(String[] args) {

		HashMap<String, ArrayList<Student>> schoolMap = 
				new HashMap<>();
		//������ ���� 3�� ������µ� �ݿ��� �л����� �������̴ϱ� ArrayList�� ����ߴ�.
		schoolMap.put("A", new ArrayList<Student>());
		schoolMap.put("B", new ArrayList<Student>());
		schoolMap.put("C", new ArrayList<Student>());
		
		// A�� 1�� �̸� ����, ����, ����
		schoolMap.get("A").add(new Student(1, null, 0, 0, 0));	
		schoolMap.get("A").add(new Student(2, null, 0, 0, 0));
		schoolMap.get("B").add(new Student(1, null, 0, 0, 0));
		schoolMap.get("B").add(new Student(2, null, 0, 0, 0));
		schoolMap.get("B").add(new Student(3, null, 0, 0, 0));
		schoolMap.get("C").add(new Student(1, null, 0, 0, 0));
		schoolMap.get("C").add(new Student(2, null, 0, 0, 0));
	
		//b�ݿ� �л� ã��
		ArrayList<Student> bStudentList = schoolMap.get("B");
	
		//��ü���
		System.out.println("-----�б� �л� ��ü ���----------");
		
		Set<String> banKeySet=schoolMap.keySet();//
		Iterator<String> banKeyIter = banKeySet.iterator();
		
		while (banKeyIter.hasNext()) {
			String banKeyStr = banKeyIter.next();
			System.out.println("----------"+banKeyStr+"--------------");//��Ű�� A,B,C �ϱ� ��Ʈ�� ���� ������ arraylist �л���ü�� StudentŸ�����εǾ����� 
			ArrayList<Student> temStudentList=schoolMap.get(banKeyStr);
			for (Student student : temStudentList) {
				student.print();
			}
			
		}
	
	
	
	}
	

}
