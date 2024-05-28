package homework.homework12.txt1;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
//		1. 사용자가 입력한 두 정수읜 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
//		  (메소드로 따로 만들지 말고 메인메소드에서 구현)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수1을 입력해주세요.");
		int userNum1 = sc.nextInt();
		sc.nextLine();
		System.out.println("정수2를 입력해주세요.(0제외)");
		int userNum2 = sc.nextInt();
		sc.nextLine();
		
		if(userNum2 == 0) {
			System.out.println("정수2는 0 이외의 값을 입력해야합니다.");
			System.exit(0);
		}
		
		System.out.printf("%d + %d = %d%n", userNum1, userNum2, userNum1 + userNum2);
		System.out.printf("%d - %d = %d%n", userNum1, userNum2, userNum1 - userNum2);
		System.out.printf("%d * %d = %d%n", userNum1, userNum2, userNum1 * userNum2);
		System.out.printf("%d / %d = %f%n", userNum1, userNum2, userNum1 / (double)userNum2);
		System.out.printf("%d %% %d = %d%n", userNum1, userNum2, userNum1 % userNum2);
		
//		2. int형 변수 20을 증감연산자를 사용해서 다음과 같은 순서로 출력되도록 구현하세요.
//		21, 22, 22, 21, 20, 20, 19, 마지막 변수의 값(증감연산자 없이) : 20
		int num = 20;
		
		System.out.println(++num); //21 21
		System.out.println(++num); //22 22
		System.out.println(num--); //22 21
		System.out.println(num--); //21 20
		System.out.println(num--); //20 19
		System.out.println(++num); //20 20
		System.out.println(--num); //19 19 뭐야 안되는데?
		

//		3. 사용자가 입력한 정수가 2와 7의 공배수면 "2와 7의 공배수"라고 출력하고
//		아니면 "2와 7의 공배수가 아님"이라고 출력하세요.
		System.out.println("정수를 입력해주세요.");
		num = sc.nextInt();
		sc.nextLine();
		
		if(num != 0 && (num % 2 == 0 || num % 7 == 0))
			System.out.println("2와 7의 공배수");
		else
			System.out.println("2와 7의 공배수가 아님");

//		4. 사용자로부터 입력받은 문자열이 "Hello"인지 아닌지 판별하는 프로그램을 작성하세요.
		System.out.println("Say hello");
		String userStr = sc.nextLine();
		
		if(userStr.equals("Hello"))
			System.out.println("Good job");
		else 
			System.out.println("I'll kill you bro");
		
//		5. 삼항연산자를 이용하여 사용자가 입력한 정수가 홀수면 "홀수" 짝수면 "짝수"라고 출력하세요.
		System.out.println("정수를 입력해주세요.");
		num = sc.nextInt();
		
		String result = (num % 2 == 0 ? "짝수" : "홀수");
		
		System.out.println(result);

//		6. 삼항연산자의 중첩을 이용하여 사용자가 입력한 정수가 100보다 크면 "100보다 큼"
//		   작으면 "100보다 작음" 같으면 "100"을 출력하세요.
		System.out.println("정수를 입력해주세요.");
		num = sc.nextInt();
		
		String result2 = (num > 100) ? "100보다 큼"
									 : num == 0 ? "100"
											    : "100보다 작음";
		
		System.out.println(result2);

//		7. 사용자가 입력한 두 실수의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
		System.out.println("실수1을 입력해주세요.");
		double userDouble1 = sc.nextDouble();
		System.out.println("실수2를 입력해주세요.");
		double userDouble2 = sc.nextDouble();
		sc.nextLine();
		
		System.out.printf("%f + %f = %f%n", userDouble1, userDouble2, userDouble1 + userDouble2);
		System.out.printf("%f - %f = %f%n", userDouble1, userDouble2, userDouble1 - userDouble2);
		System.out.printf("%f * %f = %f%n", userDouble1, userDouble2, userDouble1 * userDouble2);
		System.out.printf("%f / %f = %f%n", userDouble1, userDouble2, userDouble1 / userDouble2);
		System.out.printf("%f %% %f = %f%n", userDouble1, userDouble2, userDouble1 % userDouble2);

//		8. 사용자가 입력한 하나의 문자열과 하나의 정수로 "입력한 문자열 xxxxx이고, 입력한 숫자는 xxxxxx입니다." 라고 출력하세요.
		System.out.println("문자열을 입력하세요.");
		userStr = sc.nextLine();
		System.out.println("정수를 입력하세요.");
		num = sc.nextInt();
		
		System.out.printf("입력한 문자열 %s이고, 입력한 숫자는 %d입니다.",userStr, num);
		
		sc.close();
	}

}
