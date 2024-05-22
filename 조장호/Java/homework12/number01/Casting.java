package homework12.number01;

import java.util.Scanner;

public class Casting {

	// 1. 사용자가 두 개의 정수를 입력하면 문자열로 받아서 두 개의 문자열 정수를 정수형으로 변환해서 합을 출력하세요.
	public static void CastingNumberOne(Scanner sc) {
		System.out.println("첫 번째 숫자를 입력해 주세요.");
		String num1 = sc.nextLine();
		
		System.out.println("두 번째 숫자를 입력해 주세요.");
		String num2 = sc.nextLine();
		
		System.out.println("입력하신 두 개의 숫자의 합은 : " + (Integer.parseInt(num1) + Integer.parseInt(num2)));
	}
	
	// 2.사용자가 두 개의 정수(a, b)를 입력해서 a / b의 연산결과를 실수로 출력하세요.(단, b는 0을 입력할 수 없습니다.)
	public static void CastingNumberTwo(Scanner sc) {
		System.out.println("첫 번째 숫자를 입력해 주세요.");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("두 번째 숫자를 입력해 주세요.");
		int num2 = sc.nextInt();
		
		while(true) {
			if(num2 == 0) {
				System.out.println("두 번째 숫자는 0을 입력할 수 없습니다. 다시 입력해 주세요.");
				num2 = sc.nextInt();
			} else {
				break;
			}
		}
		
		System.out.println("입력하신 두 개의 정수 a /b 연산 결과는 : " + ((double) num1 / num2) + "입니다.");
	}
	
	// 3. 사용자가 실수 한 개를 입력하면 정수형으로 변환해서 출력하세요.
	public static void CastingNumberThree(Scanner sc) {
		System.out.println("실수를 입력해 주세요.");
		double num = sc.nextDouble();
		
		System.out.println("입력하신 실수 -> 정수 변환 값 : " + (int) num + "입니다");
	}
	
	// 4. 사용자가 한 개의 실수를 입력하면 그 실수의 제곱의 결과를 문자열로 변환하여 출력하세요.
	public static void CastingNumberFour(Scanner sc) {
		System.out.println("실수를 입력해 주세요.");
		double num = sc.nextDouble();
		
		System.out.println("입력하신 실수 값의 제곱값은 : " + Math.pow(num, 2) + "입니다.");
	}
	
	// 5. int형 변수 iNum = 10과 long형 변수 lNum = 20의 값을 서로 교환하세요.
	public static void CastingNumberFive() {
		int iNum = 10;
		long lNum = 20L;
		System.out.println("변환하기 전 iNum 값 : " + iNum + ", lNum 값 : " + lNum);
		int temp = iNum;
		iNum = (int) lNum;
		lNum = temp;
		System.out.println("변환 후 iNum 값 : " + iNum + ", lNum 값 : " + lNum);
	}

	// 6. 사용자가 입력한 두 개의 문자 각각의 유니코드를 출력하세요.
	public static void CastingNumberSix(Scanner sc) {
		System.out.println("첫 번째 문자를 입력하세요.(그 다음 문자는 입력되지 않습니다.)");
		char ch1 = sc.nextLine().charAt(0);
		
		System.out.println("두 번째 문자를 입력하세요.(그 다음 문자는 입력되지 않습니다.)");
		char ch2 = sc.nextLine().charAt(0);
		
		System.out.println("첫 번째 문자의 유니코드 값 : " + (int) ch1 + ", 두 번째 문자의 유니코드 값 : " + (int) ch2 + "입니다.");
	}
}
