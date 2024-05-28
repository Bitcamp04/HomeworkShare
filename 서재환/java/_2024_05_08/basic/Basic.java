package homework._2024_05_08.basic;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<3;i++){
            sb.append(sc.nextLine());
        }
        System.out.println(sb);

        StringBuffer sb1 = new StringBuffer(30);
        sb1.append("hello");
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());
        int sub=sb1.capacity()-sb1.length();
        for(int i=0;i<sub;i++){
            sb1.append("a");
        }
        System.out.println(sb1);

        System.out.println(sb1.capacity());
        System.out.println(sb1.length());
    }
}
