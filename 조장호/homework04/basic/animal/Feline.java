package homework04.basic.animal;
// 1.
// 고양이과 클래스
public class Feline extends Mammalia {

	public Feline() {
		
	}
	
	// 고양이과는 혀로 털을 관리합니다.
	public void grooming() {
		System.out.println("고양이과는 혀로 털을 관리합니다.");
	}
	
	// 고양이과는 날카로운 발톱을 가지고 있습니다.
	public void hasSharpClaws() {
		System.out.println("고양이과는 날카로운 발톱을 가지고 있습니다.");
	}
}
