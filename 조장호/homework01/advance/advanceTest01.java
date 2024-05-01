package homework01.advance;

import java.util.Scanner;

public class advanceTest01 {

	public static void main(String[] args) {
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
