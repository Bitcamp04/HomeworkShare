package homework08.middle;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)에 add 메소드로 3일뒤로 변경하고
	    // yyyy-MM-dd 형식으로 출력하세요. (SimpleDateFormat 클래스 사용. SimpleDateFormat의
	    // parse() 메소드를 이용하면 String -> Calendar로 변환가능)
//		Calendar inputCal = Calendar.getInstance();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("년월일을 입력해 주세요. ex) yyyy-MM-dd");
//		String yearMonthDay = sc.nextLine();
//		String[] ymdArr = yearMonthDay.split("-");
//		inputCal.set(Integer.parseInt(ymdArr[0]), 
//				     Integer.parseInt(ymdArr[1]) - 1,
//				     Integer.parseInt(ymdArr[2]));
//		inputCal.add(Calendar.DATE, 3);
//		Date calDay = new Date(inputCal.getTimeInMillis());
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		System.out.println(sdf.format(calDay));
//		
//		
//		// 2. 길이가 8이며 한글로 된 요일이 저장되어 있는 요일 배열을 만들고
//		// 사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)의 요일을 한글로 출력하세요.
//		String[] koreanWeek = {"", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
//		System.out.println("년월일을 입력해 주세요. ex) yyyy-MM-dd");
//		String yearMonthDay2 = sc.nextLine();
//		String[] ymdArr2 = yearMonthDay2.split("-");
//		
//		Calendar cal2 = Calendar.getInstance();
//		cal2.set(Integer.parseInt(ymdArr2[0]), 
//				     Integer.parseInt(ymdArr2[1]) - 1,
//				     Integer.parseInt(ymdArr2[2]));
//		
//		System.out.println("오늘은 " + koreanWeek[cal2.get(Calendar.DAY_OF_WEEK)] + "입니다.");
//		sc.close();
		
		// 3. 두 개의 날짜 데이터 2023-03-15 20:31:45와 2021-07-08 11:58:04의 차이를
	    // 시 분 초 형태로 나타내시오.
		Calendar cal3 = Calendar.getInstance();
		cal3.set(2023, 3, 15, 20, 31, 45);
		Calendar cal4 = Calendar.getInstance();
		cal4.set(2021, 7, 8, 11, 58, 4);
		Long diff = cal3.getTimeInMillis() - cal4.getTimeInMillis();
		
		Long hour = diff / (60 * 60);
		diff %= (60 * 60);
		Long minute = diff / 60;
		diff %= 60;
		System.out.println(hour + "시 " + minute + "분 " + diff + "초");
	}

}
