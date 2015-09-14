
public class Engine {
	// 엔진에 관련함 멤버변수
	private String engine_type; // 엔진타입
	private int cc; // 배기량
	
	//생성자
	public Engine() {
		
	}

	public Engine(String engine_type, int cc) {
		this.engine_type = engine_type;
		this.cc = cc;
	}

	
	public void print(){
		System.out.println(engine_type+"\t"+cc);
	}
	
	
	
	//getter, setter
	public String getEngine_type() {
		return engine_type;
	}

	public int getCc() {
		return cc;
	}

	public void setEngine_type(String engine_type) {
		this.engine_type = engine_type;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
	
	
	
	
}
