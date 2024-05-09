package homework08.advance;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 2001년 12월 19일이 결혼기념일인 부부가 있다. 
	    // 윤년이 있는 년도에는 결혼기념일의 날짜를 하루씩 더하기로 했다.
	    // 2022년의 결혼기념일 날짜를 구하세요.
		Calendar cal1 = Calendar.getInstance();
		cal1.set(2001, 11, 19);
		System.out.println(cal1.get(Calendar.YEAR));
		
		for(int i = 0; i < 21; i++) {
			if(cal1.get(Calendar.YEAR) % 400 == 0 || (cal1.get(Calendar.YEAR) % 4 == 0 && cal1.get(Calendar.YEAR) % 100 != 0)) {
				cal1.add(Calendar.DATE, 1);
			}
			cal1.add(Calendar.YEAR, 1);
		}
		Date resultDate = new Date(cal1.getTimeInMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println("결혼기념일 : " + sdf.format(resultDate));
		
		/** 2. 사용자가 두 개의 날짜(yyyy-MM-dd 형식)를 입력하고 입력받은
	    	   두 날짜 사이의 날짜를 모두 출력하세요. (Calendar 클래스를 사용하세요).
	    	   ex) 2023-01-29 2023-02-05 입력
			   출력       2023-01-29
	             		2023-01-30
	             		2023-01-31
	             		2023-02-01
	             		2023-02-02
	             		2023-02-03
	             		2023-02-04
	             		2023-02-05
	     */
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 날짜를 입력해주세요. ex)yyyy-MM-dd");
		String date1 = sc.nextLine();
		int date1_yyyy = Integer.parseInt(date1.split("-")[0]);
		int date1_MM = Integer.parseInt(date1.split("-")[1]) - 1;
		int date1_dd = Integer.parseInt(date1.split("-")[2]);
		Calendar firstCal = Calendar.getInstance();
		firstCal.set(date1_yyyy, date1_MM, date1_dd);
		
		
		System.out.println("두 번째 날짜를 입력해주세요. ex)yyyy-MM-dd");
		String date2 = sc.nextLine();
		int date2_yyyy = Integer.parseInt(date2.split("-")[0]);
		int date2_MM = Integer.parseInt(date2.split("-")[1]) - 1;
		int date2_dd = Integer.parseInt(date2.split("-")[2]);
		Calendar SecondCal = Calendar.getInstance();
		SecondCal.set(date2_yyyy, date2_MM, date2_dd);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		
//		System.out.println("firstDate : " + sdf2.format(firstDate));
//		System.out.println("SecondDate : " + sdf2.format(SecondDate));
//		System.out.println("firstCal.get(Calendar.DATE) : " + firstCal.get(Calendar.DATE));
//		System.out.println("SecondCal.get(Calendar.DATE) : " + SecondCal.get(Calendar.DATE));
		
//		System.out.println("f : " + (firstCal.getTimeInMillis() - SecondCal.getTimeInMillis()));
//		System.out.println("e : " + (SecondCal.getTimeInMillis() - firstCal.getTimeInMillis()));
		if(firstCal.getTimeInMillis() > SecondCal.getTimeInMillis()) {
			long diff = (firstCal.getTimeInMillis() - SecondCal.getTimeInMillis()) / ((long) 1000 * 60 * 60 * 24);
//			System.out.println(diff);
			for(long i = 1; i < diff; i++) {
//				System.out.println(fDate);
				SecondCal.add(Calendar.DATE, 1);
//				System.out.println(firstCal.getTime());
				String eDate = sdf2.format(SecondCal.getTime());
				System.out.println(eDate);
//				firstDate = new Date(firstCal.getTimeInMillis());
			}
		} else {
			long diff = (SecondCal.getTimeInMillis() - firstCal.getTimeInMillis()) / ((long) 1000 * 60 * 60 * 24);
//			System.out.println(diff);
			for(long i = 1; i < diff; i++) {
//				System.out.println(fDate);
				firstCal.add(Calendar.DATE, 1);
//				System.out.println(firstCal.getTime());
				String fDate = sdf2.format(firstCal.getTime());
				System.out.println(fDate);
//				firstDate = new Date(firstCal.getTimeInMillis());
			}
		}
		
		// 3. 사용자가 입력한 5개의 정수를 저장하는 List<Integer>를 생성하고
	    // 연속된 두 수의 합이 가장 커지는 구간의 두 수를 출력하세요.
	    // ex) [1, 2, 3, 4, 5] => 4, 5 출력
		List<Integer> fiveNumArr = new ArrayList<Integer>();
		for(int i = 1; i <= 5; i++) {
			System.out.println(i + "번째 숫자를 입력해 주세요.");
			fiveNumArr.add(sc.nextInt());
		}
		
		int maxNum = fiveNumArr.get(0) + fiveNumArr.get(1);
		int beforeNum = 0;
		int afterNum = 1;
		for(int j = 1; j < fiveNumArr.size() - 1; j++) {
			if(fiveNumArr.get(j) + fiveNumArr.get(j + 1) > maxNum) {
				maxNum = fiveNumArr.get(j) + fiveNumArr.get(j + 1);
				beforeNum = j;
				afterNum = j + 1;
			}
		}
		
		System.out.println(fiveNumArr.get(beforeNum) + ", " + fiveNumArr.get(afterNum));
		
		// 4. 사용자가 입력한 6개의 정수를 저장하는 List<Integer>를 생성하고
	    // 두 수의 합이 유일한 값이 되는 개수를 출력하세요.(중복 숫자 사용불가)
	    // ex) [1, 2, 3, 4, 5, 6] => 총 4개(3, 4, 10, 11)
		List<Integer> sixNumArr = new ArrayList<Integer>();
		List<Integer> sumArr1 = new ArrayList<Integer>();
		List<Integer> sumArr2 = new ArrayList<Integer>();
		
		for(int i = 1; i <= 6; i++) {
			System.out.println(i + "번째 숫자를 입력해주세요.");
			sixNumArr.add(sc.nextInt());
		}
		
		int sum = 0;
		for(int j = 0; j < sixNumArr.size() - 1; j++) {
			for(int k = 1; k < sixNumArr.size(); k++) {
				sum = sixNumArr.get(j) + sixNumArr.get(k);
				if(!sumArr1.contains(sum)) {
					sumArr1.add(sum);
				} else {
					sumArr2.add(sum);
				}
			}
		}
		System.out.println("one : " + sumArr1.toString());
		System.out.println("two : " + sumArr2.toString());
		sumArr1.removeAll(sumArr2);
		System.out.println("합의 개수 : " + sumArr1.size() + " 형태 : " + sumArr1.toString());
		
		sc.close();
	}

}
