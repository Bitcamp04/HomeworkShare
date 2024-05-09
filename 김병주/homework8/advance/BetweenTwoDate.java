package homework.homework8.advance;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class BetweenTwoDate {
//	2. 사용자가 두 개의 날짜(yyyy-MM-dd 형식)를 입력하고 입력받은
//    두 날짜 사이의 날짜를 모두 출력하세요. (Calendar 클래스를 사용하세요).
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("날짜를 입력해주세요. (yyyy-MM-dd)");
		String userDate1 = sc.nextLine();
		System.out.println("날짜를 입력해주세요. (yyyy-MM-dd)");
		String userDate2 = sc.nextLine();
		
		try {
			Date date1 = sdf.parse(userDate1);
			Date date2 = sdf.parse(userDate2);
			cal1.setTime(date1);
			cal2.setTime(date2);
			
			while(!cal1.equals(cal2)){
				System.out.printf("%tF\n",cal1.getTime());
				cal1.add(Calendar.DATE, 1);
				}
			
			System.out.printf("%tF\n",cal1.getTime());

		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}
