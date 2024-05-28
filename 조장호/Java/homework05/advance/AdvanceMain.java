package homework05.advance;

import java.util.Scanner;

public class AdvanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainPage mainPage = new MainPage();
		
		Scanner sc = new Scanner(System.in);
		
		Student[] stArr = new Student[1000];
		
		while(true) {
			mainPage.printMenu(sc, stArr);
		}
		
//		System.out.println("수학과 클래스명 : " + MathStudent.class.getName());
//		System.out.println("영문과 클래스명 : " + EngStudent.class.getName());
//		System.out.println("컴공과 클래스명 : " + ComStudent.class.getName());
	}

}
