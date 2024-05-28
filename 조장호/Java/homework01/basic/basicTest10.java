package homework01.basic;

import java.util.Scanner;

public class basicTest10 {

	/*
	 * 10. int배열을 10개 생성해서
		  사용자로부터 10개의 값을 입력받고
		  순서대로 출력하고 총합을 구하세요.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArr = new int[10];
		int arrSum = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < inputArr.length; i++) {
			System.out.println("숫자를 입력하세요.");
			inputArr[i] = sc.nextInt();
			arrSum += inputArr[i]; 
		}
		sc.close();
		for(int j = 0; j < inputArr.length; j++) {
			System.out.println("inputArr[" + j + "] : " + inputArr[j]);
		}
		System.out.println("inputArr 총합 : " + arrSum);
	}

}
