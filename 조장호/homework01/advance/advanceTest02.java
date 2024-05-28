package homework01.advance;

import java.util.Scanner;

public class advanceTest02 {

	public static void main(String[] args) {
		/*
		 * 2. 369게임을 작성합니다.
		   1~99까지의 정수를 입력받고
		   3,6,9중 하나가 있으면 "박수짝"을 출력하고
		   2개가 있으면 "박수짝짝"을 출력하세요
		   예를 들어 13은 "박수짝"
		   36인 경우는 "박수짝짝"을 출력하면 됩니다.
		 */
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~99 중 하나의 값을 입력해주세요.");
		int inputNum = sc.nextInt();
		
		String clap ="박수";
		int tenNum = inputNum / 10;
		int oneNum = inputNum - tenNum * 10;
		if(tenNum % 3 == 0) {
			clap += "짝";
		}
		if(oneNum % 3 == 0) {
			clap += "짝";
		}
		sc.close();
		System.out.println(clap);
		
	}

}
