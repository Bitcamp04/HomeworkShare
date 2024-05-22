package homework12.number01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Loop {

	// 1. 1부터 10까지의 정수의 합을 출력하세요.
	public static void loopOne() {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합 : " + sum);
	}
	
	// 2. 2의 거듭제곱을 10회동안 반복하며 출력하세요.(2 * 2 = 4, 2 * 2 * 2 = 8 .....) 10회 반복 출력
	public static void loopTwo() {
		
		for(int i = 2; i <= 11; i++) {
			for(int j = 1; j <= i; j++) {
				if(j != i) {
					System.out.print("2 * ");
				} else {
					System.out.println("2 = " + (int)Math.pow(2, j));
				}
			}
		}
	}
	
	// 3. 사용자가 입력한 정수까지의 모든 소수를 출력하세요.
	public static void loopThree(Scanner sc) {
		System.out.println("정수를 입력해 주세요.");
		int num = sc.nextInt();
		sc.nextLine();
		
		int checkNum = 0;
		for(int i = 2; i <= num; i++) {
			if(i == 2) {
				System.out.print("소수 : " + 2);
			} else {
				for(int j = 2; j <= i; j++) {
					if(i != j && i % j == 0) {
						checkNum++;
					}
					
					if(checkNum > 0) {
						checkNum = 0;
						break;
					} else {
						if(checkNum == 0 && j == i) {
							System.out.print(", " + i);
							j++;
							continue;
						}
					}
					
				}
			}
		}
	}
	
	// 4. 사용자가 입력한 정수의 약수를  출력하세요.
	public static void loopFour(Scanner sc) {
		System.out.println("정수를 입력해 주세요.");
		int num = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= num; i++) {
			if(i == 1) {
				System.out.print("약수 : " + 1);
			} else {
				if(num % i == 0) {
					System.out.print(", " + i);
				} 
				
			}
		}
	}
	
	// 5. 사용자가 입력한 10개의 정수를 역순으로 출력하세요.(배열 사용)
	public static void loopFive(Scanner sc) {
		Integer[] intArr = new Integer[10];
		for(int i = 0; i < intArr.length; i++) {
			System.out.println((i + 1) + "번째 정수를 입력해 주세요.");
			intArr[i] = sc.nextInt();
		}
		
		
		System.out.println("원본 배열 : " +  Arrays.toString(intArr));
		Arrays.sort(intArr, Collections.reverseOrder());
		System.out.println("역순 배열 : " + Arrays.toString(intArr));
	}
	
	// 6. 사용자가 입력한 문자열을 역순으로 출력하세요.
	public static void loopSix(Scanner sc) {
		System.out.println("문자열을 입력해 주세요.");
		String inputStr = sc.nextLine();
		
		String returnStr = "";
		for(int i = inputStr.length() - 1; i > 0; i--) {
			returnStr += inputStr.charAt(i);
		}
		
		System.out.println("역순으로 된 문자열 : " + returnStr);
	}
	
	// 7. 사용자가 입력한 두 정수의 최소공배수와 최대공약수를 출력하세요.
	public static void loopSeven(Scanner sc) {
		System.out.println("첫 번째 정수를 입력해 주세요.");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("두 번째 정수를 입력해 주세요.");
		int num2 = sc.nextInt();
		sc.nextLine();
		
	}
}
