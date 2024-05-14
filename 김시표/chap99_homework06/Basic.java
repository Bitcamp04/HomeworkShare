package chap99_homework06;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요.");
		String input = sc.nextLine();
		
		int countA = 0;
		int countB = 0;
		
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == '가') {
				countA++;
			} else if (ch == '바') {
				countB++;
			}
		}
		if (countA == 0 && countB ==0) {
			System.out.println("가와 바가 존재하지 않습니다");
		} else {
			System.out.println("'가'의 개수: " + countA);
			System.out.println("'바'의 개수: " + countB);
					
		}
	
		sc.close();	
	
	}
	
}
