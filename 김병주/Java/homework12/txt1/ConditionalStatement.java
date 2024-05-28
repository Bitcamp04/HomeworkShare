package homework.homework12.txt1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 사용자가 입력한 두 정수 중에서 큰 정수를 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수1을 입력해주세요.");
		int userNum1 = sc.nextInt();
		System.out.println("정수2를 입력해주세요.");
		int userNum2 = sc.nextInt();
		
		if(userNum1 > userNum2)
			System.out.println("더 큰 정수: " + userNum1);
		else
			System.out.println("더 큰 정수: " + userNum2);

//		2. 사용자가 입력한 정수가 양수면 "양수" 음수면 "음수"라고 출력하세요.
		System.out.println("정수를 입력해주세요.");
		userNum1 = sc.nextInt();
		sc.nextLine();
		
		if(userNum1 >= 0)
			System.out.println("양수");
		else
			System.out.println("음수");

//		3. 사용자가 입력한 문자열이 "Java"인 경우 "좋아하는 언어입니다."를 출력하고,
//		"Python"인 경우 "공부중인 언어입니다."를 출력하고, 그렇지 않은 경우
//		"다른 언어를 공부해보세 요."를 출력하세요.(switch~case~default 사용)
		System.out.println("프로그래밍 언어 이름을 입력하세요.");
		String userStr = sc.nextLine();
		
		switch(userStr) {
			case "Java":
				System.out.println("좋아하는 언어입니다.");
				break;
			case "Python":
				System.out.println("공부중인 언어입니다.");
				break;
			default:
				System.out.println("다른 언어를 공부해보세요.");
		}

//		4. 사용자가 입력한 숫자가 3의 배수면 "3의 배수입니다."라고 출력하고
//		3의 배수가 아니면 "3의 배수가 아닙니다."를 출력하세요.(switch~case~default 사용)
		System.out.println("정수를 입력해주세요.");
		userNum1 = sc.nextInt();
		
		if(userNum1 == 0)
			System.out.println("3의 배수가 아닙니다.");
		
		switch(userNum1 % 3) {
			case 0:
				System.out.println("3의 배수입니다.");
				break;
			default:
				System.out.println("3의 배수가 아닙니다.");
		}
		
//		5. 사용자가 입력한 숫자가 홀수인 경우 "홀수입니다."를 출력하고, 짝수인 경우 "짝수입니다."를
//		출력하는 프로그램을 작성하세요.
		System.out.println("정수를 입력해주세요.");
		userNum1 = sc.nextInt();
		
		if(userNum1 % 2 == 0)
			System.out.println("짝수입니다.");
		else
			System.out.println("홀수입니다.");
		
//		6. 사용자가 입력한 5개의 정수중 가장 큰 수를 출력하세요.
		List<Integer> intList = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("정수%d을(를) 입력해주세요.", i + 1);
			intList.add(sc.nextInt());
		}
		
		int max = intList.stream()
				   .max(Integer::compare)
				   .get();
		
		System.out.println("가장 큰 값: " + max);

//		7. 사용자가 입력한 문자열이 "Yes"인 경우 "예"를 출력하고, "No"인 경우 "아니오"를 출력하고,
//		그 외의 경우에는 "잘못 입력하셨습니다."를 출력하세요.
		System.out.println("문자열을 입력해주세요. (Yes or No)");
		sc.nextLine();
		userStr = sc.nextLine();
		
		if(userStr.equals("Yes"))
			System.out.println("예");
		else if(userStr.equals("No"))
			System.out.println("아니오");
		else
			System.out.println("잘못 입력하셨습니다.");
		
//		8. 사용자가 입력한 두 정수를 비교하여 같으면 "두 수가 같습니다."
//		첫 번째 수가 더 크면 "첫 번째 수가 더 큽니다." 두 번째 수가 더 크면 "두 번째 수가 더 큽니다."를 출력하세요.
		System.out.println("정수1을 입력해주세요.");
		userNum1 = sc.nextInt();
		System.out.println("정수2를 입력해주세요.");
		userNum2 = sc.nextInt();
		
		if(userNum1 == userNum2)
			System.out.println("두 수가 같습니다.");
		else if(userNum1 > userNum2)
			System.out.println("첫 번째 수가 더 큽니다.");
		else if(userNum1 < userNum2)
			System.out.println("두 번째 수가 더 큽니다.");
		
//		9. 사용자가 입력한 세 정수가 모두 짝수인 경우 "모두 짝수입니다." 모두 홀수인 경우 "모두 홀수입니다."
//		그 외의 경우 "짝수 : xxx개, 홀수 : xxx개 입니다."를 출력하세요.
		List<Integer> intList2 = new ArrayList<>();
		
		for(int i = 0; i < 3; i++) {
			System.out.println("정수를 입력해주세요.");
			intList2.add(sc.nextInt());
		}
		
		int odd = 0;
		int even = 0;
		
		for(int i = 0; i < 3; i++) {
			if(intList2.get(i) % 2 == 0)
				even++;
			else
				odd++;
		}
		
		if(even == 3)
			System.out.println("모두 짝수입니다.");
		else if(odd == 3)
			System.out.println("모두 홀수입니다.");
		else
			System.out.printf("짝수 : %d개, 홀수 : %d개 입니다.", even, odd);
		
		sc.close();
	}

}
