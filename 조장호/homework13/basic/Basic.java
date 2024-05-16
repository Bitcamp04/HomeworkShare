package homework13.basic;

public class Basic {
	
	
	// 1. 매개변수로 받아온 정수배열에서 짝수만 찾아서 출력하는 printEvenNum을 람다식으로 구현하세요.
	// PrintNumber 함수형 인터페이스 생성, printEnvenNum(int[] numArr) 추상 메소드로 선언.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printEvenNum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, numArr -> {
			
			for(int i = 0; i < numArr.length; i++) {
				if(numArr[i] % 2 == 0) {
					System.out.println(i + "번째 인덱스 : " + numArr[i]);
				}
			}
		});
	}

//	@Override
//	public void printEnvenNum(int[] numArr) {
//		// TODO Auto-generated method stub
//		
//	}
	public static void printEvenNum(int[] numArr, PrintNumber printNumber) {
		
		printNumber.printEnvenNum(numArr);
	}
	
}
