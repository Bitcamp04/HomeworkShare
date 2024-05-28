package homework12.number02;

public class CountryWorker implements Worker{

	
	@Override
	public void goWork() {
		System.out.println("공무원이 출근합니다.");
	}
	@Override
	public void goHome() {
		System.out.println("공무원이 퇴근합니다.");
	}
	
	@Override
	public void doWork() {
		System.out.println("공무원이 일합니다.");
	}
}
