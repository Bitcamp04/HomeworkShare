package homework._2024_05_03.advanced;

import java.util.Arrays;

public class MathStudent extends CommonStat implements Student{
    private static final String major="Math";

    @Override
    public void saveInfo(int sno, String name, String[] subject, int[] finalExamScore) {
        this.sno=sno;
        this.name=name;
        this.subject=subject;
        this.finalExamScore=finalExamScore;
    }

    @Override
    public void printInfo() {
        System.out.println("sno: "+sno);
        System.out.println("name: "+name);
        System.out.println("subject: ");
        Arrays.stream(subject).forEach(System.out::println);
        System.out.println();
        System.out.println("finalExamScore: ");
        Arrays.stream(finalExamScore).forEach(System.out::println);
        System.out.println();
        System.out.println("major: "+major);
    }

    @Override
    public double getAvg() {
        return Arrays.stream(this.finalExamScore).average().getAsDouble();
    }
}