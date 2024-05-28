package homework04;

public class developer extends employee {
	

	@Override
	public void goToWork() {
		// TODO Auto-generated method stub
		System.out.println("개발자가 출근 합니다.");

	}

	@Override
	public void leaveWork() {
		// TODO Auto-generated method stub
		System.out.println("개발자가 퇴근 합니다.");

	}

	@Override
	public void dowork() {
		// TODO Auto-generated method stub
		System.out.println("개발자가 개발을 합니다.");

	}

}
