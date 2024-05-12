package homework04.advance.employee;

// 계약직 근로자
public class ContractWorker extends Employee {
	private int workDay;

	public ContractWorker(int eno, String name, int pay, int type, int workDay) {
		super(eno, name, pay, type);
		this.workDay = workDay;
	}

	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		return this.getPay() * this.workDay;
	}
	
	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("근무일수 : " + this.workDay);
		System.out.println("월급 : " + this.getMonthPay());
	}
}
