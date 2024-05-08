package homework01.advance;

import java.util.Scanner;

public class advanceTest02 {

	public static void main(String[] args) {
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
