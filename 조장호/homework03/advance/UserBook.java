package homework03.advance;

import homework03.basic.User;

public class UserBook {

	User[] userArray = new User[100];
	public int index;
	
	public void saveUserInfo(String username, String password) {
		index = 1;
		if(index >= 1 && index <= 100) {
			User user = new User();
			user.setId(index);
			user.setUsername(username);
			user.setPassword(password);
			userArray[index - 1] = user;
			System.out.println("현재 저장된 전화번호 개수 : " + index);
			index++;
		} else {
			System.out.println("더 이상 user를 저장할 수 없습니다.");
		}
	}
}
