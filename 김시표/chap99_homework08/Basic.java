package chap99_homework08;

import java.util.Calendar;

public class Basic {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		calendar.set(2020, 3, 8);

		System.out.println("변경된 날짜: " + calendar.getTime());
		
		calendar.add(Calendar.YEAR, 5); // set처럼 간편하게 못하나?
		calendar.add(Calendar.MONTH, 1);
		calendar.add(Calendar.DATE, 3);
		
		System.out.println("5년 2달 3일 후 날짜 " + calendar.getTime());
		
		

	 }
	 
}
		 
