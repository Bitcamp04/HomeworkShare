package homework04;

public class public_official extends employee {

	@Override
	public void goToWork() {
		// TODO Auto-generated method stub
		System.out.println(("공무원이 출근합니다."));

	}

	@Override
	public void leaveWork() {
		// TODO Auto-generated method stub
		System.out.println("공무원이 퇴근합니다.");

	}

	@Override
	public void dowork() {
		// TODO Auto-generated method stub
		System.out.println("공무원이 민원 업무를 봅니다.");

	}

}
