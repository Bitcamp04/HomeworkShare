package homework.homework12.answer;

import java.util.Scanner;

public class Basic01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//		--------------------변수--------------------
//		1. 사용자가 입력한 이름, 나이, 성별을 출력하세요.
        System.out.println("이름을 입력하세요.");
        String name = sc.nextLine();

        System.out.println("나이을 입력하세요.");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("성별을 입력하세요.");
        String gender = sc.nextLine();

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("성별: " + gender);


//		2. 사용자가 입력한 두 개의 정수와 문자(char) 연산자를 받아 두 정수로 해당 연산을 진행한 결과를 출력하세요.
        System.out.println("정수를 입력하세요.");
        int num1 = sc.nextInt();

        System.out.println("정수를 입력하세요.");
        int num2 = sc.nextInt();
        sc.nextLine();

        System.out.println("연산자를 입력하세요.");
        char operator = sc.nextLine().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '%':
                System.out.println(num1 % num2);
                break;
        }

//		3. 반지름이 20인 원의 넓이와 둘레를 출력하세요.(넓이 : 2 * 3.14 * 반지름 ^ 2, 둘레 : 4 * 3.14 * 반지름)
//		    단, 원주율 3.14는 상수로 선언하세요.
        final double PI = 3.14;

        System.out.println("원의 넓이: " + (PI * 20 * 20));
        System.out.println("원의 둘레: " + (2 * PI * 20));

//		4. 사용자가 입력한 5개의 정수의 합계와 평균을 출력하세요.
        System.out.println("정수를 입력하세요.");
        int num3 = sc.nextInt();

        System.out.println("정수를 입력하세요.");
        int num4 = sc.nextInt();

        System.out.println("정수를 입력하세요.");
        int num5 = sc.nextInt();

        System.out.println("정수를 입력하세요.");
        int num6 = sc.nextInt();

        System.out.println("정수를 입력하세요.");
        int num7 = sc.nextInt();
        sc.nextLine();

        System.out.println("합: " + (num3 + num4 + num5 + num6 + num7));
        System.out.println("평균: " + ((num3 + num4 + num5 + num6 + num7) / 5));

//		5. 사용자가 입력한 세 정수의 최소 값, 중간 값, 최대 값을 출력하세요.
        int max = num3;
        int min = num3;
        int med = 0;

        if(num4 > max) {
            max = num4;
        }

        if(num5 > max) {
            max = num5;
        }

        if(num4 < min) {
            min = num4;
        }

        if(num5 < min) {
            min = num5;
        }

        if(num4 > num3) {
            if(num4 < num5) {
                med = num4;
            } else {
                if(num5 < num3) {
                    med = num3;
                } else {
                    med = num5;
                }
            }
        } else if(num3 < num5) {
            med = num3;
        } else if(num4 > num5) {
            med = num4;
        } else {
            med = num5;
        }

        System.out.println("최대 값: " + max);
        System.out.println("최소 값: " + max);
        System.out.println("중간 값: " + max);

//		6. 사용자가 입력한 정수의 구구단을 출력하세요.(출력 양식 => 2를 입력했을 때 2 * 1 = 2
//													  2 * 2 = 4
//													  .....
//													  2 * 9 = 18
        System.out.println("구구단을 출력할 단수를 입력하세요.");
        int dan = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= 9; i++) {
            System.out.println(dan + "*" + i + "=" + (dan * i));
        }

//		7. 사용자가 입력한 정수로 해당 정수의 팩토리얼을 계산하여 출력하세요.(재귀메소드 없이, while이나 for 반복문을 사용)
        int factorial = 1;

        for(int i = num7; i > 0; i--) {
            factorial += i;
        }

        System.out.println(num7 + "! = " + factorial);

//		8. 사용자가 입력한 10개의 정수 중 소수의 개수를 출력하세요.(소수는 1이랑 본인 말고는 나눠떨어지는 값이 없는 수입니다.)
//		   사용자가 입력할 수 있는 값은 2 ~ 30로 제한
        int[] intArr = new int[10];
        int sosuCnt = 0;

        for(int i = 0; i < intArr.length; i++) {
            System.out.println("2 ~ 30 사이의 정수를 입력하세요.");
            intArr[i] = sc.nextInt();
            sc.nextLine();

            int divisorCnt = 0;

            for(int j = 2; j < intArr[i]; j++) {
                if(intArr[i] % j == 0) {
                    divisorCnt++;
                }
            }

            if(divisorCnt == 0) {
                sosuCnt++;
            }
        }

        System.out.println("소수의 개수: " + sosuCnt);

//		--------------------형 변환--------------------
//		1. 사용자가 두 개의 정수를 입력하면 문자열로 받아서 두 개의 문자열 정수를 정수형으로 변환해서 합을 출력하세요.
        System.out.println("정수를 입력하세요.");
        String str1 = sc.nextLine();

        System.out.println("정수를 입력하세요.");
        String str2 = sc.nextLine();

        System.out.println("두 수의 합: " + (Integer.parseInt(str1) + Integer.parseInt(str2)));

//		2. 사용자가 두 개의 정수(a, b)를 입력해서 a / b의 연산결과를 실수로 출력하세요.(단, b는 0을 입력할 수 없습니다.)
        System.out.println("정수를 입력하세요.");
        int num8 = sc.nextInt();

        System.out.println("정수를 입력하세요.");
        int num9 = sc.nextInt();
        sc.nextLine();

        if(num9 != 0) {
            System.out.println(num8 + " / " + num9 + " = " + ((double)num8 / num9));
        } else {
            System.out.println("분모는 0이 될 수 없습니다.");
        }

//		3. 사용자가 실수 한 개를 입력하면 정수형으로 변환해서 출력하세요.
        System.out.println("실수를 입력하세요.");
        double dNum1 = sc.nextDouble();
        sc.nextLine();

        System.out.println((int)dNum1);

//		4. 사용자가 한 개의 실수를 입력하면 그 실수의 제곱의 결과를 문자열로 변환하여 출력하세요.
        System.out.println(String.valueOf(dNum1));

//		5. int형 변수 iNum = 10과 long형 변수 lNum = 20의 값을 서로 교환하세요.
        int iNum = 10;
        long lNum = 20;
        int temp = iNum;

        iNum = (int)lNum;
        lNum = temp;

//		6. 사용자가 입력한 두 개의 문자 각각의 유니코드를 출력하세요.
        System.out.println("문자를 입력하세요.");
        char ch1 = sc.nextLine().charAt(0);

        System.out.println("문자를 입력하세요.");
        char ch2 = sc.nextLine().charAt(0);

        System.out.println("첫 번째 문자의 유니코드: " + (int)ch1 + ", 두 번째 문자의 유니코드: " + (int)ch2);

//		--------------------연산자--------------------
//
//		1. 사용자가 입력한 두 정수읜 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
//		  (메소드로 따로 만들지 말고 메인메소드에서 구현)
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));

//		2. int형 변수 20을 증감연산자를 사용해서 다음과 같은 순서로 출력되도록 구현하세요. 21, 22, 22, 21, 20, 20, 19, 20
        int num10 = 20;

        System.out.println(++num10);
        System.out.println(++num10);
        System.out.println(num10--);
        System.out.println(num10--);
        System.out.println(num10--);
        System.out.println(++num10);
        System.out.println(--num10);
        System.out.println(++num10);

//		3. 사용자가 입력한 정수가 2와 7의 공배수면 "2와 7의 공배수"라고 출력하고 아니면 "2와 7의 공배수가 아님"이라고 출력하세요.
        if(num10 % 2 == 0 && num10 % 7 == 0) {
            System.out.println("2와 7의 공배수");
        } else {
            System.out.println("2와 7의 공배수가 아님");
        }

//		4. 사용자로부터 입력받은 문자열이 "Hello"인지 아닌지 판별하는 프로그램을 작성하세요.
        System.out.println("문자열을 입력하세요.");
        String hello = sc.nextLine();

        if(hello.equals("Hello")) {
            System.out.println("Hello가 맞습니다.");
        } else {
            System.out.println("Hello가 아닙니다.");
        }

//		5. 삼항연산자를 이용하여 사용자가 입력한 정수가 홀수면 "홀수" 짝수면 "짝수"라고 출력하세요.
        System.out.println("정수를 입력하세요.");
        int num11 = sc.nextInt();

        if(num11 % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

//		6. 삼항연산자의 중첩을 이용하여 사용자가 입력한 정수가 100보다 크면 "100보다 큼" 작으면 "100보다 작음" 같으면 "100"을 출력하세요.
        System.out.println(num11 > 100 ? "100보다 큼" : num11 < 100 ? "100보다 작음" : "100");

//		7. 사용자가 입력한 두 실수의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
        System.out.println("실수를 입력하세요.");
        double dNum2 = sc.nextDouble();

        System.out.println("실수를 입력하세요.");
        double dNum3 = sc.nextDouble();

        System.out.println(dNum2 + " + " + dNum3 + " = " + (dNum2 + dNum3));
        System.out.println(dNum2 + " - " + dNum3 + " = " + (dNum2 - dNum3));
        System.out.println(dNum2 + " * " + dNum3 + " = " + (dNum2 * dNum3));
        System.out.println(dNum2 + " / " + dNum3 + " = " + (dNum2 / dNum3));
        System.out.println(dNum2 + " % " + dNum3 + " = " + (dNum2 % dNum3));

//		8. 사용자가 입력한 하나의 문자열과 하나의 정수로 "입력한 문자열 xxxxx이고, 입력한 숫자는 xxxxxx입니다." 라고 출력하세요.
        System.out.println("문자열을 입력하세요.");
        String str = sc.nextLine();

        System.out.println("정수를 입력하세요.");
        int num12 = sc.nextInt();
        sc.nextLine();

        System.out.println("입력한 문자열은 " + str + "이고, 입력한 숫자는 " + num12 + "입니다.");

//		--------------------조건문--------------------
//		1. 사용자가 입력한 두 정수 중에서 큰 정수를 출력하세요.
        System.out.println("정수를 입력하세요.");
        int num13 = sc.nextInt();
        sc.nextLine();

        max = num12;

        if(num13 > max) {
            max = num13;
        }

        System.out.println(num12 + "와 " + num13 + "중 큰수는 " + max);

//		2. 사용자가 입력한 정수가 양수면 "양수" 음수면 "음수"라고 출력하세요.
        if(num13 > 0) {
            System.out.println("양수");
        } else {
            System.out.println("음수");
        }

//		3. 사용자가 입력한 문자열이 "Java"인 경우 "좋아하는 언어입니다."를 출력하고, "Python"인 경우 "공부중인 언어입니다."를 출력하고, 그렇지 않은 경우 "다른 언어를 공부해보세
//		     요."를 출력하세요.(switch~case~default 사용)
        System.out.println("프로그래밍 언어를 입력하세요.");
        String programmingLanguage = sc.nextLine();

        switch(programmingLanguage) {
            case "Java":
                System.out.println("좋아하는 언어입니다.");
                break;
            case "Python":
                System.out.println("공부중인 언어입니다.");
                break;
            default:
                System.out.println("다른 언어를 공부해보세요.");
        }

//		4. 사용자가 입력한 숫자가 3의 배수면 "3의 배수입니다."라고 출력하고 3의 배수가 아니면 "3의 배수가 아닙니다."를 출력하세요.(switch~case~default 사용)
        if(num13 % 3 == 0) {
            System.out.println(num13 + "은(는) 3의 배수입니다.");
        } else {
            System.out.println(num13 + "은(는) 3의 배수가 아닙니다.");
        }

//		5. 사용자가 입력한 숫자가 홀수인 경우 "홀수입니다."를 출력하고, 짝수인 경우 "짝수입니다."를 출력하는 프로그램을 작성하세요.
        if(num13 % 2 == 1) {
            System.out.println(num13 + "은(는) 홀수입니다.");
        } else {
            System.out.println(num13 + "은(는) 짝수입니다.");
        }

//		6. 사용자가 입력한 5개의 정수중 가장 큰 수를 출력하세요.
        int[] intArr2 = new int[5];

        for(int i = 0; i < intArr2.length; i++) {
            System.out.println("정수를 입력하세요.");
            intArr2[i] = sc.nextInt();
            sc.nextLine();
        }

        max = intArr2[0];

        for(int i = 1; i < intArr2.length; i++) {
            if(intArr2[i] > max) {
                max = intArr2[i];
            }
        }

        System.out.println("입력한 숫자 중 가장 큰 숫자는: " + max);

//		7. 사용자가 입력한 문자열이 "Yes"인 경우 "예"를 출력하고, "No"인 경우 "아니오"를 출력하고, 그 외의 경우에는 "잘못 입력하셨습니다."를 출력하세요.
        System.out.println("문자열을 입력하세요.");
        String str3 = sc.nextLine();

        if(str3.equalsIgnoreCase("Yes")) {
            System.out.println("예");
        } else if(str3.equalsIgnoreCase("No")) {
            System.out.println("아니오");
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }

//		8. 사용자가 입력한 두 정수를 비교하여 같으면 "두 수가 같습니다." 첫 번째 수가 더 크면 "첫 번째 수가 더 큽니다." 두 번째 수가 더 크면 "두 번째 수가 더 큽니다."를 출력하세요.
        System.out.println("정수를 입력하세요.");
        int num14 = sc.nextInt();
        sc.nextLine();

        System.out.println("정수를 입력하세요.");
        int num15 = sc.nextInt();
        sc.nextLine();

        if(num14 != num15) {
            if(num14 > num15) {
                System.out.println("첫 번째 수가 더 큽니다.");
            } else {
                System.out.println("두 번째 수가 더 큽니다.");
            }
        } else {
            System.out.println("두 수가 같습니다.");
        }

//		9. 사용자가 입력한 세 정수가 모두 짝수인 경우 "모두 짝수입니다." 모두 홀수인 경우 "모두 홀수입니다." 그 외의 경우 "짝수 : xxx개, 홀수 : xxx개 입니다."를 출력하세요.
        System.out.println("정수를 입력하세요.");
        int num16 = sc.nextInt();
        sc.nextLine();

        int evenCnt = 0;
        int oddCnt = 0;

        if(num14 % 2 == 0) {
            evenCnt++;
        } else {
            oddCnt++;
        }

        if(num15 % 2 == 0) {
            evenCnt++;
        } else {
            oddCnt++;
        }

        if(num16 % 2 == 0) {
            evenCnt++;
        } else {
            oddCnt++;
        }

        if(evenCnt == 3) {
            System.out.println("모두 짝수입니다.");
        } else {
            if(oddCnt == 3) {
                System.out.println("모두 홀수입니다.");
            } else {
                System.out.println("짝수: " + evenCnt + "개, 홀수: " + oddCnt + "개");
            }
        }

//		--------------------반복문--------------------
//		1. 1부터 10까지의 정수의 합을 출력하세요.
        int sum = 0;

        for(int i = 1; i <= 10; i++) {
            sum += i;
        }

        System.out.println("1 ~ 10까지의 합: " + sum);

//		2. 2의 거듭제곱을 10회동안 반복하며 출력하세요.(2 * 2 = 4, 2 * 2 * 2 = 8 .....) 10회 반복 출력
        for(int i = 1; i < 10; i++) {
            int result = 2;
            System.out.print("2 * ");
            for(int j = 0; j < i; j++) {
                if(j != i - 1)
                    System.out.print("2 * ");
                else
                    System.out.print("2 = ");

                result *= 2;
            }
            if(i < 9)
                System.out.print(result + ", ");
            else
                System.out.print(result);
        }

//		3. 사용자가 입력한 정수까지의 모든 소수를 출력하세요.
        System.out.println("정수를 입력하세요.");
        int num17 = sc.nextInt();
        sc.nextLine();

        for(int i = 2; i <= num17; i++) {
            int divisorCnt = 0;

            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    divisorCnt++;
                }
            }

            if(divisorCnt == 0) {
                System.out.print(i + ", ");
            }
        }

//		4. 사용자가 입력한 정수의 약수를  출력하세요.
        for(int i = 1; i <= num17; i++) {
            if(num17 % i == 0) {
                System.out.println(i + ",");
            }
        }

//		5. 사용자가 입력한 10개의 정수를 역순으로 출력하세요.(배열 사용)
        int[] intArr3 = new int[10];

        for(int i = 0; i < intArr3.length; i++) {
            System.out.println("정수를 입력하세요.");
            intArr3[i] = sc.nextInt();
            sc.nextLine();
        }

        for(int i = intArr3.length - 1; i >= 0; i--) {
            System.out.println(intArr3[i]);
        }

//		6. 사용자가 입력한 문자열을 역순으로 출력하세요.
        System.out.println("문자열을 입력하세요.");
        String str4 = sc.nextLine();

        for(int i = str4.length() - 1; i >= 0; i--) {
            System.out.print(str4.charAt(i));
        }
        System.out.println();

//		7. 사용자가 입력한 두 정수의 최소공배수와 최대공약수를 출력하세요.
        System.out.println("정수를 입력하세요.");
        int num18 = sc.nextInt();
        sc.nextLine();

        System.out.println("정수를 입력하세요.");
        int num19 = sc.nextInt();
        sc.nextLine();

        int gcd = 0;
        int lcm = 0;


        for(int i = 1; i <= (num18 > num19 ? num19 : num18); i++) {
            if(num18 % i == 0 && num19 % i == 0) {
                gcd = i;
            }
        }

        for(int j = (num18 > num19 ? num18 : num19); j <= num18 * num19; j++) {
            if(j % num18 == 0 && j % num19 == 0) {
                lcm = j;
            }
        }

//		8. 중첩 for문으로 이용해서 다음과 같이 출력하세요.
//
//		8-1. *
//		     **
//		     ***
//		     ****
//		     *****
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if(i >= j)
                    System.out.print("*");
            }
            System.out.println();
        }

//		8-2. *****
//		      ****
//		       ***
//		        **
//		         *
    for(int i = 0; i < 5; i++) {
        for(int j = 0; j < 5; j++) {
            if(i < j) {
                System.out.print("*");
            } else
                System.out.print(" ");
        }
        System.out.println();
    }

//		9. 사용자가 q를 입력하기 전까지 계속 반복하면서 입력한 정수의 값을 더해서 출력하세요.
        int sum2 = 0;

        while(true) {
            System.out.println("정수를 입력하세요. (q 또는 Q 입력 시 종료)");
            String input = sc.nextLine();
            if(input.equalsIgnoreCase("q")) {
                System.out.println("지금까지 입력한 숫자의 총합: " + sum2);
                break;
            }

            System.out.println(input);
            sum2 += Integer.parseInt(input);
        }
    }
}
