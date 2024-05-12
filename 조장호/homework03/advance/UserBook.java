package homework03.advance;

import homework03.basic.User;

public class UserBook {

	/*
	 * 1. UserBook 클래스를 생성하세요.
		  basic 3번 문제에서 만든 User클래스 타입의 값을 100개 저장할 수 있는 
		  배열과 현재 배열에 위치를 저장하는 index를 필드로 생성합니다.
		  매개변수로 username과 password를 받아서 User 객체를 생성하여 
		  배열에 저장하는 메소드 saveUserInfo를 구현하세요. 이 때 User의 id는
		  index + 1로 지정합니다.
	 */
	User[] userArray = new User[100];
	int index = 0;
	
	public void saveUserInfo(String username, String password) {
		if(index >= 0 && index <= 99) {
			User user = new User();
			user.setId(index);
			user.setUsername(username);
			user.setPassword(password);
			userArray[index++] = user;
			System.out.println("현재 저장된 전화번호 개수 : " + index);
		} else {
			System.out.println("더 이상 user를 저장할 수 없습니다.");
		}
	}
	
	public void printUserInfo(int index) {
		if(userArray[index] != null) {
			System.out.println("id: " + userArray[index].getId() 
					+ ", username : " + userArray[index].getUsername()
					+ ", password: " + userArray[index].getPassword());
		} else {
			System.out.println("해당 인덱스에 저장된 데이터가 없습니다.");
		}
	}
}
