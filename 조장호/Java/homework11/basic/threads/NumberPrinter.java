package homework11.basic.threads;

// 3. 공유객체로 사용될 클래스 NumberPrinter를 만들고 멤버변수로 
// int num을 가지고 정수형 매개변수를 받아 매개변수로 받아온 값은 num에 저장하고 
// num~50까지중 3의 배수를 출력하는 메소드 numPrint1(int num)과 
// num~100까지 숫자 중 5와 7의 공배수를 출력하는 메소드 numPrint2(int num)를 구현하세요. 
// 그리고 공유객체를 사용하며 numPrint1을 호출하는 스레드 클래스 1개와
// numPrint2를 호출하는 스레드 클래스 1개를 구현하고 메인스레드에서 두 개의 스레드를 실행하세요.

public class NumberPrinter {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	// 공유된 객체의 필드를 사용하는 메소드를 다른 메소드가 사용하지 못하게
	// 메소드에 synchronized를 선언
	public synchronized void numPrint1(int num) {
		setNum(num);
		for(int i = num; i <= 50; i++) {
			if(i % 3 == 0) {
				System.out.println(num + " ~ 50까지 3의 배수 : " + i);
			}
		}
	}
	
	public void numPrint2(int num) {
		// 공유된 객체의 필드 값을 바꾸지 못하게  synchronized 블록 사용
		synchronized (this) {
			setNum(num);
		}
		
		for(int i = num; i <= 100; i++) {
			if(i % 5 == 0 && i % 7 == 0) {
				System.out.println(num + " ~ 100까지 3의 배수 : " + i);
			}
		}
	}
}
