package homework._2024_05_08.middle;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Middle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer("유용한 클래스는 많다. 다양한 라이브러리를 활용한다.");
        System.out.println(sb.charAt(sc.nextInt()));

        StringBuffer sb1 = new StringBuffer(30);
        sb1.append("hello");
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("t");
        deque.addFirst("i");
        deque.addFirst("b");
        String append;
        while (sb1.length()< sb1.capacity()){
            append=deque.remove();
            deque.add(append);
            sb1.append(append);
        }
        System.out.println(sb1);

        System.out.println(sb1.capacity());
        System.out.println(sb1.length());
    }
}
