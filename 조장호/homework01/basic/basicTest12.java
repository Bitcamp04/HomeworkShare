package homework01.basic;

import java.util.Scanner;

public class basicTest12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < numArr.length; i++) {
			System.out.println((i + 1) + "번째 정수를 입력하세요.");
			numArr[i] = sc.nextInt();
		}
		
		for(int j = 0; j < numArr.length; j++) {
			if(numArr[j] % 2 == 0 || numArr[j] % 3 == 0) {
				System.out.println(numArr[j]);
			}
		}
		sc.close();
	}

}
