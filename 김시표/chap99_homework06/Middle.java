package chap99_homework06;

import java.util.Scanner;

public class Middle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("문자열을 입력하세요: ");
            String input = scanner.nextLine();

            int length = input.length();
            int middle = length / 2;

            if (length % 2 == 0) {
            System.out.println(input.substring(middle - 1, middle + 1));
            } else {
            System.out.println(input.charAt(middle));
        }

        scanner.close();
    }
}