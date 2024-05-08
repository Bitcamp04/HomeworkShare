package homework03.advance;

import homework03.basic.User;

public class UserBook {

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
