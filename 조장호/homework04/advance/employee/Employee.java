package homework04.advance.employee;

/*
 * 2. 추상클래스 회사원
	  - 사번 => int eno
	  - 이름 => String name
	  - 급여 => int pay
	  - 근무형태 => int type //1: 정규직, 2: 계약직, 3. 임시직
	 생성자(사번, 이름, 급여, 근무형태);
	 추상메서드 double getMonthPay();
	 일반메서드 void showEmployeeInfo();
	
	위 추상클래스 회사원을 상속받은 아래 세 클래스를 만들고 
	메서드 getMonthPay와 showEmployeeInfo를 오버라이드하여 구현하세요.
	정규직 : int bonus, 월급 = pay / 12 + bonus/12
	임시직 : int hireYear, 월급 = pay / 12;
	계약직 : int workDay, 월급 = pay * workDay
 */
public abstract class Employee {
	// 사번
	public int eno;
	// 이름
	public String name;
	// 급여
	public int pay;
	// 근무형태(1: 정규직, 2: 계약직, 3: 임시직)
	public int type;
	
	public Employee(int eno, String name, int pay, int type) {
		this.eno = eno;
		this.name = name;
		this.pay = pay;
		this.type = type;
	}
	
	public abstract double getMonthPay();

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void showEmployeeInfo() {
		System.out.println("사번 : " + this.eno);
		System.out.println("이름 : " + this.name);
		System.out.println("급여 : " + this.pay);
		System.out.println("근무형태: " + this.type);
	}

	
	
}
