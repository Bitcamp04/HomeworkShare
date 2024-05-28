package homework._2024_05_07;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        count(str);

        String str2 = sc.nextLine();
        remove(str2);

        round();
        sc.close();
    }
    public static void count(String str) {
        int ka=0;
        int ba=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='가'){
                ka++;
                continue;
            }
            if (str.charAt(i)=='바') {
                ba++;
            }
        }
        if((ka | ba) ==0) System.out.println("가, 바가 존재하지 않습니다.");
        System.out.println("가 개수는 "+ka+" 바 개수는 "+ba);
    }

    public static void remove(String str) {

        String removeSmall=str.replaceAll("[a|i|e|o|u]","");
        String removeAll=removeSmall.replaceAll("[A|I|E|O|U]","");
        System.out.println(removeAll);
    }

    public static void round() {
        System.out.println((Math.round(16.459*100))/100.0);
    }
}
