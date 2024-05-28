package homework12.number02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NumberArray {
	// 1. 1부터 10까지의 정수를 배열에 저장하고 배열의 모든 요소를 출력하세요.
	public static void numberArrayOne() {
		int[] intArr = new int[10];
		for(int i = 0; i < 10; i++) {
			intArr[i] = i + 1;
		}
		
		System.out.println("1 ~ 10 배열 : " + Arrays.toString(intArr));
	}
	
	// 2. 사용자가 q를 입력하기 전까지 정수를 입력받아 배열에 저장하고 배열의 모든 요소를 출력하세요.
	public static void numberArrayTwo(Scanner sc) {
		
		List<Integer> intList = new ArrayList<Integer>();
		while(true) {
			System.out.println("숫자를 입력해 주세요. 종료 : q");
			String numStr = sc.nextLine();
			
			if(numStr.equals("q")) {
				break;
			}
			intList.add(Integer.parseInt(numStr));
			System.out.println("현재 배열 : " + intList.toString());
		}
	}
	
	// 3. 사용자가 입력한 10개의 정수를 배열에 저장하고 평균을 계산하여 출력하세요.
	public static void numberArrayThree(Scanner sc) {
		List<Integer> intList = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
			System.out.println((i + 1) + "번째 정수를 입력해 주세요.");
			intList.add(sc.nextInt());
		}
		
		double avg = intList.stream()
						 	.mapToInt(num -> num)
						 	.average()
						 	.orElseThrow();
		
		System.out.println("입력하신 10개의 정수 평균 : " + avg);
		
	}
	
	// 4. 1부터 100까지의 숫자 중에서 짝수만 배열에 저장하고 배열의 합을 계산하여 출력하세요.
	public static void numberArrayFour() {
		List<Integer> intList = new ArrayList<Integer>();
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				intList.add(i);
			} else {
				continue;
			}
		}
		
		int sum = intList.stream()
						 .mapToInt(num -> num)
						 .sum();
		System.out.println("1 ~ 100까지 짝수들의 합 : " + sum);
	}
	
	// 5. 사용자가 입력한 10개의 정수를 배열에 저장하고 최소값과 최대값을 찾아서 출력하세요.
	public static void numberArrayFive(Scanner sc) {
		List<Integer> intList = new ArrayList<Integer>();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i + "번째 정수를 입력해 주세요.");
			intList.add(sc.nextInt());
		}
		
		int min = intList.stream()
						 .mapToInt(num -> num)
						 .min()
						 .orElseThrow();
		
		int max = intList.stream()
						 .mapToInt(num -> num)
						 .max()
						 .orElseThrow();
		
		System.out.println("입력한 10개의 정수 중 최소값 : " + min + ", 최대값 : " + max);
						 
	}
	
	// 6. 사용자가 입력한 5개의 문자열을 배열에 저장하고 길이가 가장 긴 문자열과 길이가 가장 작은 문자열을 출력하세요.
	public static void numberArraySix(Scanner sc) {
		List<String> strList = new ArrayList<String>();
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(i + "번째 문자열을 입력해 주세요.");
			strList.add(sc.nextLine());
		}
		
		String longestStr = strList.get(0);
		String shortestStr = strList.get(0);
		for(int j = 1; j < strList.size(); j++) {
			if(longestStr.length() < strList.get(j).length()) {
				longestStr = strList.get(j);
			}
			
			if(shortestStr.length() > strList.get(j).length()) {
				shortestStr = strList.get(j);
			}
		}
		
		System.out.println("입력하신 문자열 중 가장 긴 문자열 : " + longestStr);
		System.out.println("입력하신 문자열 중 가장 짧은 문자열 : " + shortestStr);
	}
	
	// 7. 두 개의 정수형 배열을 만들고 1 ~ 100까지의 랜덤한 값으로 첫 번째 배열은 4개 두 번째 배열은 3개를 저장하고 두 배열을 합친 새로운 배열을 생성하세요.
	public static void numberArraySeven() {
		int[] intArr1 = new int[4];
		int[] intArr2 = new int[3];
		
		for(int i = 0; i < intArr1.length; i++) {
			intArr1[i] =  (int)(Math.random() * 100) + 1;
		}
		System.out.println("첫 번째 배열 : " + Arrays.toString(intArr1));
		for(int i = 0; i < intArr2.length; i++) {
			intArr2[i] =  (int)(Math.random() * 100) + 1;
		}
		System.out.println("두 번째 배열 : " + Arrays.toString(intArr2));
		int[] concatArr = new int[7];
		for(int j = 0; j < intArr1.length; j++) {
			concatArr[j] = intArr1[j];
		}
		
		for(int k = intArr1.length; k < intArr1.length + intArr2.length; k++) {
			concatArr[k] = intArr2[k - intArr1.length];
		}
		
		System.out.println("합친 배열 : " + Arrays.toString(concatArr));
	}
	
	// 8. 사용자가 문자열을 입력하는데 문자열 사이사이에 -을 넣어 구분자로 만들어준다. -기준으로 잘라진 문자열 배열을 생성하고 잘라진 문자열 중에
    // 가장 길이가 긴 문자열의 인덱스와 그 문자열을 출력하세요.
	public static void numberArrayEigth(Scanner sc) {
		System.out.println("문자열을 입력해주세요. -문자는 구분자로 사용됩니다.");
		String inputStr = sc.nextLine();
		
//		System.out.println("첫 하이픈 인덱스 : " + inputStr.indexOf("-") + ", 마지막 하이픈 인덱스 : " + inputStr.lastIndexOf("-"));
//		System.out.println(inputStr.indexOf("-", inputStr.indexOf("-") + 1));
		
		String[] splitedStr = inputStr.split("-");
		String longestStr = splitedStr[0];
		for(int i = 1; i < splitedStr.length; i++) {
			if(longestStr.length() < splitedStr[i].length()) {
				longestStr = splitedStr[i];
			}
		}
		
		System.out.println("가장 길이가 긴 문자열의 인덱스 : " + inputStr.indexOf(longestStr) + ", 그 문자열 : " + longestStr);
	}
}
