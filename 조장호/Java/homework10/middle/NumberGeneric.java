package homework10.middle;

// 2.  Number 클래스를 상속받은 클래스만 지정가능한 제네릭 클래스를 만들고
// T 배열을 매개변수로 받아서 합, 차, 곱셈, 나눗셈을 연산해주는 메소드를 구현하세요.
// 각 메소드는 double로 리턴하고 add, sub, mul, div로 메소드명을 갖습니다.
// (Math.round()로 소수점 두자리까지만 표출)
public class NumberGeneric<T extends Number> {

	// 덧셈
	public double add(T[] numberArr) {
		double returnValue = 0.0;
		for(int i = 0; i < numberArr.length; i++) {
			returnValue += numberArr[i].doubleValue();
		}
		
//		System.out.println("덧셈 : " + (double) Math.round(returnValue * 100) / 100);
		return (double) Math.round(returnValue * 1000) / 1000;
	}
	
	// 뺄셈
	public double sub(T[] numberArr) {
		double returnValue = 0.0;
		for(int i = 0; i < numberArr.length; i++) {
			returnValue -= numberArr[i].doubleValue();
		}
//		System.out.println("ㅃ" + returnValue);
		return (double) Math.round(returnValue * 1000) / 1000;
	}
	
	// 곱셈
	public double mul(T[] numberArr) {
		double returnValue = 1.0;
		for(int i = 0; i < numberArr.length; i++) {
			returnValue *= numberArr[i].doubleValue();
		}
//		System.out.println("ㄱ" + returnValue);
		return (double) Math.round(returnValue * 1000) / 1000;
	}
	
	// 나눗셈
	public double div(T[] numberArr) {
		double returnValue = 1.0;
		for(int i = 0; i < numberArr.length; i++) {
			returnValue /= numberArr[i].doubleValue();
		}
//		System.out.println("ㄴ" + returnValue);
		return (double) Math.round(returnValue * 1000) / 1000;
	}
}
