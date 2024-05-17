package homework04.basic.worker;

public class Developer extends Worker{

	@Override
	public void goToWork() {
		// TODO Auto-generated method stub
		System.out.println("개발자가 출근합니다.");
	}
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("개발자가 프로젝트 개발을 합니다.");
	}
	@Override
	public void leaveWork() {
		// TODO Auto-generated method stub
		System.out.println("개발자가 퇴근합니다.");
	}
}
