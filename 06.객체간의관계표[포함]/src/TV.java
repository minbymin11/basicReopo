
public class TV {

	private int channel;
	private int volume;
	private boolean onOff;
	public int getChannel() {
		return channel;
	}
	
	
	//생성자
	public TV() {
		
	}
				
	public TV(int channel, int volume, boolean onOff) {
		super();
		this.channel = channel;
		this.volume = volume;
		this.onOff = onOff;
	}
	
	
	//getter, setter
	
	public int getVolume() {
		return volume;
	}
	//boolean의 get경우
	public boolean isOnOff() {
		return onOff;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public void setOnOff(boolean onOff) {
		this.onOff = onOff;
	}
	
	
}
