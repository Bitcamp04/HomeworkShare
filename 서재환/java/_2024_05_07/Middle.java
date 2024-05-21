package homework._2024_05_07;

import java.util.Scanner;

public class Middle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        print(sc.nextLine());
        print();
        bank();
    }
    public static void print(String str) {
        if(str.isEmpty()) return;
        System.out.println(str.substring((int) Math.floor((str.length()-1)/2.0),((int)Math.ceil((str.length()-1)/2.0)+1)));
    }

    public static void print() {
        char[] c={'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l', 't'};

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < 4; j++) {
            for(int i = 0; i+j < c.length; i=i+4) {
                sb.append(c[(j+i)]);
            }
        }

        System.out.println(sb);
    }
    public static void bank() {
        double money=10000.0;
        double percentage=0.1;
        for(int i=0;i<10;i++) {
            money+=money*percentage;
        }
        System.out.println(money);
    }
}
