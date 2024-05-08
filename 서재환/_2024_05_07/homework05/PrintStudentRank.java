package homework._2024_05_07.homework05;

import java.util.*;

public class PrintStudentRank{
	Comparator<Student> comparator=new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {
			if(o1.getAvg() > o2.getAvg()) {
				return -1;
			}
			else if(o1.getAvg() < o2.getAvg()) {
				return 1;
			}
			else {
				return 0;
			}
		}
	};
	// 학과별 배열을 만들어주는 메소드
	public void makMajorArr(Student[] stArr, int index) {
		// 학과별로 새로운 배열 생성
		ArrayList<Student> math = new ArrayList<>();
		ArrayList<Student> eng = new ArrayList<>();
		ArrayList<Student> com = new ArrayList<>();

        for (Student student : stArr) {
            if (student instanceof MathStudent) {
                math.add(student);
            } else if (student instanceof EngStudent) {
                eng.add(student);
            } else if (student instanceof ComStudent) {
                com.add(student);
            } else {
                System.out.println("학생 정보에 전공 입력 문제가 존재합니다.");
            }
        }
		// 성적순으로 출력
		printRankArray((MathStudent[]) math.toArray(), (EngStudent[]) eng.toArray(), (ComStudent[]) com.toArray());
	}
	
	// 학과별 배열을 성적순대로 정렬하고 출력하는 메소드
	public void majorRank(Student[] stArr, String major) {
		List<Student> students = new ArrayList<>(Arrays.stream(stArr).toList());
		students.sort(comparator);
		System.out.println("major: "+major);
		System.out.println("==================================================");
		for(Student student : students) {
			student.printInfo();
		}
	}
	
	// 학과별 배열을 모두 받아서 majorRank로 전달하는 메소드
	public void printRankArray(MathStudent[] mathStudentArr,EngStudent[] engStudentArr,
							   ComStudent[] comStudentArr) {
		majorRank(mathStudentArr, "수학");
		majorRank(engStudentArr, "영어");
		majorRank(comStudentArr, "컴공");
	}


}
