package homework12.number02;

public class Circle {
	
	private final double PI = 3.14;
	private int radius;
	
	Circle(){
		
	}
	
	Circle(int radius){
		this.radius = radius;
	}
	
	public void returnRound() {
		System.out.println("원의 둘레 : " + 2 * PI * radius);
	}
	
	public void returnArea() {
		System.out.println("원의 넓이 : " + PI * radius * radius);
	}
}
