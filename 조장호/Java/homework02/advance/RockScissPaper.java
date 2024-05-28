package homework02.advance;

import java.util.Random;
import java.util.Scanner;

public class RockScissPaper {

	// 1. 가위, 바위, 보 게임을 RockScissPaper 클래스로 만드세요.
	// 컴퓨터가 0(가위), 1(바위), 2(보) 중 랜덤값을 하나 선택하고
	// 사용자가 가위, 바위, 보를 입력해서 사용자가 이기면 이겼습니다. 지면 졌습니다. 비기면 비겼습니다.를 출력하세요.
	// 사용자가 3을 입력하면 게임이 종료되면서 몇전 몇승 몇무 몇패인지 출력하세요.
	
	private Scanner sc = new Scanner(System.in);
	private Random rd = new Random();

	private boolean isExit = false;

	private int gameCnt = 0;
	private int winCnt = 0;
	private int drawCnt = 0;
	private int loseCnt = 0;

	
	//게임을 시작하는 메소드
	public void start() {
		isExit = true;
		
		while(isExit) {
			System.out.println("가위(0) 바위(1) 보(2) 숫자를 입력해 주세요. 3 : 게임종료");
			int userRCP = sc.nextInt();
			
			int computerNum = rd.nextInt(2);
			if(userRCP >= 0 && userRCP <= 2) {
				printCom(computerNum);
				judgeWDL(userRCP, computerNum);
				gameCnt++;
			} else if(userRCP == 3){
				System.out.println("전적 : " + gameCnt + " 전 " + winCnt + " 승 " + drawCnt + " 무 " + loseCnt + " 패");
				System.out.println("게임이 종료됩니다.");
				isExit = false;
			} else {
				System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
				
			}
			
		}

	}

	

	//승무패 판단해주는 메소드

	public void judgeWDL(int user, int com) {
		if(user == com) {
			System.out.println("비겼습니다.");
			drawCnt++;
		} else if((user == 0 && com == 2) || (user == 1 && com == 0) || (user == 2 && com == 1)) {
			System.out.println("이겼습니다.");
			winCnt++;
		} else {
			System.out.println("졌습니다.");
			loseCnt++;
		}

	}

	

	//컴퓨터 가위, 바위, 보 출력해주는 메소드
	public void printCom(int com) {
		if(com == 0) {
			System.out.println("컴퓨터는 가위를 냈습니다.");
		} else if(com == 1) {
			System.out.println("컴퓨터는 바위를 냈습니다.");
		} else {
			System.out.println("컴퓨터는 보를 냈습니다.");
		}

	}

}
