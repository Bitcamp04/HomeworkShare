package homework04.basic.worker;

public class PublicOfficial extends Worker{

	@Override
	public void goToWork() {
		// TODO Auto-generated method stub
		System.out.println("공무원이 출근합니다.");
	}
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("공무원이 민원업무를 합니다.");
	}
	@Override
	public void leaveWork() {
		// TODO Auto-generated method stub
		System.out.println("공무원이 퇴근합니다.");
	}
}
