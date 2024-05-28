package homework05.advance;

public class PrintStudentRak {
	// 학과별 배열을 만들어주는 메소드
	public void makMajorArr(Student[] stArr, int index) {
//		System.out.println("stArr 크기 : " + stArr.length);
//		System.out.println("index : " + index);
		int mathMajorCnt = 0;
		int engMajorCnt = 0;
		int comMajorCnt = 0;
		
		for(int i = 0; i < index; i++) {
//			System.out.println("Student 배열 클래스명 : " + stArr[i].getClass().getName());
//			System.out.println("수학과 클래스명 : " + MathStudent.class.getName());
//			System.out.println("영문과 클래스명 : " + EngStudent.class.getName());
//			System.out.println("컴공과 클래스명 : " + ComStudent.class.getName());
			
			if(stArr[i].getClass().getName().equals(MathStudent.class.getName())) {
				mathMajorCnt++;
			} else if(stArr[i].getClass().getName().equals(EngStudent.class.getName())) {
				engMajorCnt++;
			} else if(stArr[i].getClass().getName().equals(ComStudent.class.getName())) {
				comMajorCnt++;
			}
		}
		
		// 학과별로 새로운 배열 생성
		MathStudent[] mathStudentArr = new MathStudent[mathMajorCnt];
		EngStudent[] engStudentArr = new EngStudent[engMajorCnt];
		ComStudent[] comStudentArr = new ComStudent[comMajorCnt];
		
//System.out.println("수학과 학생 수 : " + mathMajorCnt);
//System.out.println("영문과 학생 수 : " + engMajorCnt);
//System.out.println("컴공과 학생 수 : " + comMajorCnt);

		int pushMathCnt = 0;
		int pushEngCnt = 0;
		int pushComCnt = 0;
		
		for(int j = 0; j < index; j++) {
			if(stArr[j].getClass().getName().equals(MathStudent.class.getName())) {
				if(pushMathCnt != mathStudentArr.length) {
					mathStudentArr[pushMathCnt++] = (MathStudent) stArr[j];
				}
			} else if(stArr[j].getClass().getName().equals(EngStudent.class.getName())) {
				if(pushEngCnt != engStudentArr.length) {
					engStudentArr[pushEngCnt++] = (EngStudent) stArr[j];
				}
			} else if(stArr[j].getClass().getName().equals(ComStudent.class.getName())) {
				if(pushComCnt != comStudentArr.length) {
					comStudentArr[pushComCnt++] = (ComStudent) stArr[j];
				}
			}
		}
		
		System.out.println("----------------------- Math --------------------------------");
		for(int a = 0; a < mathMajorCnt; a++) {
			mathStudentArr[a].printInfo();
		}
		System.out.println("----------------------- Eng - --------------------------------");
		for(int b = 0; b < engMajorCnt; b++) {
			engStudentArr[b].printInfo();
		}
		System.out.println("----------------------- Com - --------------------------------");
		for(int c = 0; c < pushComCnt; c++) {
			comStudentArr[c].printInfo();
		}
		
		// 성적순으로 출력
		printRankArray(mathStudentArr, engStudentArr, comStudentArr);
	}
	
	// 학과별 배열을 성적순대로 정렬하고 출력하는 메소드
	public void majorRank(Student[] stArr, String major) {
		for(int i = 0; i < stArr.length - 1; i++) {
			for(int j = i + 1; j < stArr.length; j++) {
				if(stArr[i].getAvg() > stArr[j].getAvg()) {
					Student tmpStudent = stArr[i];
					stArr[i] = stArr[j];
					stArr[j] = tmpStudent;
				}
			}
		}
		
		System.out.println("-----------" + major + " 학과 성적순 -------------");
		for(int j = 0; j < stArr.length; j++) {
			stArr[j].printInfo();
		}
	}
	
	// 학과별 배열을 모두 받아서 majorRank로 전달하는 메소드
	public void printRankArray(MathStudent[] mathStudentArr, EngStudent[] engStudentArr,
			ComStudent[] comStudentArr) {
		majorRank(mathStudentArr, "수학");
		majorRank(engStudentArr, "영어");
		majorRank(comStudentArr, "컴공");
	}
}
