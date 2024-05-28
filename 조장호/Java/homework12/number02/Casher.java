package homework12.number02;

public class Casher extends Alba {
	private int workhour;
	private int timeBySalary;
	
	public Casher(int workhour, int timeBySalary) {
		this.workhour = workhour;
		this.timeBySalary = timeBySalary;
	}

	@Override
	public void doWork() {
		System.out.println("캐셔는 " + workhour + "시간동안 일해서 " + workhour * timeBySalary + "원의 급여를 받는다.");
	}
}
