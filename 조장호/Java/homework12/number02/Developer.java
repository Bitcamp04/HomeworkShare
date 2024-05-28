package homework12.number02;

public class Developer implements Worker{
	@Override
	public void goWork() {
		System.out.println("개발자가 출근합니다.");
	}
	
	@Override
	public void goHome() {
		System.out.println("개발자가 퇴근합니다.");
	}
	
	@Override
	public void doWork() {
		System.out.println("개발자가 개발합니다.");		
	}
}
