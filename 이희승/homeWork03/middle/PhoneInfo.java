package homeWork.homeWork03.middle;

public class PhoneInfo {
	String[] names = new String[100];
	String[] phoneNums = new String[100];

	int index = 0;

	public void insertPhoneInfo(String name, String phoneNum) {
	    //매개변수로 전달된 이름과 번호를 각각의 배열에 저장하는 기능 구현
		if(index < 100) {
			names[index] = name;
			phoneNums[index] = phoneNum;
			index++;
		
	}else {
		System.out.println(" 더이상저장불가");}
	}

	public void printAllPhoneInfo() {
	    //배열에 저장된 모든 이름과 번호를 순서대로 출력하는 기능 구현 
		for(int i = 0; i < names.length; i++) {
			System.out.println((i + 1) + "번째이름 : " + names[i] + ", 전화번호 : " + phoneNums[i]);
		}
	}

	public void printPhoneInfo(int index) {
	    //매개변수로 전달된 인덱스에 해당하는 이름과 번호 출력하는 기능 구현
		if(index >= 0 && index < 100) {
			System.out.println("입력하신 " + index + "에 저장된 이름,번호: " + names[index] + ", " + phoneNums[index]);
		} else {
			System.out.println("해당index 존재하지않음");
		}
	}
}
