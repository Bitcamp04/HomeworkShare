package homework04.basic.animal;

// 사자 클래스
public class Lion extends Feline{

	public Lion() {
		
	}

	// 사자는 육식동물입니다.
	public void carnivore() {
		System.out.println("사자는 육식동물입니다.");
	}
	
	// 사자는 최고 시속 60km/h로 달릴 수 있습니다.
	public void maxSpeed() {
		System.out.println("사자는 최고 시속 60km/h로 달릴 수 있습니다.");
	}
}
