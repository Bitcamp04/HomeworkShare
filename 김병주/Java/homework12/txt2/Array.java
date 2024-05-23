package homework.homework12.txt2;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
//		1. 1부터 10까지의 정수를 배열에 저장하고 배열의 모든 요소를 출력하세요.
		int[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i : intArr) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("-----------------------------------");
		
//		2. 사용자가 q를 입력하기 전까지 정수를 입력받아 배열에 저장하고 배열의 모든 요소를 출력하세요.
		int[] intArr2 = new int[100];
		boolean exit = false;
		int cnt = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("정수를 입력하세요.(q 누르면 입력 종료)");
			String userStr = sc.nextLine();
			
			if(userStr.equals("q")) {
				exit = true;
				System.out.println("입력을 종료합니다.");
			} else {
				intArr2[cnt++] = Integer.parseInt(userStr);
			}
			
		} while(!exit);
		
		for(int i = 0; i < cnt; i++) {
			System.out.print(intArr2[i] + " ");
		}
		
		System.out.println();
		System.out.println("-----------------------------------");
		
//		3. 사용자가 입력한 10개의 정수를 배열에 저장하고 평균을 계산하여 출력하세요.
		int[] intArr3 = new int[10];
		int sum = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("정수를 입력해주세요.");
			intArr3[i] = sc.nextInt();
			sum += intArr3[i];
		}
		
		System.out.println("평균값: " + sum / (double)intArr3.length);
		System.out.println("-----------------------------------");
		
//		4. 1부터 100까지의 숫자 중에서 짝수만 배열에 저장하고 배열의 합을 계산하여 출력하세요.
		int[] intArr4 = new int[100];
		int[] evenArr = new int[100];
		
		for(int i = 0; i < 100; i++) {
			intArr4[i] = i + 1;
		}
		
		int index = 0;
		sum = 0;
		
		for(int j = 0; j < 100; j++) {
			if(intArr4[j] % 2 == 0) {
				evenArr[index] = intArr4[j];
				sum += evenArr[index];
				index++;
			}
		}
		
		System.out.println(sum);
		System.out.println("-----------------------------------");

//		5. 사용자가 입력한 10개의 정수를 배열에 저장하고 최소값과 최대값을 찾아서 출력하세요.
		int[] intArr5 = new int[10];
		
		for(int i = 0; i < 10; i++) {
			System.out.println("정수를 입력하세요.");
			intArr5[i] = sc.nextInt();
		}
		
		int bg = intArr5[0];
		int sm = intArr5[0];
		
		for(int i = 1; i < intArr5.length; i++) {
			if(intArr5[i] > bg) {
				bg = intArr5[i];
			}
			
			if(intArr5[i] < sm) {
				sm = intArr5[i];
			}
		}
		
		sc.nextLine();
		System.out.printf("최소값: %d, 최대값: %d%n", sm, bg);
		System.out.println("-----------------------------------");

//		6. 사용자가 입력한 5개의 문자열을 배열에 저장하고 길이가 가장 긴 문자열과 길이가 가장 작은 문자열을 출력하세요.
		String[] strArr6 = new String[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.println("문자열을 입력하세요.");
			strArr6[i] = sc.nextLine();
		}
		
		String longStr = strArr6[0];
		String shortStr = strArr6[0];
		
		for(int i = 1; i < 5; i++) {
			if(longStr.length() < strArr6[i].length())
				longStr = strArr6[i];
			if(shortStr.length() > strArr6[i].length())
				shortStr = strArr6[i];
		}
		
		System.out.printf("길이가 가장 긴 문자열: %s%n길이가 가장 짧은 문자열: %s%n", longStr, shortStr);
		System.out.println("-----------------------------------");
		
//		7. 두 개의 정수형 배열을 만들고 1 ~ 100까지의 랜덤한 값으로
//		첫 번째 배열은 4개 두 번째 배열은 3개를 저장하고 두 배열을 합친 새로운 배열을 생성하세요.
		int[] intArr7A = new int[4];
		int[] intArr7B = new int[3];
		int[] intArr7C = new int[intArr7A.length + intArr7B.length];
		
		for(int i = 0; i < intArr7A.length; i++) {
			intArr7A[i] = (int) (Math.random() * 100 + 1);
		}
		
		for(int j = 0; j < intArr7B.length; j++) {
			intArr7B[j] = (int) (Math.random() * 100 + 1);
		}
		
		for(int k = 0; k < intArr7C.length; k++) {
			if(k < intArr7A.length)
				intArr7C[k] = intArr7A[k];
			else
				intArr7C[k] = intArr7B[k - intArr7A.length];
		}
		
		for(int x : intArr7C) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		System.out.println("-----------------------------------");

//		8. 사용자가 문자열을 입력하는데 문자열 사이사이에 -을 넣어 구분자로 만들어준다. 
//		-기준으로 잘라진 문자열 배열을 생성하고 잘라진 문자열 중에 길이가 긴 문자열의 인덱스와 그 문자열을 출력하세요.
		System.out.println("문자열 조합을 입력하세요.(Apple-Bear-바나나)");
		String userStr = sc.nextLine();
		
		String[] resultStr = userStr.split("-");
		
		index = 0;
		int longStrLength = resultStr[0].length();
		
		for(int i = 1; i < resultStr.length; i++) {
			if(longStrLength < resultStr[i].length()) {
				longStrLength = resultStr[i].length();
				index = i;
			}
		}
		
		System.out.printf("길이가 가장 긴 문자열: %s%n인덱스 번호: %d", resultStr[index], index);
		
		sc.close();
	}

}
