package homework04.basic.person;

public class ChildA extends Parent {

	String name;
	
	public ChildA() {
		
	}

	public ChildA(String firstName, String bloodType, String skinColor, String name) {
		super(firstName, bloodType, bloodType);
		this.name = name;
	}
	
}
