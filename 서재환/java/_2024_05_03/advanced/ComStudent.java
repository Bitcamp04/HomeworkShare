package homework._2024_05_03.advanced;

import java.util.Arrays;

public class ComStudent extends CommonStat implements Student{
    private static final String major="Computer Science";
    public ComStudent(int sno,String name) {
        this.sno=sno;
        this.name=name;
    }
    @Override
    public void saveInfo(int index, String subject, int score) {
        if(index>=this.subject.length || index>=this.finalExamScore.length) return;
        this.subject[index]=subject;
        this.finalExamScore[index]=score;
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
