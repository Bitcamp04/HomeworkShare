package homework._2024_05_09.advanced;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;

public class Advanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        advanced1();
//        advanced2(sc);
//        advanced3(sc);
//        advanced4(sc);
    }
    public static void advanced1(){
        int cntLeaf=0;
        Calendar cal = Calendar.getInstance();
        cal.set(2001,11,19);
        while(true){

            if(isLeap(cal.get(Calendar.YEAR))){
                cntLeaf++;
            }
            if(cal.get(Calendar.YEAR)>=2022)
                break;
            cal.add(Calendar.YEAR,1);
        }
        System.out.println(cntLeaf);
        printCurrentDateAndTime(cal);
        cal.add(Calendar.DAY_OF_YEAR,cntLeaf);
        printCurrentDateAndTime(cal);

    }
    public static boolean isLeap(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        //단락 평가 이용 and문 보다 or문이 바깥에 위치하게 한다.
    }
    public static void advanced2(Scanner scanner){
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        sdf1.parse(scanner.nextLine(),new ParsePosition(0));
        Calendar calendar1= sdf1.getCalendar();


        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        sdf2.parse(scanner.nextLine(),new ParsePosition(0));
        Calendar calendar2= sdf2.getCalendar();

        if(calendar1.getTimeInMillis()>calendar2.getTimeInMillis()){
            while(calendar1.getTimeInMillis()>calendar2.getTimeInMillis()){
                printCurrentDateAndTime(calendar2);
                calendar2.add(Calendar.DATE, 1);
            }
            printCurrentDateAndTime(calendar2);
        }
        else if(calendar1.getTimeInMillis()<calendar2.getTimeInMillis()){
            while(calendar1.getTimeInMillis()<calendar2.getTimeInMillis()){
                printCurrentDateAndTime(calendar1);
                calendar1.add(Calendar.DATE, 1);
            }
            printCurrentDateAndTime(calendar1);
        }
        else {
            System.out.println("같은 날짜");
            printCurrentDateAndTime(calendar2);
        }
    }
    public static void advanced3(Scanner sc){
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        List<Integer> list1=new ArrayList<>();
        for(int i=0;i<list.size()-1;i++){
            list1.add(list.get(i)+list.get(i+1));
        }
        Optional<Integer> a=list1.stream().max(Comparator.naturalOrder());
        a.ifPresentOrElse(x-> System.out.println((list1.indexOf(x)+1)+","+(list1.indexOf(x)+2)),()->{});
    }
    public static void advanced4(Scanner sc){
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<6;i++){
            list.add(sc.nextInt());
        }
        List<Integer> set = new ArrayList<Integer>();
        int cnt = 0;
        for(int i=0;i<5;i++){
            for(int j=i+1;j<6;j++){
                set.add(list.get(i)+list.get(j));
            }
        }

        List<Integer> removed = new ArrayList<Integer>();
        List<Integer> remained=new ArrayList<Integer>();
        for(Integer x:set){
            if(removed.contains(x) || remained.contains(x)){
                remained.remove(x);
                removed.add(x);
            }
            else {
                remained.add(x);
            }
        }
        System.out.println(remained.size());
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
