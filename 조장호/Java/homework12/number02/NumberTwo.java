package homework12.number02;

import java.util.Scanner;

public class NumberTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/**
		 *  배열
		 */
		// 1. 1부터 10까지의 정수를 배열에 저장하고 배열의 모든 요소를 출력하세요.
//		NumberArray.numberArrayOne();
		// 2. 사용자가 q를 입력하기 전까지 정수를 입력받아 배열에 저장하고 배열의 모든 요소를 출력하세요.
//		NumberArray.numberArrayTwo(sc);
		// 3. 사용자가 입력한 10개의 정수를 배열에 저장하고 평균을 계산하여 출력하세요.
//		NumberArray.numberArrayThree(sc);
		// 4. 1부터 100까지의 숫자 중에서 짝수만 배열에 저장하고 배열의 합을 계산하여 출력하세요.
//		NumberArray.numberArrayFour();
		// 5. 사용자가 입력한 10개의 정수를 배열에 저장하고 최소값과 최대값을 찾아서 출력하세요.
//		NumberArray.numberArrayFive(sc);
		// 6. 사용자가 입력한 5개의 문자열을 배열에 저장하고 길이가 가장 긴 문자열과 길이가 가장 작은 문자열을 출력하세요.
//		NumberArray.numberArraySix(sc);
		// 7. 두 개의 정수형 배열을 만들고 1 ~ 100까지의 랜덤한 값으로 첫 번째 배열은 4개 두 번째 배열은 3개를 저장하고 두 배열을 합친 새로운 배열을 생성하세요.
//		NumberArray.numberArraySeven();
		// 8. 사용자가 문자열을 입력하는데 문자열 사이사이에 -을 넣어 구분자로 만들어준다. -기준으로 잘라진 문자열 배열을 생성하고 잘라진 문자열 중에
	    // 가장 길이가 긴 문자열의 인덱스와 그 문자열을 출력하세요.
//		NumberArray.numberArrayEigth(sc);
		
		/**
		 *  클래스
		 */
		// 1. 학생의 이름, 학번, 학과를 속성으로 가지고 학생의 정보를 저장하는 메소드와 학생의 정보를 출력하는 메소드를 갖는 학생 클래스를 생성하세요.
//		Student st1 = new Student("홍길동", 1, "컴퓨터공학");
//		st1.studentInfo();
		
		// 2. 도서의 제목, 저자, 출판사, 가격을 속성으로 가지고 정보를 저장하는 메소드와 정보를 출력하는 메소드를 갖는 도서 클래스를 생성하세요.
//		Book book = new Book("오라클 PL/SQL 입문", "안성민", "JPUB", 27000);
//		book.bookInfo();
		
		// 3. 두 문자열을 전달받아 합쳐진 새로운 문자열을 리턴하는 메소드를 구현하세요.
//		System.out.println("첫 번째 문자열을 입력하세요.");
//		String inputStr1 = sc.nextLine();
//		System.out.println("두 번째 문자열을 입력하세요.");
//		String inputStr2 = sc.nextLine();
//		System.out.println(MethodClass.concatStr(inputStr1, inputStr2));
		// 4. 정수 한 개와 실수 한 개를 전달받아 소수점 두자리까지만 가지는 곱의 결과를 리턴하는 메소드를 구현하세요.
//		System.out.println(MethodClass.roundTwoNumber(2, 2.437));
		// 5. 반지름을 속성으로 갖는 원클래스를 만들고 사용자가 입력한 반지름이 생성자를 통해 속성에 저장되며 원의 넓이와 둘레를 구해서 리턴하는 메소드를 각각 구현하세요.
//		Circle c = new Circle(3);
//		c.returnRound();
//		c.returnArea();
		// 6. 잔액을 속성으로 가지고 입금, 출금, 잔액 조회를 메소드로 갖는 계좌 클래스를 생성하세요.
//		Account account = new Account();
//		account.depositMoney(100000);
//		account.withdrawMoney(120000);
//		account.withdrawMoney(60000);
//		account.printBalance();
		// 7. Add라는 클래스를 만들고 정수형 매개변수 2개를 받아서 합을 리턴하는 add 메소드를 구현하세요. 
		// 그리고 오버로딩을 통해 정수형 매개변수 세개를 받아서 각각의 제곱의 합을 리턴하는 add메소드도 구현하세요. 
	    Add add = new Add();
	    System.out.println("1 + 2 = " +  add.add(1, 2));
	    System.out.println("1 + 2 + 3 = " +  add.add(1, 2, 3));
		
		sc.close();
	}
	
	

}
