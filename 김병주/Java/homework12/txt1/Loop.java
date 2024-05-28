package homework.homework12.txt1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. 1부터 10까지의 정수의 합을 출력하세요.
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num++;
		}
		
		System.out.println(sum);
		System.out.println("----------------");
		
//		2. 2의 거듭제곱을 10회동안 반복하며 출력하세요.(2 * 2 = 4, 2 * 2 * 2 = 8 .....) 10회 반복 출력
		num = 2;
		int result = 2;
		int cnt = 0;
		
		while(cnt < 10) {
			System.out.println(result *= num);
			cnt++;
		}
		
		System.out.println("----------------");
		
//		3. 사용자가 입력한 정수까지의 모든 소수를 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		List<Integer> intList = new ArrayList<>();
		boolean exit = false;
		
		do {
			System.out.printf("1. 정수 입력%n2. 입력 종료 및 결과 출력%n");
			int userSelect = sc.nextInt();
			
			if(userSelect == 1) {
				System.out.println("정수를 입력해주세요.");
				intList.add(sc.nextInt());
			} else if(userSelect == 2) {
				System.out.println("입력을 종료합니다.");
				exit = true;
			} else {
				System.out.println("다시 입력해주세요.");
			}
			
		} while(!exit);
		
		boolean check = false;
		
		for(int i = 0; i < intList.size(); i++) {
			for(int j = 2; j < intList.get(i); j++) {
				if(intList.get(i) % j == 0) {
					check = false;
					break;
				}
				
				check = true;
			}
			
			if(check) {
				System.out.print(intList.get(i) + " ");
			}
			
		}
		
		System.out.println();
		System.out.println("----------------");
		
//		4. 사용자가 입력한 정수의 약수를  출력하세요.
		System.out.println("약수를 알고 싶은 정수를 입력해주세요.");
		int userNum = sc.nextInt();
		List<Integer> intList2 = new ArrayList<>();
		
		for(int i = 1; i < userNum / 2; i++) {
			if(userNum % i == 0)
				intList2.add(userNum / i);
		}
		
		intList2.add(1);
		
		for(int i : intList2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("----------------");
		
//		5. 사용자가 입력한 10개의 정수를 역순으로 출력하세요.(배열 사용)
		int[] intArr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			System.out.println("정수를 입력하세요.");
			intArr[i] = sc.nextInt();
		}
		
		for(int i = intArr.length - 1; i >= 0; i--) {
			System.out.print(intArr[i] + " ");
		}
		
		System.out.println();
		System.out.println("----------------");
		
//		6. 사용자가 입력한 문자열을 역순으로 출력하세요.
		sc.nextLine();
		System.out.println("문자열을 입력해주세요.");
		String userStr = sc.nextLine();
		
		char[] chArr = userStr.toCharArray();
		String resultStr = "";
		
		for(int i = chArr.length - 1; i >= 0; i--) {
			resultStr += chArr[i];
		}
		
		System.out.println(resultStr);
		System.out.println("----------------");
		
//		7. 사용자가 입력한 두 정수의 최소공배수와 최대공약수를 출력하세요.
		System.out.println("정수1을 입력해주세요.");
		int userNum1 = sc.nextInt();
		System.out.println("정수2를 입력해주세요.");
		int userNum2 = sc.nextInt();
		
		int gcd = 0;
		int lcm = 0;
		
		for(int i = 0; i <= (userNum1 > userNum2 ? userNum1 : userNum2); i++) {
			if(userNum1 % i == 0 && userNum2 % i == 0)
				gcd = i;
		}
		
		for(int i = (userNum1 > userNum2 ? userNum1 : userNum2); i < userNum1 * userNum2; i++) {
			if(i % userNum1 == 0 && i % userNum2 == 0)
				lcm = i;
		}
		
		System.out.printf("최소공배수: %d%n최대공약수: %d%n", gcd, lcm);
		System.out.println("----------------");
		
//		8. 중첩 for문으로 이용해서 다음과 같이 출력하세요.
		
//		8-1. *
//		     **
//		     ***
//		     ****
//		     *****
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i >= j) 
					System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------");
		
//		8-2. *****
//		      ****
//		       ***
//		        **
//		         *
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i <= j) 
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("----------------");
//		9. 사용자가 q를 입력하기 전까지 계속 반복하면서 입력한 정수의 값을 더해서 출력하세요.
		List<Integer> intList10 = new ArrayList<>();
		boolean exit2 = false;
		
		do {
			System.out.printf("정수를 입력해주세요.(q 입력시 종료 및 결과 출력)%n");
			String userSelect = sc.nextLine();
			
			if(userSelect.equals("q")) {
				System.out.println("입력을 종료합니다.");
				exit2 = true;
			} else {
				intList10.add(Integer.parseInt(userSelect));
			}
			
		} while(!exit2);
		
		sum = 0;
		
		for(int i = 0; i < intList10.size(); i++) {
			sum += intList10.get(i);
		}
		
		System.out.println(sum);
		sc.close();
	}

}
