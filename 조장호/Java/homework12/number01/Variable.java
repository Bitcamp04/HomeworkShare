package homework12.number01;

import java.util.Scanner;

public class Variable {
	// 3. 원주율 상수
	public static final double PI = 3.14;
	
	// 1. 사용자가 입력한 이름, 나이, 성별을 출력하세요.
	public static void VariableNumberOne(Scanner sc) {
		System.out.println("이름을 입력해 주세요.");
		String inputName = sc.nextLine();
		
		System.out.println("나이를 입력해 주세요.");
		int inputAge = sc.nextInt();
		sc.nextLine();
		
		System.out.println("성별을 입력해 주세요.");
		String inputGender = sc.nextLine();
		
		System.out.println("입력하신 이름은 : " + inputName + ", 나이는 : " + inputAge + ", 성별은 : " + inputGender + "입니다.");
	}

	// 2. 사용자가 입력한 두 개의 정수와 문자(char) 연산자를 받아 
	// 두 정수로 해당 연산을 진행한 결과를 출력하세요.
	public static void VariableNumberTwo(Scanner sc) {
		System.out.println("첫 번째 숫자를 입력해 주세요.");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("두 번째 숫자를 입력해 주세요.");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("연산자 문자를 입력해 주세요.");
		char operator = sc.nextLine().charAt(0);
		
		if(operator == '+') {
			System.out.println("+의 결과 : " + (num1 + num2));
		} else if(operator == '-') {
			System.out.println("-의 결과 : " + (num1 - num2));
		} else if(operator == '*') {
			System.out.println("*의 결과 : " + (num1 * num2));
		} else if(operator == '/') {
			System.out.println("/의 결과 : " + (num1 / num2));
		} else if(operator == '%') {
			System.out.println("%의 결과 : " + (num1 % num2));
		} else {
			System.out.println("입력하신 " + operator + "는 이용할 수 없습니다.");
		}
	}
	
	// 3. 반지름이 20인 원의 넓이와 둘레를 출력하세요.(넓이 : 2 * 3.14 * 반지름 ^ 2, 둘레 : 4 * 3.14 * 반지름)
    // 단, 원주율 3.14는 상수로 선언하세요.
	public static void VariableNumberThree() {
		System.out.println("반지름이 20인 원의 넓이 : " + PI * 20 * 20);
		System.out.println("반지름이 20인 원의 둘레 : " + 2 *PI * 20);
	}
	
	// 4. 사용자가 입력한 5개의 정수의 합계와 평균을 출력하세요.
	public static void VariableNumberFour(Scanner sc) {
		int[] intArr = new int[5];
		
		for(int i = 0; i < intArr.length; i++) {
			System.out.println((i + 1) + "번째 정수를 입력해 주세요.");
			intArr[i] = sc.nextInt();
		}
		
		int sum = 0;
		double avg = 0.0;
		
		for(int j = 0; j < intArr.length; j++) {
			sum += intArr[j];
		}
		
		avg = (double) sum / intArr.length;
		System.out.println("입력하신 5개의 정수 합계 : " + sum + ", 평균 : " + avg + " 입니다.");
	}
	
	// 5. 사용자가 입력한 세 정수의 최소 값, 중간 값, 최대 값을 출력하세요.
	public static void VariableNumberFive(Scanner sc) {
		int[] inputArr = new int[3];
		for(int i = 0; i < inputArr.length; i++) {
			System.out.println((i + 1) + "번째 정수를 입력해 주세요.");
			inputArr[i] = sc.nextInt();
			sc.nextLine();
		}
		
		int minNum = 0;
		int midNum = 0;
		int maxNum = 0;
		
		if(inputArr[0] > inputArr[1]) {
			// 0 >= 1 >= 2
			if(inputArr[1] > inputArr[2]) {
				maxNum = inputArr[0];
				midNum = inputArr[1];
				minNum = inputArr[2];
			} else {
				// 0 >= 2 >= 1
				if(inputArr[0] > inputArr[2]) {
					maxNum = inputArr[0];
					midNum = inputArr[2];
					minNum = inputArr[1];
				// 2 >= 0 >= 1
				} else {
					maxNum = inputArr[2];
					midNum = inputArr[0];
					minNum = inputArr[1];
				}
			}
		} else {
			// 1 >= 0 >= 2
			if(inputArr[0] > inputArr[2]) {
				maxNum = inputArr[1];
				midNum = inputArr[0];
				minNum = inputArr[2];
			} else {
				// 1 >= 2 >= 0
				if(inputArr[1] > inputArr[2]) {
					maxNum = inputArr[1];
					midNum = inputArr[2];
					minNum = inputArr[0];
				// 2 >= 1 >= 0
				} else {
					maxNum = inputArr[2];
					midNum = inputArr[1];
					minNum = inputArr[0];
				}
			}
		}
		
		System.out.println("입력한 세 정수의 최소값 : " + minNum + ", 중간값 : " + midNum + ", 최대값 : " + maxNum + " 입니다.");
	}
	
	// 6.사용자가 입력한 정수의 구구단을 출력하세요.(출력 양식 => 2를 입력했을 때 2 * 1 = 2
	//	  	2 * 2 = 4
	//	  	.....
	//	  	2 * 9 = 18 
	public static void VariableNumberSix(Scanner sc) {
		System.out.println("정수를 입력해 주세요.");
		int gugu = sc.nextInt();
		for(int i = 1; i <= 9; i++) {
			System.out.println(gugu + " * " + i + " = " + gugu * i);
		}
		
		System.out.println("구구단 2단 출력 완료했습니다.");
	}
	
	// 7. 사용자가 입력한 정수로 해당 정수의 팩토리얼을 계산하여 출력하세요.(재귀메소드 없이, while이나 for 반복문을 사용)
	public static void VariableNumberSeven(Scanner sc) {
		System.out.println("팩토리얼 값을 나타낼 정수를 입력하세요.");
		int factNum = sc.nextInt();
		
		boolean stopflag = true;
		long result = 1L;
		while(stopflag) {
			result *= factNum;
			factNum--;
			
			if(factNum == 0) {
				stopflag = false;
			}
		}
		
		System.out.println("입력한 정수의 팩토리얼 값은 : " + result + "입니다.");
	}
	
	// 8. 사용자가 입력한 10개의 정수 중 소수의 개수를 출력하세요.(소수는 1이랑 본인 말고는 나눠떨어지는 값이 없는 수입니다.)
	// 사용자가 입력할 수 있는 값은 2 ~ 30로 제한
	public static void VariableNumberEight(Scanner sc) {
		int[] findNum = new int[10];
		
		for(int i = 0; i < findNum.length; i++) {
			System.out.println((i + 1) + "번째 정수를 입력해 주세요.");
			findNum[i] = sc.nextInt();
		}
		
		int numCnt = 0;
		
		int checkNum = 0;
		for(int j = 0; j < findNum.length; j++) {
			if(findNum[j] == 2) {
				System.out.println("소수 판별 숫자 : " + findNum[j]);
				numCnt++;
			} else {
				for(int k = 2; k < findNum[j]; k++) {
					if(findNum[j] % k == 0) {
						checkNum++;
					}
					// k가 2부터 1씩 증가해 findNum가 k로 나눴을때 나머지가 0이 되면 그 다음 findNum을 가져오기 위해 break
					if(checkNum > 0) {
//						System.out.println("k : " + k + "findNum[ " + j + "] = " + findNum[j]);
						checkNum = 0;
						break;
					} else {
						if(checkNum == 0 && k == findNum[j] - 1) {
							System.out.println("소수 판별 숫자 : " + findNum[j]);
							numCnt++;
						}
					}
				}
				
			}
		}
		
		System.out.println("입력하신 10개의 정수 중 소수의 개수는 : " + numCnt + "개 입니다.");
	}
}
