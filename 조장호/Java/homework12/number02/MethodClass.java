package homework12.number02;

public class MethodClass {

	// 3. 두 문자열을 전달받아 합쳐진 새로운 문자열을 리턴하는 메소드를 구현하세요.
	public static String concatStr(String s1, String s2) {
		return s1 + s2;
	}
	
	// 4. 정수 한 개와 실수 한 개를 전달받아 소수점 두자리까지만 가지는 곱의 결과를 리턴하는 메소드를 구현하세요.
	public static double roundTwoNumber(int num1, double num2) {
		return (double) Math.round(num1 * num2 * 100) / 100;
	}
}
