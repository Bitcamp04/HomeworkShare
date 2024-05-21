package homework._2024_04_30;

import java.util.Random;
import java.util.Scanner;

public class Advanced {
    public static void main(String[] args) {
        RockScissPaper rockScissPaper = new RockScissPaper();
        rockScissPaper.start();
    }

}

class RockScissPaper {

    private Scanner sc = new Scanner(System.in);

    private Random rd = new Random();


    private boolean isExit = false;


    private int gameCnt = 0;

    private int winCnt = 0;

    private int drawCnt = 0;

    private int loseCnt = 0;


    //게임을 시작하는 메소드
    public void start() {
        int user;
        int computer;
        gameCnt--;
        do {
            System.out.print("가위 바위 보 를 입력해 주시오:");
            user = sc.nextInt();
            if (!(user >= 0 && user <= 3)) {
                System.out.println("잘못된 입력입니다");
                continue;
            }
            computer = rd.nextInt(3);
            printCom(computer);
            judgeWDL(user, computer);
            gameCnt++;
        } while (user != 3);
        System.out.println("총 " + gameCnt + "번 게임 하였고");
        System.out.println("사용자가 " + winCnt + "번 이기고");
        System.out.println(drawCnt + "번 비겼으며");
        System.out.println(loseCnt + "번 졌습니다.");

    }


    //승무패 판단해주는 메소드

    public void judgeWDL(int user, int com) {
//        switch (user){
//            case 0:
//                switch (com){
//                    case 0:
//                        drawCnt++;
//                        System.out.println("비겼습니다.");
//                        break;
//                    case 1:
//                        loseCnt++;
//                        System.out.println("졌습니다.");
//                        break;
//                    case 2:
//                        winCnt++;
//                        System.out.println("이겼습니다.");
//                        break;
//                }
//                break;
//            case 1:
//                switch (com){
//                    case 0:
//                        winCnt++;
//                        System.out.println("이겼습니다..");
//                        break;
//                    case 1:
//                        drawCnt++;
//                        System.out.println("비겼습니다.");
//                        break;
//                    case 2:
//                        loseCnt++;
//                        System.out.println("졌습니다.");
//                        break;
//                }
//                break;
//            case 2:
//                switch (com){
//                    case 0:
//                        loseCnt++;
//                        System.out.println("졌습니다..");
//                        break;
//                    case 1:
//                        winCnt++;
//                        System.out.println("이겼습니다..");
//                        break;
//                    case 2:
//                        drawCnt++;
//                        System.out.println("비겼습니다..");
//                        break;
//                }
//                break;
//        }
        if (user == com) {
            drawCnt++;
            System.out.println("비겼습니다.");
        } else if ((user == 0 && com == 2) ||
                (user == 1 && com == 0) ||
                (user == 2 && com == 1)) {
            winCnt++;
            System.out.println("이겼습니다.");
        } else {
            loseCnt++;
            System.out.println("졌습니다.");
        }
    }


    //컴퓨터 가위, 바위, 보 출력해주는 메소드

    public void printCom(int com) {
        switch (com) {
            case 0:
                System.out.println("컴퓨터가 가위를 냈습니다.");
                break;
            case 1:
                System.out.println("컴퓨터가 바위를 냈습니다.");
                break;
            case 2:
                System.out.println("컴퓨터가 보를 냈습니다.");
                break;
            default:
                break;
        }
    }

}