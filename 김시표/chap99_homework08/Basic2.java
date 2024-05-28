package chap99_homework08;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Basic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
//		System.out.println(calendar.getTime()); 오늘날짜 표현법 calendar.getTime()
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat st = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 MM분 SS초");
		calendar.set(2023, 02, 24);
		System.out.println(sd.format(calendar.getTime()));
		System.out.println(st.format(calendar.getTime()));
		

		

		

	}

}
