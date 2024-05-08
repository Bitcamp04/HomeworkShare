package homework._2024_05_08.advanced;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Advanced {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        stringBuilder.append(input);

        for (int i = 0; i < stringBuilder.length()-1; i++) {
            if(stringBuilder.charAt(i)==stringBuilder.charAt(i+1)) {
                stringBuilder.deleteCharAt(i);
                i--;
            }

        }

        System.out.println(stringBuilder.toString());

    }
}
