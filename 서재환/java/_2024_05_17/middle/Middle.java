package homework._2024_05_17.middle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Middle {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "홍길동", 100));
        studentList.add(new Student(2, "임꺽정", 75));
        studentList.add(new Student(3, "장길산", 86));
        studentList.add(new Student(4, "정도전", 97));
        studentList.add(new Student(5, "이순신", 95));
        Stream<Student> studentStream = studentList.stream().filter(x -> x.getScore() >= 95);
        studentStream.peek(x->x.setGrade("A+")).forEach(x->{
            System.out.print(x.getSName()+"  ");
            System.out.print(x.getSno()+"  ");
            System.out.print(x.getScore()+"  ");
            System.out.println(x.getGrade());
        });

        Scanner sc = new Scanner(System.in);
        List<Character> charList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("문자 입력");
            charList.add(sc.nextLine().charAt(0));
        }
        charList.stream().map(x->{
            if(x>='a' &&x<='z'){
                return x.toString().toUpperCase().charAt(0);
            }
            else if(x>='A' &&x<='Z'){
                return x.toString().toLowerCase().charAt(0);
            }
            else{
                return null;
            }
        }).forEach(System.out::println);
        System.out.println();
    }
}
