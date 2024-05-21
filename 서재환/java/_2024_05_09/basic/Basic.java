package homework._2024_05_09.basic;

import java.util.*;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        basic1();
        basic2();
        basic3(sc);
    }
    public static void basic1(){
        Calendar calendar = Calendar.getInstance();
        printCurrentDateAndTime(calendar);

        calendar.set(2020,3,8);
        printCurrentDateAndTime(calendar);

        calendar.add(Calendar.YEAR,5);
        calendar.add(Calendar.MONTH,2);
        calendar.add(Calendar.DATE,3);
        printCurrentDateAndTime(calendar);
    }
    public static void basic2(){
        Calendar calendar = Calendar.getInstance();
        printCurrentDateAndTime(calendar);
    }
    public static void basic3(Scanner sc){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        ListIterator<Integer> listIterator = list.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }
    public static void printCurrentDateAndTime(Calendar calendar) {
        System.out.println("오늘 날짜: " + calendar.get(Calendar.YEAR) + "년 " +
                (calendar.get(Calendar.MONTH) + 1 < 10 ? "0" + (calendar.get(Calendar.MONTH) + 1) : calendar.get(Calendar.MONTH) + 1) + "월 " +
                (calendar.get(Calendar.DAY_OF_MONTH) < 10 ? "0" + calendar.get(Calendar.DAY_OF_MONTH) : calendar.get(Calendar.DAY_OF_MONTH)) + "일");
        System.out.println("현재 시간: " +
                (calendar.get(Calendar.HOUR_OF_DAY) < 10 ? "0" + calendar.get(Calendar.HOUR_OF_DAY) : calendar.get(Calendar.HOUR_OF_DAY)) + "시 " +
                (calendar.get(Calendar.MINUTE) < 10 ? "0" + calendar.get(Calendar.MINUTE) : calendar.get(Calendar.MINUTE)) + "분 " +
                (calendar.get(Calendar.SECOND) < 10 ? "0" + calendar.get(Calendar.SECOND) : calendar.get(Calendar.SECOND)) + "초");
    }
}
