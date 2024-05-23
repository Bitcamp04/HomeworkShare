package homework12.number01;

import java.util.Scanner;

public class NumberOne {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		/**
		 * 변수 문제
		 */
		// 1. 사용자가 입력한 이름, 나이, 성별을 출력하세요.
//		Variable.VariableNumberOne(sc);
		
		// 2. 사용자가 입력한 두 개의 정수와 문자(char) 연산자를 받아 
		// 두 정수로 해당 연산을 진행한 결과를 출력하세요.
//		Variable.VariableNumberTwo(sc);
		
		// 3. 반지름이 20인 원의 넓이와 둘레를 출력하세요.(넓이 : 2 * 3.14 * 반지름 ^ 2, 둘레 : 4 * 3.14 * 반지름)
	    // 단, 원주율 3.14는 상수로 선언하세요.
//		Variable.VariableNumberThree();
		
		// 4. 사용자가 입력한 5개의 정수의 합계와 평균을 출력하세요.
//		Variable.VariableNumberFour(sc);
		
		// 5. 사용자가 입력한 세 정수의 최소 값, 중간 값, 최대 값을 출력하세요.
//		Variable.VariableNumberFive(sc);
		
		// 6. 사용자가 입력한 정수의 구구단을 출력하세요.
//		Variable.VariableNumberSix(sc);
		
		// 7. 사용자가 입력한 정수로 해당 정수의 팩토리얼을 계산하여 출력하세요.(재귀메소드 없이, while이나 for 반복문을 사용)
//		Variable.VariableNumberSeven(sc);
		
		// 8. 사용자가 입력한 10개의 정수 중 소수의 개수를 출력하세요.(소수는 1이랑 본인 말고는 나눠떨어지는 값이 없는 수입니다.)
		// 사용자가 입력할 수 있는 값은 2 ~ 30로 제한
//		Variable.VariableNumberEight(sc);
		
		/**
		 * 형 변환 문제
		 */
		// 1. 사용자가 두 개의 정수를 입력하면 문자열로 받아서 두 개의 문자열 정수를 정수형으로 변환해서 합을 출력하세요.
//		Casting.CastingNumberOne(sc);

		// 2. 사용자가 두 개의 정수(a, b)를 입력해서 a / b의 연산결과를 실수로 출력하세요.(단, b는 0을 입력할 수 없습니다.)
//		Casting.CastingNumberTwo(sc);
		
		// 3. 사용자가 실수 한 개를 입력하면 정수형으로 변환해서 출력하세요.
//		Casting.CastingNumberThree(sc);
		
		// 4. 사용자가 한 개의 실수를 입력하면 그 실수의 제곱의 결과를 문자열로 변환하여 출력하세요.
//		Casting.CastingNumberFour(sc);
		
		// 5. int형 변수 iNum = 10과 long형 변수 lNum = 20의 값을 서로 교환하세요.
//		Casting.CastingNumberFive();
		
		// 6. 사용자가 입력한 두 개의 문자 각각의 유니코드를 출력하세요.
//		Casting.CastingNumberSix(sc);
		
		/**
		 * 연산자 문제
		 */
		// 1. 사용자가 입력한 두 정수읜 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
		// (메소드로 따로 만들지 말고 메인메소드에서 구현)
//		System.out.println("첫 번째 정수를 입력해주세요.");
//		int num1 = sc.nextInt();
//		sc.nextLine();
//		
//		System.out.println("두 번째 정수를 입력해주세요.");
//		int num2 = sc.nextInt();
//		sc.nextLine();
//		
//		System.out.println("입력한 덧셈의 결과 : " + (num1 + num2));
//		System.out.println("입력한 뺄셈의 결과 : " + (num1 - num2));
//		System.out.println("입력한 곱셈의 결과 : " + (num1 * num2));
//		System.out.println("입력한 나눗셈의 결과 : " + ((double)num1 / num2));
//		System.out.println("입력한 나머지 연산의 결과 : " + (num1 % num2));
		
		// 2. 2. int형 변수 20을 증감연산자를 사용해서 다음과 같은 순서로 출력되도록 구현하세요.
		// 21, 22, 22, 21, 20, 20, 20, 마지막 변수의 값(증감연산자 없이) : 20
//		Operator.operatorNumberTwo();
		
		// 3. 사용자가 입력한 정수가 2와 7의 공배수면 "2와 7의 공배수"라고 출력하고 아니면
		// "2와 7의 공배수가 아님"이라고 출력하세요.
//		Operator.operatorNumberThree(sc);
		
		// 4. 사용자로부터 입력받은 문자열이 "Hello"인지 아닌지 판별하는 프로그램을 작성하세요.
//		Operator.operatorNumberFour(sc);
		
		// 5. 삼항연산자를 이용하여 사용자가 입력한 정수가 홀수면 "홀수" 짝수면 "짝수"라고 출력하세요.
//		Operator.operatorNumberFive(sc);
		
		// 6. 삼항연산자의 중첩을 이용하여 사용자가 입력한 정수가 100보다 크면 "100보다 큼" 
		// 작으면 "100보다 작음" 같으면 "100"을 출력하세요.
//		Operator.operatorNumberSix(sc);
		
		// 7. 사용자가 입력한 두 실수의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
//		Operator.operatorNumberSeven(sc);
		
		// 8. 사용자가 입력한 하나의 문자열과 하나의 정수로 "입력한 문자열 xxxxx이고, 입력한 숫자는 xxxxxx입니다." 라고 출력하세요.
//		Operator.operatorNumberEigth(sc);
		
		/**
		 * 조건문 문제
		 */
		// 1. 사용자가 입력한 두 정수 중에서 큰 정수를 출력하세요.
//		Conditional.conditionalOne(sc);
		// 2. 사용자가 입력한 정수가 양수면 "양수" 음수면 "음수"라고 출력하세요.
//		Conditional.conditionalTwo(sc);
		// 3. 사용자가 입력한 문자열이 "Java"인 경우 "좋아하는 언어입니다."를 출력하고, "Python"인 경우 "공부중인 언어입니다."를 출력하고,  
	    // 그렇지 않은 경우 "다른 언어를 공부해보세요."를 출력하세요.(switch~case~default 사용)
//		Conditional.conditionalThree(sc);
		// 4. 사용자가 입력한 숫자가 3의 배수면 "3의 배수입니다."라고 출력하고 3의 배수가 아니면 "3의 배수가 아닙니다."를 출력하세요.(switch~case~default 사용)
//		Conditional.conditionalFour(sc);
		// 5. 사용자가 입력한 숫자가 홀수인 경우 "홀수입니다."를 출력하고, 짝수인 경우 "짝수입니다."를 출력하는 프로그램을 작성하세요.
//		Conditional.conditionalFive(sc);
		// 6. 사용자가 입력한 5개의 정수중 가장 큰 수를 출력하세요.
//		Conditional.conditionalSix(sc);
		// 7. 사용자가 입력한 문자열이 "Yes"인 경우 "예"를 출력하고, "No"인 경우 "아니오"를 출력하고, 그 외의 경우에는 "잘못 입력하셨습니다."를 출력하세요.
//		Conditional.conditionalSeven(sc);
		// 8. 사용자가 입력한 두 정수를 비교하여 같으면 "두 수가 같습니다." 첫 번째 수가 더 크면 "첫 번째 수가 더 큽니다.
		// " 두 번째 수가 더 크면 "두 번째 수가 더 큽니다."를 출력하세요.
//		Conditional.conditionalEigth(sc);
		// 9. 사용자가 입력한 세 정수가 모두 짝수인 경우 "모두 짝수입니다." 모두 홀수인 경우 "모두 홀수입니다." 
		// 그 외의 경우 "짝수 : xxx개, 홀수 : xxx개 입니다."를 출력하세요.
//		Conditional.conditionalNine(sc);
		
		// 1. 1부터 10까지의 정수의 합을 출력하세요.
//		Loop.loopOne();
		// 2. 2의 거듭제곱을 10회동안 반복하며 출력하세요.(2 * 2 = 4, 2 * 2 * 2 = 8 .....) 10회 반복 출력
//		Loop.loopTwo();
		// 3. 사용자가 입력한 정수까지의 모든 소수를 출력하세요.
//		Loop.loopThree(sc);
		// 4. 사용자가 입력한 정수의 약수를  출력하세요.
//		Loop.loopFour(sc);
		// 5. 사용자가 입력한 10개의 정수를 역순으로 출력하세요.(배열 사용)
//		Loop.loopFive(sc);
		// 6. 사용자가 입력한 문자열을 역순으로 출력하세요.
//		Loop.loopSix(sc);
		// 7. 사용자가 입력한 두 정수의 최소공배수와 최대공약수를 출력하세요.
//		Loop.loopSeven(sc);
		/*
		 * 8. 중첩 for문으로 이용해서 다음과 같이 출력하세요.

			8-1.*
			    **
			    ***
			    ****
			    *****
		*/
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		/*
			8-2. *****
			     ****
			     ***
			     **
			     *
		 */
//		System.out.println();
//		for(int k = 0; k < 5; k++) {
//			for(int m = 5; m > k; m--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		// 9. 사용자가 q를 입력하기 전까지 계속 반복하면서 입력한 정수의 값을 더해서 출력하세요.
//		Loop.loopNine(sc);
		sc.close();
	}
	
	
}
