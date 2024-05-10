package homework08.basic;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Calendar 객체를 오늘날짜로 생성하세요.
		// 객체의 날짜를 2020년 4월 8일로 변경하고 출력하세요.
		// 위의 객체의 날짜를 add 메소드를 이용해서 5년뒤 2달뒤 3일뒤로 변경하고 출력하세요.
		Calendar cal1 = Calendar.getInstance();
		cal1.set(2020, 3, 8);
		System.out.println(cal1.get(Calendar.YEAR) + "년 "
				+ cal1.get(Calendar.MONTH) + "월 "
				+ cal1.get(Calendar.DATE) + "일");
		
		cal1.add(Calendar.YEAR, 5);
		cal1.add(Calendar.MONTH, 2);
		cal1.add(Calendar.DATE, 3);
//		Date todayDate = new Date(cal1.getTimeInMillis());
//		System.out.println(todayDate.toString());
		System.out.println(cal1.get(Calendar.YEAR) + "년 "
				+ cal1.get(Calendar.MONTH) + "월 "
				+ cal1.get(Calendar.DATE) + "일");
		
		// 2. Calendar 객체를 오늘날짜로 생성하세요.
		// 오늘날짜를 2023-03-24 형식으로 출력하세요.
		// 오늘날짜를 2023년 03월 24일 xx시 xx분 xx초 형식으로 출력하세요.
		Calendar cal2 = Calendar.getInstance();
		Date date2 = cal2.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println(sdf.format(date2));
		
		// 3. 정수형 데이터를 저장할 수 있는 ArrayList를 생성하고 사용자가 입력한 5개의 정수를 저장하고 출력하세요.
		List<Integer> intList = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("정수를 입력해 주세요.");
			intList.add(sc.nextInt());
		}
		System.out.println(intList);
		sc.close();
	}

}
