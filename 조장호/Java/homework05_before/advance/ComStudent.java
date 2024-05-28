package homework05.advance;

public class ComStudent extends CommonStat implements Student {

	int sno;
	String name;
	
	public ComStudent(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	@Override
	public void saveInfo(int index, String subject, int score) {
		// TODO Auto-generated method stub
		this.subject[index] = subject;
		this.finalExamScore[index] = score;
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("ComStudent 학생명 : " + this.name);
		for(int i = 0; i < this.subject.length; i++) {
			System.out.println((i + 1) + "번째 과목명 : " + this.subject[i] + ", 기말점수 : " + this.finalExamScore[i]);
		}
	}

	@Override
	public double getAvg() {
		// TODO Auto-generated method stub
		double returnAvg = 0.0;
		for(int i = 0; i < this.finalExamScore.length; i++) {
			returnAvg += this.finalExamScore[i];
		}
		return returnAvg / this.finalExamScore.length;
	}

}
