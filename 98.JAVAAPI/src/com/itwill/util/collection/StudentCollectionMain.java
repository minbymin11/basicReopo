package com.itwill.util.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class StudentCollectionMain {

	public static void main(String[] args) {

		HashMap<String, ArrayList<Student>> schoolMap = 
				new HashMap<>();
		//맵으로 반을 3개 만들었는데 반에는 학생들이 여러명이니깐 ArrayList를 사용했다.
		schoolMap.put("A", new ArrayList<Student>());
		schoolMap.put("B", new ArrayList<Student>());
		schoolMap.put("C", new ArrayList<Student>());
		
		// A반 1번 이름 국어, 영어, 수학
		schoolMap.get("A").add(new Student(1, null, 0, 0, 0));	
		schoolMap.get("A").add(new Student(2, null, 0, 0, 0));
		schoolMap.get("B").add(new Student(1, null, 0, 0, 0));
		schoolMap.get("B").add(new Student(2, null, 0, 0, 0));
		schoolMap.get("B").add(new Student(3, null, 0, 0, 0));
		schoolMap.get("C").add(new Student(1, null, 0, 0, 0));
		schoolMap.get("C").add(new Student(2, null, 0, 0, 0));
	
		//b반에 학생 찾기
		ArrayList<Student> bStudentList = schoolMap.get("B");
	
		//전체출력
		System.out.println("-----학교 학생 전체 출력----------");
		
		Set<String> banKeySet=schoolMap.keySet();//
		Iterator<String> banKeyIter = banKeySet.iterator();
		
		while (banKeyIter.hasNext()) {
			String banKeyStr = banKeyIter.next();
			System.out.println("----------"+banKeyStr+"--------------");//반키는 A,B,C 니깐 스트링 반을 꺼내면 arraylist 학생객체는 Student타입으로되어있음 
			ArrayList<Student> temStudentList=schoolMap.get(banKeyStr);
			for (Student student : temStudentList) {
				student.print();
			}
			
		}
	
	
	
	}
	

}
