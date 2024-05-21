package homework12.number01;

import java.util.Scanner;

public class Operator {
	// 2. 2. int형 변수 20을 증감연산자를 사용해서 다음과 같은 순서로 출력되도록 구현하세요.
	// 21, 22, 22, 21, 20, 20, 20, 마지막 변수의 값(증감연산자 없이) : 20
	public static void operatorNumberTwo() {
		int num = 20;
		System.out.println(++num);
		System.out.println(++num);
		System.out.println(num--);
		System.out.println(num--);
		System.out.println(num--);
		System.out.println(++num);
		System.out.println(num);
	}
	
	// 3. 사용자가 입력한 정수가 2와 7의 공배수면 "2와 7의 공배수"라고 출력하고 아니면
	// "2와 7의 공배수가 아님"이라고 출력하세요.
	public static void operatorNumberThree(Scanner sc) {
		System.out.println("정수를 입력해 주세요.");
		int num = sc.nextInt();
		if(num % 2 == 0 && num % 7 == 0) {
			System.out.println("입력한 정수는 2와 7의 공배수 입니다.");
		} else {
			System.out.println("입력한 정수는 2와 7의 공배수가 아닙니다.");
		}
	}
	
	// 4. 사용자로부터 입력받은 문자열이 "Hello"인지 아닌지 판별하는 프로그램을 작성하세요.
	public static void operatorNumberFour(Scanner sc) {
		System.out.println("문자열을 입력해주세요.");
		String inputStr = sc.nextLine();
		if(inputStr.equals("Hello")) {
			System.out.println("입력하신 문자열은 Hello와 일치합니다.");
		} else {
			System.out.println("입력하신 문자열은 Hello와 일치하지 않습니다.");
		}
	}
	
	// 5. 삼항연산자를 이용하여 사용자가 입력한 정수가 홀수면 "홀수" 짝수면 "짝수"라고 출력하세요.
	public static void operatorNumberFive(Scanner sc) {
		System.out.println("정수를 입력해 주세요.");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.println((num % 2 == 0 ? "짝수" : "홀수"));
	}
	
	public static void operatorNumberSix(Scanner sc) {
		
	}
}
