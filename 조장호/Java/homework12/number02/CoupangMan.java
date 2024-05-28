package homework12.number02;

public class CoupangMan extends Alba{
	private int workhour;
	private int timeBySalary;
	
	public CoupangMan(int workhour, int timeBySalary) {
		this.workhour = workhour;
		this.timeBySalary = timeBySalary;
	}


	@Override
	public void doWork() {
		System.out.println("쿠팡맨은 " + workhour + "시간동안 일해서 " + workhour * timeBySalary + "원의 급여를 받는다.");
	}
}
