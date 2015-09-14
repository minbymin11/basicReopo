package general;

public class GeneralMember {

	private int no;
	private String name;
	private String address;
	
	public GeneralMember() {
	}

	public GeneralMember(int no, String name, String address) {
		super();
		this.no = no;
		this.name = name;
		this.address = address;
	}
	

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void gPrint(){
		System.out.print(no+"\t"+name+"\t"+address+"\t");
	}
	
	
	
}
