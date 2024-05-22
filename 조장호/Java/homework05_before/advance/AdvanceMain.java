package homework05.advance;

public class AdvanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MathStudent mathStudent = new MathStudent(0, "김수학");
		mathStudent.saveInfo(0, "수학", 100);
		mathStudent.saveInfo(1, "영어", 70);
		mathStudent.saveInfo(2, "컴퓨터", 50);
		mathStudent.printInfo();
		System.out.println("과목 평균점수 : " + mathStudent.getAvg());
		
		
		EngStudent engStudent = new EngStudent(1, "이영어");
		engStudent.saveInfo(0, "수학", 50);
		engStudent.saveInfo(1, "영어", 100);
		engStudent.saveInfo(2, "컴퓨터", 70);
		engStudent.printInfo();
		System.out.println("과목 평균점수 : " + engStudent.getAvg());
		
		ComStudent comStudent = new ComStudent(2, "최자바");
		comStudent.saveInfo(0, "수학", 50);
		comStudent.saveInfo(1, "영어", 70);
		comStudent.saveInfo(2, "컴퓨터", 100);
		comStudent.printInfo();
		System.out.println("과목 평균점수 : " + comStudent.getAvg());
	}

}
