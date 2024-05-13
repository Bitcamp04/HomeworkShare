package chap99_homework05.advance;

import java.util.Scanner;

public class MainPage {
	public int index = 0;
	
	//메인 메뉴 출력하는 메소드
	public void printMenu(Scanner sc, Student[] stArr) {
		System.out.println("----학적관리----");
		System.out.println("1. 학생정보 입력");
		System.out.println("2. 학생정보 검색");
		System.out.println("3. 전체 학생 정보 출력");
		System.out.println("4. 종료");
		
//		selectMenu(sc,stArr);
	}
	
	// 메뉴 선택 메소드
	public void selctMenu(Scanner sc, Student[] stArr) {
		InputStudentInfo inputStudentInfo = new InputStudentInfo();
//		printStudentInfo printStudentInfr = new PrintStudentInfo();
//		
//		while(true) {
//			System.out.print("메뉴를 선택하세요.");
//			int menuSelct = sc.nextInt(index, sc, stArr);
//			index++;
//			break+
//			
//			if(menuSelct == 1) {
//			} else if (menySelct == 2) {
//				System.out.println("검색할 학생의 학번: ");
//				int sno = sc.nextlnt();
//				break;
//				
//			} else if (menySelct == 3) {
//				printStudentInfo.printAllStudentInfo
//				
//			} else if (menySelct == 4) {
				System.out.println("프로그램을 종료합;다.");
				
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			
			}
		}
		
	}

}
