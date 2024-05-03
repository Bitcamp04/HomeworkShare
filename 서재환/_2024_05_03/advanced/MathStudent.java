package homework._2024_05_03.advanced;

import java.util.Arrays;

public class MathStudent extends CommonStat implements Student{


    @Override
    public void saveInfo(int sno, String name, String[] subject, int[] finalExamScore) {
        this.sno=sno;
        this.name=name;
        this.subject=subject;
        this.finalExamScore=finalExamScore;
    }

    @Override
    public void printInfo() {
        System.out.println(sno+" "+name+" "+Arrays.toString(subject)+" "+Arrays.toString(finalExamScore));
    }

    @Override
    public double getAvg() {
        return Arrays.stream(this.finalExamScore).average().getAsDouble();
    }
}