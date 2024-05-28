package homework04.basic.worker;
/*
 * 3.근로자 추상 클래스를 생성하고 출근하다, 퇴근하다, 일한다. 추상메소드를 선언합니다. 근로자를 상속받은 개발자와 공무원 클래스 만들고 오버라이딩된 세 개의 메소드를 
    본인이 원하는 대로 구현하세요.
 */
public abstract class Worker {

	// 출근하다
	public abstract void goToWork();
	// 퇴근하다
	public abstract void leaveWork();
	// 일한다
	public abstract void work();
}
