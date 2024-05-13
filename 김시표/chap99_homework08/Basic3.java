package chap99_homework08;

import java.util.ArrayList;
import java.util.Scanner;

public class Basic3 {

	public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요:");

        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt(); 
            list.add(number); 
        }

        scanner.close(); 

        System.out.println("입력된 정수:");
        for (int number : list) {
            System.out.println(number);
        }
    }
}