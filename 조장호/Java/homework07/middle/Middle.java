package homework07.middle;

import java.util.Scanner;

public class Middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
	    // 비어있는 바이트의 공간을 b, i, t가 반복되어 들어가도록 모두 채우세요.
		StringBuffer sb = new StringBuffer(30);
		sb.append("hello");
		
		int remainBufferSize = sb.capacity() - sb.length();
		
		for(int i = 0; i < remainBufferSize; i++) {
			if(i % 3 == 0) {
				sb.append("b");
			} else if(i % 3 == 1) {
				sb.append("i");
			} else {
				sb.append("t");
			}
		}
		
		System.out.println(sb.toString());
		
		// 2. "유용한 클래스는 많다. 다양한 라이브러리를 활용한다."라는 
		// StringBuffer이 있을 때 사용자가 정수를 입력하고 
		// 위 StringBuffer를 거꾸로 만든 StringBuffer의 사용자가 입력한 정수에 
		// 해당하는 인덱스의 문자를 출력하세요.
		System.out.println("문장 : 유용한 클래스는 많다. 다양한 라이브러리를 활용한다.");
		StringBuffer setence = new StringBuffer("유용한 클래스는 많다. 다양한 라이브러리를 활용한다.");
		String reverseSetence = setence.reverse().toString();
		System.out.println("거꾸로 된 문장 : " + reverseSetence);
		Scanner sc = new Scanner(System.in);
		System.out.println("문장에서 뽑을 인덱스 값을 입력해 주세요.");
		int index = sc.nextInt();
		sc.nextLine();
		
		System.out.println("해당되는 문자는 : " + reverseSetence.charAt(index) + "입니다.");
		sc.close();
	}

}
