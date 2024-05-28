package homework12.number02;

public class Alba {
	private int workhour;
	private int timeBySalary;

	public Alba() {
		
	}

	public Alba(int workhour, int timeBySalary) {
		this.workhour = workhour;
		this.timeBySalary = timeBySalary;
	}


	public void doWork() {
		System.out.println(workhour + "시간동안 일해서 " + workhour * timeBySalary + "원의 급여를 받는다.");
	}
}
