package chap99_homework06;

import java.util.Scanner;

public class Basic2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요.");
		String input = sc.nextLine();
		String output = input.replaceAll("(?i)[aeiou]", "");

		System.out.println("모음을 제거한 문자열: " + output);
		
		sc.close();
	}

}
