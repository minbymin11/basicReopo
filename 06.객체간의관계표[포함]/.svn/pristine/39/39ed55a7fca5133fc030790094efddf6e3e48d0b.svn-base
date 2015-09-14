
public class TVMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TV tv1 = new TV();
		
		tv1.setOnOff(true);
		tv1.setChannel(13);
		tv1.setVolume(10);
		
		System.out.println("current channel :"+tv1.getChannel());
		
		TV tv2 = tv1;  // tv2는 tv1을 참조하고 있어
		tv2.setChannel(6);		
		System.out.println("current channel :"+tv2.getChannel());
		
		//주소값은 비교가 가능(주소값이 크다 작다는 비교 불가능, 같다 같지않다만 가능)
		if(tv1==tv2){
			System.out.println("tv1과 tv2의 주소값이 같다");
		}

		TV tv3 = new TV(11, 8,true);
		
		if(tv3==tv2){
			System.out.println("tv3과 tv2의 주소값이 같다");
		}else{
			System.out.println("tv3과 tv2의 주소값이 같지않다");
		}
		
		tv3=tv2;
		
		if(tv3==tv2){
			System.out.println("tv3과 tv2의 주소값이 같다");
		}else{
			System.out.println("tv3과 tv2의 주소값이 같지않다");
		}
		
		
		
	}

}
