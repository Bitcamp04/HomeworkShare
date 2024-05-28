package homework02.basic;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.
		System.out.println(sum(10));
		
		ConcatString cs = new ConcatString();
		// 2.
		System.out.println(cs.concatStr("a", "b"));
		// 3.
		System.out.println(cs.concatStr("a", "b", 1));
		// 4.
		reverseArr(new int[] {10, 20, 30, 40, 50});
	}

	// 1.int 값을 하나 매개변수로 전달받아서 1부터 매개변수로 전달된 값까지의 총합을 구해서 총합을 리턴하는 메소드를 구현하세요.
	// 실행클래스의 메인메소드 아래에 static 메소드로 선언하세요.
	// static의 위치는 접근제어자와 리턴타입 사이입니다. (예시 public static void add(int a, int b) { return a + b; })
	public static int sum(int lastNum) {
		int sum = 0;
		for(int i = 1; i <= lastNum; i++) {
			sum += i;
		}
		return sum;
	}
	
	// 4. int 배열 한 개를 매개변수로 받아서 인덱스 역순으로 출력하는 메소드를 구현하세요. 
	// 실행클래스의 메인메소드 아래에 static 메소드로 선언하세요.
	// static의 위치는 접근제어자와 리턴타입 사이입니다. (예시 public static void add(int a, int b) { return a + b; })
	public static void reverseArr(int[] inputArr) {
		for(int i = inputArr.length - 1; i >= 0; i--) {
			System.out.println("inputArr[" + i +" ] = " + inputArr[i]);
		}
	}
}
