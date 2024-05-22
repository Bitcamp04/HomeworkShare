package homework03.basic;

public class SmartPhone {
	//	1. SmartPhone 클래스를 생성하고 속성 세 개와 기능 세 개를 자유롭게 만들어보세요.
	String phoneNumber;
	String type;
	String releasedDate;
	
	public void phoneNumSave(String firstNum, String middleNum, String lastNum) {
		phoneNumber = firstNum + middleNum + lastNum;
	}
	
	public String phoneType(String type) {
		if(type.equals("g")) {
			this.type = "Galaxy 24";
		} else if(type.equals("i")) {
			this.type = "iPhone 15 Pro";
		} else {
			this.type = "type is not existed";
		}
		
		return this.type;
	}
	
	public String phoneReleasd(String type) {
		if(type.equals("g")) {
			this.releasedDate = "2024-01-30";
		} else if(type.equals("i")) {
			this.releasedDate = "2023-10-13";
		} else {
			this.releasedDate = "type is not existed";
		}
		return this.type;
	}
}
