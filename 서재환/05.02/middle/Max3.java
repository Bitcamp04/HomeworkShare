package homework._2024_05_02.middle;
import java.util.Scanner;


class Max3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 최댓값을 구합니다.");
        System.out.print("a의 값：");
        int a = stdIn.nextInt();
        System.out.print("b의 값：");
        int b = stdIn.nextInt();
        System.out.print("c의 값：");
        int c = stdIn.nextInt();

        int max = a;

		/*
		이곳에 적절한 코드를 넣으세요
		*/
        if(b<c){
            max= Math.max(max, c);
        }
        System.out.println("최댓값은 " + max + "입니다.");
    }
}