package homework12.number02;

public class Account {
	private int balance;
	
	public Account() {
		
	}
	
	public Account(int balance) {
		this.balance = balance;
	}
	
	public void depositMoney(int money) {
		System.out.println(money + "원을 예금합니다.");
		this.balance += money;
	}
	
	public void withdrawMoney(int money) {
		if(money > this.balance) {
			System.out.println("남아 있는 잔액보다 더 많은 금액을 인출할 수 없습니다.");
		} else {
			System.out.println(money + "원을 인출합니다.");
			this.balance -= money;
		}
	}
	
	public void printBalance() {
		System.out.println("잔액 조회 : " + this.balance);
	}
}
