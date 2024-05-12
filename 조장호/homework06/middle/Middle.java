package homework06.middle;

import java.util.Scanner;

public class Middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		printMiddle(sc);
		
		printWord();
		
		System.out.println("10년 후 받으실 금액은" + tenYearsLaterMoney() + "원입니다.");
		
		sc.close();
	}

	// 1. 사용자가 입력한 문자열을 받아서 가운데 문자를 출력하세요. 
    // 문자열의 길이가 짝수면 가운데 두 글자 출력. ex) 비둘기 -> 둘, 비트캠프 -> 트캠
	public static void printMiddle(Scanner sc) {
		System.out.println("문자열을 입력해 주세요.");
		String inputText = sc.nextLine();
		
		if(inputText.length() % 2 == 0) {
//			System.out.println("첫 번재 index : " + (inputText.length() / 2 - 1));
//			System.out.println("두 번재 index : " + inputText.length() / 2);
			System.out.println(inputText.substring(inputText.length() / 2 - 1, inputText.length() / 2 + 1));
		} else {
			System.out.println(inputText.charAt(inputText.length() / 2));
		}
	}
	
	// 2. 1. 길이가 12인 char 배열을 선언하고 {'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l', 't'}로 초기화합니다.
	// 단어를 bit, com, sql, int로 만들어서 모두 출력하세요.
	public static void printWord() {
		char[] initChr = new char[] {'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l', 't'};
//		String bitWord = "" + initChr[0] + initChr[4] + initChr[8];
//		String comWord = "" + initChr[1] + initChr[5] + initChr[9];
//		String sqlWord = "" + initChr[2] + initChr[6] + initChr[10];
//		String intWord = "" + initChr[3] + initChr[7] + initChr[11];
//		
//		System.out.println(bitWord);
//		System.out.println(comWord);
//		System.out.println(sqlWord);
//		System.out.println(intWord);
		
		for(int i = 0; i < initChr.length / 3; i++) {
			System.out.println("" + initChr[i] + initChr[i + 4] + initChr[i + 8]);
		}
		
		String bit = "bit";
		String com = "com";
		String sql = "sql";
		String intStr = "int";
		
		char[] charArr2 = new char[12];
		
		for(int j = 0; j < charArr2.length / 4; j++) {
			charArr2[4 * j] = bit.charAt(j);
			charArr2[4 * j + 1] = com.charAt(j);
			charArr2[4 * j + 2] = sql.charAt(j);
			charArr2[4 * j + 3] = intStr.charAt(j);
			
		}
		
		for(char chr2 : charArr2) {
			System.out.println(chr2);
		}
		
	}
	
	
	// 3. 처음에 은행에 맡긴 돈은 10000원입니다
	// 금리는 연 10%입니다
	// 복리이자로 계산했을 때 10년후 얼마가 될까요?
	public static int tenYearsLaterMoney() {
		int calculateMoney = 10000;
		int interestRate = 10;
		int year = 10;
		
//		System.out.println("pow 계산 : " + Math.pow((1 + (double)interestRate / 100), 10));
		
		int returnMoney = (int) (calculateMoney * Math.pow((1 + (double)interestRate / 100), year));
		return returnMoney;
	}
}
