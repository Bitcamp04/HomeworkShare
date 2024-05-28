package homework._2024_05_17.middle;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Student {
    public Student(int sno, String sName, int score) {
        this.sno = sno;
        this.sName = sName;
        this.score = score;
    }

    private int sno;
    private String sName;
    private int score;
    private String grade;
}
