package com.itwill.util.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {
		//map�� ������ ����=�����̾ȵ�
		HashMap<String, Car> carMap = new HashMap<String, Car>();
		Car car1 = new Car("1111", 12);
		Car car2 = new Car("2222", 13);
		Car car3 = new Car("3333", 14);
		Car car4 = new Car("4444", 15);
		Car car5 = new Car("5555", 16);
		
		System.out.println("Car size: "+ carMap.size());
		//�����մϴ� �θ��θ�. �ٸ� arraylist�� set�̶� �޸���(add) put�� ����ؼ� Ű���� ������� �־��ش�
		carMap.put(car1.getNo(), car1);
		carMap.put(car2.getNo(), car2);
		carMap.put(car3.getNo(), car3);
		carMap.put(car4.getNo(), car4);
		carMap.put(car5.getNo(), car5);
		System.out.println("Car size: "+ carMap.size());
		System.out.println("Car ����:"+carMap);
		
		//Ű 1111 �������
		System.out.println("-----1111ã�ƺ�");
		Car getCar=carMap.get("1111");
		System.out.println(getCar);
		
		//Ű 2222 ������
		System.out.println("-------2222������");
		Car removeCar=carMap.remove("2222");
		System.out.println(carMap.size());//�Ƹ��� �Ⱥ��̴µ� �ϴ� ������
		System.out.println(removeCar);//�˾Ҵ� remove�� ������ ��ü�� key�� value�� ��ȯ�Ѵ�
		
		System.out.println("-------3333Ű�� ���� �ֳ�?");
		if(carMap.containsKey("3333")){
			System.out.println(">>>containsKey : "+carMap.containsKey("3333"));
		}
		
		System.out.println("-------4444(key)�� ã�Ƽ� ���ο� Car��ü�� �־��");
		carMap.replace("4444", new Car("8888", 19));
		System.out.println(carMap);
		
		System.out.println("------------��������~");
	//	carMap.clear();
	//	System.out.println(carMap);

		//�� Iteration (for���̶� ���� �޶�)
		System.out.println("--------------Iteration------------------");
		Iterator<String> keyIter=carMap.keySet().iterator();
		while(keyIter.hasNext()){
			String keyString = keyIter.next(); 
			System.out.println(keyString);
		}
		
		//Ű�� �̾Ƽ� �����ּ�
		Set<Entry<String, Car>> entrySet = carMap.entrySet();
		Iterator<Entry<String, Car>> entryIter= entrySet.iterator();
		
		while(entryIter.hasNext()){
			Entry<String, Car> entry = entryIter.next();
			String key =entry.getKey();
			Car car=entry.getValue();
			System.out.println("Ű"+key);
			car.print();
		}
		
	}

}
