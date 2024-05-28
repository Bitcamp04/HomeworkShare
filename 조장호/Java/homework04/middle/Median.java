package homework04.middle;

import java.util.Scanner;
//3개의 정숫값을 입력하고 중앙값을 구한 다음 출력합니다.

class Median {
	static int med3(int a, int b, int c) {
		//여기를 완성하세요.
		int returnNum = 0;
		if(a >= b) {
			returnNum = a;
			if(b >= c) {
				returnNum = b;
			} else {
				if(a >= c) {
					returnNum = c;
				} else {
					returnNum = a;
				}
			}
		} else {
			// a < b
			returnNum = b;
			if(c <= a) {
				returnNum = a;
			} else {
				if(c >= b) {
					returnNum = b;
				} else {
					returnNum = c;
				}
				
			}
		}
		return returnNum;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("세 정수의 중앙값을구합니다.");
		System.out.print("a의 값：");	
		int a = stdIn.nextInt();
		System.out.print("b의 값：");	
		int b = stdIn.nextInt();
		System.out.print("c의 값：");	
		int c = stdIn.nextInt();

		System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
		stdIn.close();
	}
}
