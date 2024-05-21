package homework._2024_05_09.middle;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Middle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        middle1(sc);
        middle2(sc);
        middle3();
    }
    public static void middle1(Scanner scanner) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.parse(scanner.nextLine(),new ParsePosition(0));
        Calendar calendar= sdf.getCalendar();
        calendar.add(Calendar.DATE,3);
        printCurrentDateAndTime(calendar);
    }
    public static void middle2(Scanner scanner) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.parse(scanner.nextLine(),new ParsePosition(0));
        Calendar calendar=sdf.getCalendar();
        String[] day={"","�Ͽ���","������","ȭ����","������","�����","�ݿ���","�����"};
        System.out.println(day[calendar.get(Calendar.DAY_OF_WEEK)]);
    }
    public static void middle3() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023,2,15,20,31,45);
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2021,6,8,11,58,4);
        long dis=(calendar.getTimeInMillis()-calendar1.getTimeInMillis())/1000L;//��
        long time=dis/3600;//�ð�
        long minute=(dis-(time*3600))/60;
        long seconds=(dis-(time*3600)-(minute*60))%60;
        System.out.println(time+"��"+minute+"��"+seconds+"��");
    }
    public static void printCurrentDateAndTime(Calendar calendar) {
        System.out.println("���� ��¥: " + calendar.get(Calendar.YEAR) + "�� " +
                (calendar.get(Calendar.MONTH) + 1 < 10 ? "0" + (calendar.get(Calendar.MONTH) + 1) : calendar.get(Calendar.MONTH) + 1) + "�� " +
                (calendar.get(Calendar.DAY_OF_MONTH) < 10 ? "0" + calendar.get(Calendar.DAY_OF_MONTH) : calendar.get(Calendar.DAY_OF_MONTH)) + "��");
        System.out.println("���� �ð�: " +
                (calendar.get(Calendar.HOUR_OF_DAY) < 10 ? "0" + calendar.get(Calendar.HOUR_OF_DAY) : calendar.get(Calendar.HOUR_OF_DAY)) + "�� " +
                (calendar.get(Calendar.MINUTE) < 10 ? "0" + calendar.get(Calendar.MINUTE) : calendar.get(Calendar.MINUTE)) + "�� " +
                (calendar.get(Calendar.SECOND) < 10 ? "0" + calendar.get(Calendar.SECOND) : calendar.get(Calendar.SECOND)) + "��");
    }
}
