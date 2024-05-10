package homework01.advance;

import java.util.Scanner;

public class advanceTest01 {

	public static void main(String[] args) {
		// 1. . 사용자가 입력한 금액을 오만원권, 만원권, 오천원권, 천원권, 500원동전, 100원동전, 50원동전, 10원동전, 1원동전 각 몇개로 변환되는지 출력하세요.
		//   출력 개수는 단위가 큰 것 순서로 계산합니다
		//   예를 들어 78670원이면 <오만원 1매, 만원 2매, 오천원 1매, 천원 3매, 500원 1개, 100원 1개, 50원 1개, 10원 2개> 입니다.
		// TODO Auto-generated method stub
		int[] moneyUnit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		int[] answerUnit = {0, 0, 0, 0, 0, 0, 0, 0 , 0};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("금액을 입력해 주세요.");
		int calculateBill = sc.nextInt();
		int minusBill = calculateBill;
		for(int i = 0; i < moneyUnit.length; i++) {
			answerUnit[i] = minusBill / moneyUnit[i];
			minusBill = minusBill - (moneyUnit[i] * answerUnit[i]);
		}
		
		for(int i = 0; i < answerUnit.length; i++) {
			if(moneyUnit[i] > 1000) {
				System.out.println(moneyUnit[i] + "원 : " + answerUnit[i] + "매");
			} else {
				System.out.println(moneyUnit[i] + "원 : " + answerUnit[i] + "개");
			}
		}
		sc.close();
	}

}
