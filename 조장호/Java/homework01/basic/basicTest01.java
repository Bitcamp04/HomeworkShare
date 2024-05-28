package homework01.basic;

public class basicTest01 {

	/*
	 * 1. int num = 10;을 선언하고 증감연산자를 통해 다음과 같이 출력하세요. 출력된 값은 모두 증감연산자가 포함된 상태입니다.
				    11
				    12
				    12
				    10
				    10
				     8
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		System.out.println(++num);
		System.out.println(++num);
		System.out.println(num--);
		System.out.println(--num);
		System.out.println(num--);
		System.out.println(--num);
	}

}
