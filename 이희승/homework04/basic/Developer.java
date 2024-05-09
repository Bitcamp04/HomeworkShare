package homeWork.homework04;

public class Developer extends Worker  {

	@Override
	public void working() {
		// TODO Auto-generated method stub
		System.out.println("마감이얼마남지않았습니다");
	}

	@Override
	public void gotowork() {
		// TODO Auto-generated method stub
		System.out.println("오늘도지하철에는사람이많습니다");
	}

	@Override
	public void leaveWork() {
		// TODO Auto-generated method stub
		System.out.println("오늘은 야근인것같습니다....");
	}
	
}
