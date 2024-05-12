package homework06.basic;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		printGaBa(sc);
		
//		removeVowels(sc);

		System.out.println(roundNum(16.459));
		
		sc.close();
	}
	// 1. 사용자가 입력한 문자열에서 가, 바의 개수를 새서 출력하세요.
	//   0개면 '가, 바가 존재하지 않습니다.'라고 출력.
	public static void printGaBa(Scanner sc) {
		System.out.println("문자열을 입력해 주세요.");
		String inputString = sc.nextLine();
		int cntGa = 0;
		int cntBa = 0;
		
		for(int i = 0; i < inputString.length(); i++) {
			String temp = "" + inputString.charAt(i);
			if(temp.equals("가")) {
				cntGa++;
			} else if(temp.equals("바")) {
				cntBa++;
			}
		}
		
		if(cntGa == 0 && cntBa == 0) {
			System.out.println("가, 바가 존재하지 않습니다.");
		} else {
			System.out.println("가 : " + cntGa + "개, 바 : " + cntBa + "개 입니다.");
		}
	}
	
	// 2. 사용자가 입력한 문자열에서 알파벳의 모음을 제거하여 출력하세요.
	//   대문자 모음, 소문자 모음 모두 제거. 모음은 a, e, i, o, u
	public static void removeVowels(Scanner sc) {
		System.out.println("문자열을 입력해 주세요.");
		String inputText = sc.nextLine();
		System.out.println("입력하신 문자 : " + inputText);
		inputText = inputText.replaceAll("[AaEeIiOoUu]", "");
		
		
		System.out.println("모음이 제거 되었습니다. -> " + inputText);
	}
	
	// 3. 16.459를 소수점 둘 째 자리까지 반올림해서 출력(xx.xx), Math.round 메소드 이용
	public static double roundNum(double num) {
		return (double) Math.round(num * 100) / 100;
	}
}
