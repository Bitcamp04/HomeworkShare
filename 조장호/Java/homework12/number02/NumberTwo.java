package homework12.number02;

import java.util.HashMap;
import java.util.Map;
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
//	    Add add = new Add();
//	    System.out.println("1 + 2 = " +  add.add(1, 2));
//	    System.out.println("1 + 2 + 3 = " +  add.add(1, 2, 3));
		
		/**
		 * 상속
		 */
		// 1. 성씨, 혈액형, 키, 피부색을 속성으로 가지는 Parent 클래스를 생성하고 Parent를 상속받은 ChildA, ChildB 클래스를 만들어서
	    // ChildA에는 이름 속성을 추가하고 ChildB에는 지문 속성을 추가하세요.
//		ChildA childA = new ChildA();
//		childA.setFirstName("C");	// 부모 메소드
//		childA.setName("jh");		// 자기자신 메소드
//		childA.getFirstName();		// 부모 메소드
//		childA.getName();			// 자기자신 메소드
//		
//		ChildB childB = new ChildB();
//		childB.setBloodType("A");	// 부모 메소드
//		childB.setFingerPrint("지문");// 자기자신 메소드
//		childB.getBloodType();	 	// 부모 메소드
//		childB.getFingerPrint(); 	// 자기자신 메소드
		
		// 2. 일한 시간, 시간당 급여를 속성으로 갖는 알바라는 클래스를 만들고 일한다(일한 시간동안 일해서 일한 시간 * 시간당 급여를 받는다. 라고 출력하는)를 메소드로 만드세요.
		//   알바를 상속받는 캐셔와 쿠팡맨 클래스를 만들고 일한다 메소드를 오버라이딩하여 캐셔는 "캐셔는 일한 시간동안 계산해서 일한 시간 * 시간당 급여를 받는다."
		//   쿠팡맨은  "쿠팡맨은 일한 시간동안 배송해서 일한 시간 * 시간당 급여를 받는다."라고 출력하도록 구현하세요. 일한 시간과 시간당 급여는 생성자에서 초기화합니다.
//		Casher casher = new Casher(3, 7000);
//		casher.doWork();
//		
//		CoupangMan coupangMan = new CoupangMan(9, 9000);
//		coupangMan.doWork();
		
		// 3. 근로자를 인터페이스로 생성하고 출근하다, 퇴근하다, 일한다. 메소드를 선언합니다. 근로자를 상속받은 개발자와 공무원 클래스 만들고 상속받은 세 개의 메소드를 
	    // 본인이 원하는 대로 구현하세요.
//		Developer developer = new Developer();
//		developer.goWork();
//		developer.doWork();
//		developer.goHome();
//		
//		CountryWorker countryWorker = new CountryWorker();
//		countryWorker.goWork();
//		countryWorker.doWork();
//		countryWorker.goHome();
		// 4. 게시판 인터페이스를 구현하고 게시글 저장, 수정, 삭제, 조회 메소드를 만들고 게시판을 상속받는 자유게시판과 공지게시판 클래스를 만들어서 네 개의 메소드를 본인이
	    //원하는 대로 구현하세요.
//		FreeBoard freeBoard = new FreeBoard();
//		freeBoard.saveBoard();
//		freeBoard.modifyBoard();
//		freeBoard.searchBoard();
//		freeBoard.deleteBoard();
//		
//		NoticeBoard noticeBoard = new NoticeBoard();
//		noticeBoard.saveBoard();
//		noticeBoard.modifyBoard();
//		noticeBoard.searchBoard();
//		noticeBoard.deleteBoard();
		
		/**
		 * 컬렉션
		 */
		// 1. Map을 이용하여 영어 단어와 뜻을 저장하고 사용자가 입력한 단어의 뜻을 출력하세요.
//		UsingCollection.printKeyWord(sc);
		// 2. Map을 이용해서 음식 이름과 가격을 저장하고 사용자가 입력한 음식의 이름과 수량으로 최종 금액을 출력하세요.
//		UsingCollection.printFruitNmQuantity(sc);
		// 3. Map을 이용해서 학생의 이름과 점수를 저장하고 점수가 90점 이상인 학생의 이름을 모두 출력하세요.
//		UsingCollection.printStudentNames(sc);
		// 4. 3번에서 사용한 Map에서 점수가 가장 높은 학생의 이름과 점수를 출력하세요.
//		UsingCollection.printMaxStudent();
		// 5. List에 문자열을 저장하고 사용자가 입력한 문자열을 검색하여 해당 문자열의 인덱스를 출력하세요.
//		UsingCollection.printIndexOfValue(sc);
		// 6. List에 정수 10개를 저장하되 중복 값을 1개 이상 포함시키고 Set으로 옮겨서 모든 요소를 출력하세요.
//		UsingCollection.oneDuplicateSet();
		// 7. 현대차의 차종과 판매량을 저장하는 Map 한 개와 기아차의 차종과 판매량을 저장하는 Map 한 개를 만들어서
		// List에 둘 다 저장합니다. 회사별로 가장 판매량이 높은 차종의 Entry를 뽑아서 새로운 List에 저장하고 
	    // 출력하세요. (현대 차종은 아반떼, 소나타, 그랜저 기아 차종은, k5, k7, k9, 판매량은 마음대로 정하시면 됩니다.)
//		UsingCollection.printMaxSalesCar();
		sc.close();
	}
	
	

}
