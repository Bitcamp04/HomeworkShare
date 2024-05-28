package homework12.number01;

import java.util.Arrays;
import java.util.Scanner;

public class Conditional {

	// 1. 사용자가 입력한 두 정수 중에서 큰 정수를 출력하세요.
	public static void conditionalOne(Scanner sc) {
		System.out.println("첫 번째 정수를 입력해 주세요.");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("두 번째 정수를 입력해 주세요.");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		if(num1 > num2) {
			System.out.println("입력한 두 정수 중 큰 정수는 " + num1 + "입니다.");
		} else if(num2 > num1) {
			System.out.println("입력한 두 정수 중 큰 정수는 " + num2 + "입니다.");
		} else{
			System.out.println("입력한 두 정수는 같습니다.");
		}
	}
	
	// 2. 사용자가 입력한 정수가 양수면 "양수" 음수면 "음수"라고 출력하세요.
	public static void conditionalTwo(Scanner sc) {
		System.out.println("정수를 입력하세요.");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수");
		} else if(num < 0) {
			System.out.println("음수");
		} else {
			System.out.println("0");
		}
	}
	
	// 3. 사용자가 입력한 문자열이 "Java"인 경우 "좋아하는 언어입니다."를 출력하고, "Python"인 경우 "공부중인 언어입니다."를 출력하고,  
    // 그렇지 않은 경우 "다른 언어를 공부해보세요."를 출력하세요.(switch~case~default 사용)
	public static void conditionalThree(Scanner sc) {
		System.out.println("문자열을 입력해주세요.");
		String inputStr = sc.nextLine();
		
		if(inputStr.equals("Java")) {
			System.out.println("좋아하는 언어입니다.");
		} else if(inputStr.equals("Python")) {
			System.out.println("공부중인 언어입니다.");
		} else {
			System.out.println("다른 언어를 공부해보세요.");
		}
	}
	
	// 4. 사용자가 입력한 숫자가 3의 배수면 "3의 배수입니다."라고 출력하고 3의 배수가 아니면 "3의 배수가 아닙니다."를 출력하세요.(switch~case~default 사용)
	public static void conditionalFour(Scanner sc) {
		System.out.println("숫자를 입력해 주세요.");
		int num = sc.nextInt();
		sc.nextLine();
		
		int switch_num = num % 3;
		
		switch(switch_num) {
			case  0 :
				System.out.println("3의 배수입니다.");
				break;
			default :
				System.out.println("3의 배수가 아닙니다.");
				break;
		}
	}
	
	// 5. 사용자가 입력한 숫자가 홀수인 경우 "홀수입니다."를 출력하고, 짝수인 경우 "짝수입니다."를 출력하는 프로그램을 작성하세요.
	public static void conditionalFive(Scanner sc) {
		System.out.println("숫자를 입력해 주세요.");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}
	
	// 6. 사용자가 입력한 5개의 정수중 가장 큰 수를 출력하세요.
	public static void conditionalSix(Scanner sc) {
		int[] intList = new int[5];
		for(int i = 0; i < 5; i++) {
			System.out.println((i + 1) + "번재 정수를 입력해 주세요.");
			intList[i] = sc.nextInt();
		}
		
		Arrays.sort(intList);
		System.out.println("입력한 5개의 정수중 가장 큰 수는 : " + intList[4]);
	}
	
	// 7. 사용자가 입력한 문자열이 "Yes"인 경우 "예"를 출력하고, "No"인 경우 "아니오"를 출력하고, 그 외의 경우에는 "잘못 입력하셨습니다."를 출력하세요.
	public static void conditionalSeven(Scanner sc) {
		System.out.println("문자열을 입력해주세요.");
		String inputStr = sc.nextLine();
		
		if(inputStr.equals("Yes")) {
			System.out.println("예");
		} else if(inputStr.equals("No")) {
			System.out.println("아니오");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	// 8. 사용자가 입력한 두 정수를 비교하여 같으면 "두 수가 같습니다." 첫 번째 수가 더 크면 "첫 번째 수가 더 큽니다.
	// " 두 번째 수가 더 크면 "두 번째 수가 더 큽니다."를 출력하세요.
	public static void conditionalEigth(Scanner sc) {
		System.out.println("첫 번째 정수를 입력해 주세요.");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("두 번째 정수를 입력해 주세요.");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		if(num1 == num2) {
			System.out.println("두 수가 같습니다.");
		} else if(num1 > num2) {
			System.out.println("첫 번째 수가 더 큽니다.");
		} else {
			System.out.println("두 번째 수가 더 큽니다.");
		}
	}
	
	// 9. 사용자가 입력한 세 정수가 모두 짝수인 경우 "모두 짝수입니다." 모두 홀수인 경우 "모두 홀수입니다." 
	// 그 외의 경우 "짝수 : xxx개, 홀수 : xxx개 입니다."를 출력하세요.
	public static void conditionalNine(Scanner sc) {
		int[] numArr = new int[3];
		for(int i = 0; i < numArr.length; i++) {
			System.out.println((i + 1) + "번째 정수를 입력해 주세요.");
			numArr[i] = sc.nextInt();
		}
		
		int checkEvenNum = 0;
		
		for(int j = 0; j < numArr.length; j++) {
			if(numArr[j] % 2 == 0) {
				checkEvenNum++;
			}
		}
		
		if(checkEvenNum == 3) {
			System.out.println("모두 짝수입니다.");
		} else if(checkEvenNum == 0) {
			System.out.println("모두 홀수입니다.");
		} else {
			System.out.println("짝수 : " + checkEvenNum + "개, 홀수 : " + (numArr.length - checkEvenNum) + "개 입니다.");
		}
	}
}
