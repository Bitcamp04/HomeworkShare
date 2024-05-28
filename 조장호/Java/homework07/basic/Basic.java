package homework07.basic;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// 1. 사용자가 문자열 3개를 입력하고 그 문자열을 합쳐서 출력하세요(StrginBuffer 사용).	
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < 3; i++) {
			System.out.println((i + 1) + "번째 문자열을 입력해 주세요.");
			sb.append(sc.nextLine());
		}
		
		System.out.println("입력하신 문자열 3개 합친 값입니다 -> " + sb.toString());
		sc.close();
		
		// 2. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
	    // 비어있는 바이트의 공간을 a로 모두 채우시오.
		StringBuffer sbHello = new StringBuffer(30);
		sbHello.append("hello");
		
		int remainHelloSize = sbHello.capacity() - sbHello.length();
//		System.out.println(remainHelloSize);
		
		for(int i = 0; i < remainHelloSize; i++) {
			sbHello.append("a");
		}
		System.out.println(sbHello.toString());
	}
	
}
