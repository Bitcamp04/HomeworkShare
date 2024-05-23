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
		
		for(int i = 1; i < 5; i++) {
			System.out.println(i + "번째 문자열을 입력해 주세요.");
			
		}
	}
}
