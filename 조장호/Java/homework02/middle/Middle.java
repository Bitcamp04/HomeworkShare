package homework02.middle;

public class Middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.
		int[] tmp = reverseArr(new int[] {1, 2, 3, 4, 5});
		for(int i = 0; i < tmp.length; i++) {
			System.out.println(tmp[i]);
		}
		System.out.println("----------------------------------------------------");
		// 2.
		char[] answer = convertCast(new char[] {'y', 'B', 'c', 'D', 'z', 'A'});
		for(int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
	// 1. int 배열 한 개를 매개변수로 받아서 역순으로 저장된 새로운 배열을 리턴하는 메소드를 구현하세요. 
	// 실행클래스의 메인메소드 아래에 static 메소드로 선언하세요.
	// static의 위치는 접근제어자와 리턴타입 사이입니다. (예시 public static void add(int a, int b) { return a + b; })

	public static int[] reverseArr(int[] inputArr) {
		int[] rtnArr = new int[inputArr.length];
		for(int i = 0; i < inputArr.length; i++) {
			rtnArr[i] = inputArr[(inputArr.length - 1) - i];
		}
		return rtnArr;
	}
	
	// 2. char 배열 한 개를 매개변수로 받아서 소문자는 대문자로, 
	// 대문자는 소문자로 변환하는데 대문자로 변환된 값은 뒤로 하나 이동한 문자를  
	// 소문자로 변환된 값는 앞으로 하나 이동한 문자를 저장한 배열을 리턴하는 메소드를 구현하세요. 
	// 매개변수로 전달되는 char 배열에는 알파벳 대소문자만 존재합니다. 
	// {'y', 'B', 'c', 'D'} 배열이 전달되면 {'Z', 'a', 'D', 'c'}가 리턴돼야 합니다. 
	// 그리고 만약 'z'가  입력되면 'A'가 'A'가 입력되면 'z' 리턴돼야 합니다(알파벳 범위내에서만 이동할수 있도록).
	// 실행클래스의 메인메소드 아래에 static 메소드로 선언하세요. static의 위치는 접근제어자와 리턴타입 사이입니다.
	// (예시 public static void add(int a, int b) { return a + b; })
	public static char[] convertCast(char[] inputArr) {
		char[] rtnArr = new char[inputArr.length];
		for(int i = 0; i < inputArr.length; i++) {
			if(inputArr[i] > 65 && inputArr[i] <= 90) {
				rtnArr[i] = (char) (inputArr[i] + 32 - 1);
			} else if(inputArr[i] > 97 && inputArr[i] < 122) {
				rtnArr[i] = (char) (inputArr[i] - 32 + 1);
			} else if(inputArr[i] == 122) {
				rtnArr[i] = 'A';
			} else if(inputArr[i] == 65) {
				rtnArr[i] = 'z';
			}
		}
		return rtnArr;
	}
}
