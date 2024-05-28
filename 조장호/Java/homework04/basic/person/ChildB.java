package homework04.basic.person;

public class ChildB extends Parent{

	String fingerPrint;
	
	ChildB(){
		
	}
	
	public ChildB(String firstName, String bloodType, String skinColor, String fingerPrint) {
		super(firstName, bloodType, bloodType);
		this.fingerPrint = fingerPrint;
	}
}
