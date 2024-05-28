package homework._2024_05_09;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 2001�� 12�� 19���� ��ȥ������� �κΰ� �ִ�. 
//	    ������ �ִ� �⵵���� ��ȥ������� ��¥�� �Ϸ羿 ���ϱ�� �ߴ�.
//	    2022���� ��ȥ����� ��¥�� ���ϼ���.
		Calendar cal1 = Calendar.getInstance();
		cal1.set(2001, 11, 19);
		Scanner sc = new Scanner(System.in);
		for(int i = 2001; i <= 2022; i++) {
			if(isLeap(i)) {
				cal1.add(Calendar.DATE, 1);
			}
		}
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM�� dd��");
		
		Date d1 = new Date(cal1.getTimeInMillis());
		
		System.out.println("2022�� ��ȥ����� ��¥�� " 
				+ sdf1.format(d1)
				+ "�Դϴ�.");
		System.out.println("------------------------------");
////
////		2. ����ڰ� �� ���� ��¥(yyyy-MM-dd ����)�� �Է��ϰ� �Է¹���
////		    �� ��¥ ������ ��¥�� ��� ����ϼ���. (Calendar Ŭ������ ����ϼ���).
////		    ex) 2023-01-29 2023-02-05 �Է�
////			���  =>  2023-01-29
////		             2023-01-30
////		             2023-01-31
////		             2023-02-01
////		             2023-02-02
////		             2023-02-03
////		             2023-02-04
////		             2023-02-05
//		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
//
//		System.out.print("ù ��° ��¥�� �Է��ϼ���.\n(�⵵4�ڸ�-��2�ڸ�-��2�ڸ� �������� �ۼ�)\n");
//		String inputDate1 = sc.nextLine();
//		System.out.print("�� ��° ��¥�� �Է��ϼ���.\n(�⵵4�ڸ�-��2�ڸ�-��2�ڸ� �������� �ۼ�)\n");
//		String inputDate2 = sc.nextLine();
//
//		String[] dateArr1 = inputDate1.split("-");
//		String[] dateArr2 = inputDate2.split("-");
//
//		Calendar cal2 = Calendar.getInstance();
//		Calendar cal3 = Calendar.getInstance();
//
//		cal2.set(Integer.parseInt(dateArr1[0]), (Integer.parseInt(dateArr1[1]) - 1), Integer.parseInt(dateArr1[2]));
//		cal3.set(Integer.parseInt(dateArr2[0]), (Integer.parseInt(dateArr2[1]) - 1), Integer.parseInt(dateArr2[2]));
//
//		Date d2 = new Date(cal2.getTimeInMillis());
//		Date d3 = new Date(cal3.getTimeInMillis());
//
//		int compare = d2.compareTo(d3);
//
//		if(compare > 0) {
//			long diff = cal2.getTimeInMillis() - cal3.getTimeInMillis();
//
//			long day = diff / (1000 * 60 * 60 * 24);
//
//			System.out.println(sdf2.format(new Date(cal3.getTimeInMillis())));
//
//			for(long i = 1; i < day; i++) {
//				cal3.add(Calendar.DATE, 1);
//				System.out.println(sdf2.format(new Date(cal3.getTimeInMillis())));
//			}
//
//			System.out.println(sdf2.format(new Date(cal2.getTimeInMillis())));
//		} else if(compare < 0) {
//			long diff = cal3.getTimeInMillis() - cal2.getTimeInMillis();
//
//			long day = diff / (1000 * 60 * 60 * 24);
//
//			System.out.println(sdf2.format(new Date(cal2.getTimeInMillis())));
//
//			for(long i = 0; i < day; i++) {
//				cal2.add(Calendar.DATE, 1);
//				System.out.println(sdf2.format(new Date(cal2.getTimeInMillis())));
//			}
//
//			System.out.println(sdf2.format(new Date(cal3.getTimeInMillis())));
//		} else {
//			System.out.println("�� ��¥�� �����ϴ�.");
//		}
//
//		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
//
//		System.out.print("ù ��° ��¥�� �Է��ϼ���.\n(�⵵4�ڸ�-��2�ڸ�-��2�ڸ� �������� �ۼ�)\n");
//		String inputDate1 = sc.nextLine();
//		System.out.print("�� ��° ��¥�� �Է��ϼ���.\n(�⵵4�ڸ�-��2�ڸ�-��2�ڸ� �������� �ۼ�)\n");
//		String inputDate2 = sc.nextLine();
//
//		String[] dateArr1 = inputDate1.split("-");
//		String[] dateArr2 = inputDate2.split("-");
//
//		Calendar cal2 = Calendar.getInstance();
//		Calendar cal3 = Calendar.getInstance();
//
//		cal2.set(Integer.parseInt(dateArr1[0]), (Integer.parseInt(dateArr1[1]) - 1), Integer.parseInt(dateArr1[2]));
//		cal3.set(Integer.parseInt(dateArr2[0]), (Integer.parseInt(dateArr2[1]) - 1), Integer.parseInt(dateArr2[2]));
//
//		long diff = 0;
//
//		Date first;
//		Date last;
//
//		if(cal2.getTimeInMillis() > cal3.getTimeInMillis()) {
//			diff = cal2.getTimeInMillis() - cal3.getTimeInMillis();
//			first = new Date(cal3.getTimeInMillis());
//			last = new Date(cal2.getTimeInMillis());
//		} else {
//			diff = cal3.getTimeInMillis() - cal2.getTimeInMillis();
//			first = new Date(cal2.getTimeInMillis());
//			last = new Date(cal3.getTimeInMillis());
//		}
//
//		if(diff != 0) {
//			long day = diff / (1000 * 60 * 60 * 24);
//			System.out.println(day);
//
//			System.out.println(sdf2.format(first));
//			cal3.setTime(first);
//
//			for(long i = 1; i < day; i++) {
//				cal3.add(Calendar.DATE, 1);
//				System.out.println(sdf2.format(new Date(cal3.getTimeInMillis())));
//			}
//
//			System.out.println(sdf2.format(last));
//		} else {
//			System.out.println("�� ��¥�� �����ϴ�.");
//		}
//
////	    3. ����ڰ� �Է��� 5���� ������ �����ϴ� List<Integer>�� �����ϰ�
////	    ���ӵ� �� ���� ���� ���� Ŀ���� ������ �� ���� ����ϼ���.
////	    ex) [1, 2, 3, 4, 5] => 4, 5 ���
//		List<Integer> intList =
//					new ArrayList<Integer>();
//
//		for(int i = 0; i < 5; i++) {
//			System.out.print("������ �Է��ϼ���.");
//			intList.add(sc.nextInt());
//		}
//
//		int sum = intList.get(0) + intList.get(1);
//
//		int a = intList.get(0);
//		int b = intList.get(1);
//
//		for(int i = 0; i < intList.size(); i++) {
//			for(int j = i + 1; j < intList.size(); j++) {
//				if(intList.get(i) + intList.get(j) > sum) {
//					sum = intList.get(i) + intList.get(j);
//					a = intList.get(i);
//					b = intList.get(j);
//				}
//			}
//		}
//
//		System.out.println("�� : " + sum
//						+ ", " + a + ", " + b);
//
////	    4. ����ڰ� �Է��� 6���� ������ �����ϴ� List<Integer>�� �����ϰ�
////	    �� ���� ���� ������ ���� �Ǵ� ������ ����ϼ���.(�ߺ� ���� ���Ұ�)
////	    ex) [1, 2, 3, 4, 5, 6] => �� 4��(3, 4, 10, 11)
//		List<Integer> intList2 =
//				new ArrayList<>();
//
//		for(int i = 0; i < 6; i++) {
//			System.out.print("������ �Է��ϼ���.");
//			intList2.add(sc.nextInt());
//		}
//
//		List<Integer> sumList = new ArrayList<>();
//
//		List<Integer> cntList = new ArrayList<>();
//
//		List<Integer> valueList = new ArrayList<>();
//
//		for(int i = 0; i < intList2.size(); i++) {
//			for(int j = i + 1; j < intList2.size(); j++) {
//				if(j != i) {
//					sumList.add(intList2.get(i) + intList2.get(j));
//				}
//			}
//		}
//
//		System.out.println(sumList);
//		for(int i = 0; i < sumList.size(); i++) {
//			int sumCnt = 1;
//
//			for(int j = 0; j < sumList.size(); j++) {
//				if(i != j) {
//					if(sumList.get(i) == sumList.get(j)) {
//						//System.out.println(sumList.get(i));
//						sumCnt++;
//					}
//				}
//			}
//
//			if(sumCnt > 0) {
//				cntList.add(sumCnt);
//				valueList.add(sumList.get(i));
//			}
//		}
//
//		System.out.println(cntList);
//		System.out.println(valueList);
//
//		int sumCnt = 0;
//
//		System.out.print("���� ������ ���� ��: ");
//		for(int i = 0; i < sumList.size(); i++) {
//			if(cntList.get(i) == 1) {
//				sumCnt++;
//				System.out.print(valueList.get(i) + ", ");
//			}
//		}
//
//		System.out.println("������ ���� ����: " + sumCnt);
//
		sc.close();
	}
//
	public static boolean isLeap(int year) {
		return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
	}

}
