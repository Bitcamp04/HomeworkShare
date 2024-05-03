package homework._2024_05_03.advanced;

public interface Student {
    void saveInfo(int sno, String name,String[] subject,int[] finalExamScore);

    void printInfo();

    double getAvg();
}
