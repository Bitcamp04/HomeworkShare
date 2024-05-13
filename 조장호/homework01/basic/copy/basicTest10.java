package homework01.basic.copy;

import java.util.Scanner;

public class basicTest10 {

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
