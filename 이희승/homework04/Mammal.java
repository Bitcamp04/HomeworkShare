package homeWork.homework04;

public class Mammal {
	int lifeSpan;
	int age;
	String size;
	boolean haswing;
	
public Mammal() {
		
	}
	
	public Mammal(int age,String size,boolean hasWing,int lifeSpan) {
		this.age=age;
		this.size=size;
		this.haswing=hasWing;
		this.lifeSpan=lifeSpan;
	}
	
	public void eat() {
		System.out.println("먹이를 먹는다");
	}
	
	public void sleep() {
		System.out.println("잠을잔다");
	}
	
}
