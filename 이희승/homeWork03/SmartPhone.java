package homeWork.homeWork03;

public class SmartPhone {

	public int phonNum;
	public String masterName;
	public int subPhonNum;
	
	
	 public SmartPhone() {
	
	}
	
	public SmartPhone(int phonNum) {
		this.phonNum=phonNum;
	}
	public SmartPhone(int phonNum,String mastrname) {
		this.phonNum=phonNum;
		this.masterName=mastrname;
	}
	public SmartPhone(int phonNum,String mastrname,int subPhonNum) {
		this.phonNum=phonNum;
		this.masterName=mastrname;
		this.subPhonNum=subPhonNum;
	}
	
	public void printphonnum() {
		System.out.println("전화번호"+this.phonNum);
	}
	public void printmasterName() {
		System.out.println("전화번호"+this.masterName);
	}
	public void printsubPhonNum() {
		System.out.println("전화번호"+this.subPhonNum);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
