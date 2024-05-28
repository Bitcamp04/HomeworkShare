package homework11.basic;

import java.util.ArrayList;
import java.util.List;

import homework11.basic.threads.NumberPrinter;
import homework11.basic.threads.NumberSyncThread01;
import homework11.basic.threads.NumberSyncThread02;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> thirtyChild = new ArrayList<Integer>();
		Thread subThread = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 1; i <= 20; i++) {
					if(30 % i == 0) {
						thirtyChild.add(i);
					}
				}
				System.out.println(thirtyChild);
			}
		});
		
		System.out.println("=========================== 1. , 2. ===========================");
		subThread.run();
		try {
			// 2. 1번 문제에서 join()메소드를 이용해서 서브 스레드가 먼저 실행돼서 끝난 후에 메인 스레드가 실행되도록 구현하세요.
			subThread.join();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		// 1. 메인스레드는 1~20까지 3과 4의 공배수를 출력하는 작업을 하고 
		// 1~20까지의 숫자중 30의 약수를 출력하는 서브 스레드를 하나 갖는다. 각각의 스레드를 실행하십시오.
		for(int i = 1; i <= 20; i++) {
			if(i % 3 == 0 && i % 4 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("=========================== 3. , 4. , 5. ===========================");
		// 4. 3번 문제에서 첫 스레드의 공유객체 점유가 끝날때까지 두 번째 스레드를 실행하지 못하도록 잠금 상태로 만드세요.
		// 3. NumberPrint : 공유객체
		// 	  NumberSyncThread01, NumberSyncThread02 : 공유객체 사용할 클래스들
		NumberPrinter np = new NumberPrinter();
		
		NumberSyncThread01 nst01 = new NumberSyncThread01();
		NumberSyncThread02 nst02 = new NumberSyncThread02();
		
		nst01.setNumberPrinter(np);
		nst02.setNumberPrinter(np);
		
		nst01.start();
		nst02.start();

	}

}
