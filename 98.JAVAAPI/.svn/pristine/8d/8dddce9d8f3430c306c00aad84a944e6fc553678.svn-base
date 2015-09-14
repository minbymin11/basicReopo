package com.itwill.util.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {
		//map은 순서가 없다=정렬이안됨
		HashMap<String, Car> carMap = new HashMap<String, Car>();
		Car car1 = new Car("1111", 12);
		Car car2 = new Car("2222", 13);
		Car car3 = new Car("3333", 14);
		Car car4 = new Car("4444", 15);
		Car car5 = new Car("5555", 16);
		
		System.out.println("Car size: "+ carMap.size());
		//입차합니다 부릉부릉. 다른 arraylist나 set이랑 달르게(add) put을 사용해서 키값과 밸류값을 넣어준다
		carMap.put(car1.getNo(), car1);
		carMap.put(car2.getNo(), car2);
		carMap.put(car3.getNo(), car3);
		carMap.put(car4.getNo(), car4);
		carMap.put(car5.getNo(), car5);
		System.out.println("Car size: "+ carMap.size());
		System.out.println("Car 구조:"+carMap);
		
		//키 1111 보여줘바
		System.out.println("-----1111찾아봐");
		Car getCar=carMap.get("1111");
		System.out.println(getCar);
		
		//키 2222 지워봐
		System.out.println("-------2222지워봐");
		Car removeCar=carMap.remove("2222");
		System.out.println(carMap.size());//아몰랑 안보이는데 일단 지웠어
		System.out.println(removeCar);//알았다 remove가 지워진 객체의 key랑 value를 반환한다
		
		System.out.println("-------3333키를 갖고 있냐?");
		if(carMap.containsKey("3333")){
			System.out.println(">>>containsKey : "+carMap.containsKey("3333"));
		}
		
		System.out.println("-------4444(key)를 찾아서 새로운 Car객체를 넣어봐");
		carMap.replace("4444", new Car("8888", 19));
		System.out.println(carMap);
		
		System.out.println("------------다지워라~");
	//	carMap.clear();
	//	System.out.println(carMap);

		//맵 Iteration (for문이랑 뭐가 달라)
		System.out.println("--------------Iteration------------------");
		Iterator<String> keyIter=carMap.keySet().iterator();
		while(keyIter.hasNext()){
			String keyString = keyIter.next(); 
			System.out.println(keyString);
		}
		
		//키만 뽑아서 보여주셈
		Set<Entry<String, Car>> entrySet = carMap.entrySet();
		Iterator<Entry<String, Car>> entryIter= entrySet.iterator();
		
		while(entryIter.hasNext()){
			Entry<String, Car> entry = entryIter.next();
			String key =entry.getKey();
			Car car=entry.getValue();
			System.out.println("키"+key);
			car.print();
		}
		
	}

}
