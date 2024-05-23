package homework.homework12.txt2;

public class Alba {
	int workHour;
	int hourPay;
	
	public void work(int workHour) {
		System.out.printf("%d시간동안 일해서 %d원을 받는다.", workHour, workHour * hourPay);
	}
	
}
