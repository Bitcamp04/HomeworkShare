package homework.homework12.txt2;

class Student {
//	1. 학생의 이름, 학번, 학과를 속성으로 가지고 학생의 정보를 저장하는 메소드와
//	학생의 정보를 출력하는 메소드를 갖는 학생 클래스를 생성하세요.
	private String name;
	private int sno;
	private String major;
	
	public Student(String name, int sno, String major) {
		this.name = name;
		this.sno = sno;
		this.major = major;
	}
	
	public void setStudentInfo(String name, int sno, String major) {
		this.name = name;
		this.sno = sno;
		this.major = major;
	}
	
	public void printStudentInfo() {
		System.out.println("이름: " + name);
		System.out.println("학번: " + sno);
		System.out.println("학과: " + major);
	}
	
}

class Book {
//	2. 도서의 제목, 저자, 출판사, 가격을 속성으로 가지고 정보를 저장하는 메소드와
//	정보를 출력하는 메소드를 갖는 도서 클래스를 생성하세요.
	private String title;
	private String writer;
	private String publisher;
	private int price;
	
	public void setBookInfo(String title, String writer, String publisher, int price) {
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
		this.price = price;
	}
	
	public void printBookInfo() {
		System.out.println("제목: " + title);
		System.out.println("저자: " + writer);
		System.out.println("출판사: " + publisher);
		System.out.println("가격: " + price);
	}
	
}

class Circle {
//	5. 반지름을 속성으로 갖는 원클래스를 만들고 사용자가 입력한 반지름이 생성자를 통해 속성에 저장되며
//	원의 넓이와 둘레를 구해서 리턴하는 메소드를 각각 구현하세요.
	private int radius;
	private final double pi = 3.14;
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius * radius * pi;
	}
	
	public double getRound() {
		return radius * 2 * pi;
	}
	
}

class Account {
//	6. 잔액을 속성으로 가지고 입금, 출금, 잔액 조회를 메소드로 갖는 계좌 클래스를 생성하세요.
	int changes;
	
	public void deposit(int money) {
		changes += money;
	}
	
	public int withdraw(int money) {
		changes -= money;
		return money;
	}
	
	public void changesInfo() {
		System.out.printf("현재 계좌에 남아있는 돈은: %d원입니다.%n", changes);
	}
	
}

class Add {
//	7. Add라는 클래스를 만들고 정수형 매개변수 2개를 받아서 합을 리턴하는 add 메소드를 구현하세요. 
//    그리고 오버로딩을 통해 정수형 매개변수 세개를 받아서 각각의 제곱의 합을 리턴하는 add메소드도 구현하세요. 
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int add(int num1, int num2, int num3) {
		return (num1 * num1) + (num2 * num2) + (num3 * num3);
	}
	
}

public class Class {
	//	3. 두 문자열을 전달받아 합쳐진 새로운 문자열을 리턴하는 메소드를 구현하세요.
	public static String newStr(String s1, String s2) {
		return s1 + s2;
	}
	
	//	4. 정수 한 개와 실수 한 개를 전달받아 소수점 두자리까지만 가지는 곱의 결과를 리턴하는 메소드를 구현하세요.
	public static double Mul(int num1, double num2) {
		return ((int)(num1 * num2 * 100)) / 100.0;
	}

}
