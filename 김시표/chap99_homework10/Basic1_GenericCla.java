package chap99_homework10;

public class Basic1_GenericCla<T> {
//	1. 멤버변수로 private T t를 가지면서 getT(), setT()
//	 메소드를 갖는 제네릭클래스 GenericCla를 생성하세요.
	
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}
