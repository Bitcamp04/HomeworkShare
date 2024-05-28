package homework04.advance.employee;

// 정규직 근로자
public class RegularWorker extends Employee{
	private int bonus;

	public RegularWorker(int eno, String name, int pay, int type, int bonus) {
		super(eno, name, pay, 1);
		this.bonus = bonus;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		return this.getPay() / 12 + this.bonus /12;
	}
	
	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("보너스 : " + bonus);
		System.out.println("월급 : " + this.getMonthPay());
	}
	
	
}
