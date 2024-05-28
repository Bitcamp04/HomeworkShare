package homework._2024_05_17.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add((int)(Math.random()*10)+1);
        }
        list.stream().map(x->x*3).forEach(x->{
            System.out.print(x+"  ");
        });
        System.out.println();


        Scanner sc = new Scanner(System.in);
        List<String> str = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("문자열 입력");
            str.add(sc.nextLine());
        }
        str.stream().filter(x->x.length()>=5).forEach(x->{
            System.out.print(x+"  ");
        });
        System.out.println();

        List<String> str2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("문자열 입력");
            str2.add(sc.nextLine());
        }
        str2.stream().filter(x->x.matches("[a-zA-Z]+")).forEach(x->{
            System.out.print(x+"  ");
        });
        System.out.println();

    }
}
