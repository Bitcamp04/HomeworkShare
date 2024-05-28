package homework04.basic.animal;

/*
 * 1. 포유류 클래스  
   고양이과 클래스
   호랑이, 사자 클래스를 
   제작하고 상속관계로 연결하세요
   각 클래스 마다 기본생성자 하나와 2개의 메서드를 
   알아서 구현하면 됩니다.
 */
// 포유류 클래스
public class Mammalia {

	public Mammalia() {
		
	}
	
	// 수유를 한다.
	public void lactation() {
		System.out.println("포유류는 수유를 합니다.");
	}
	// 털이 있음.
	public void hairiness() {
		System.out.println("포유류는 털이 있습니다.");
	}
}
