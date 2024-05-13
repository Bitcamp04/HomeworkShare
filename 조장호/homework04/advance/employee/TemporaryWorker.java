package homework04.advance.employee;

// 임시직 근로자
public class TemporaryWorker extends Employee{
	private int hireYear;

	public TemporaryWorker(int eno, String name, int pay, int type, int hireYear) {
		super(eno, name, pay, type);
		this.hireYear = hireYear;
	}

	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		return this.getPay()/12;
	}
	
	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("근무년수 : " + this.hireYear);
		System.out.println("월급 : " + this.getMonthPay());
	} 
}
