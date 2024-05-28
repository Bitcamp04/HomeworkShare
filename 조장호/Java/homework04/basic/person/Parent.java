package homework04.basic.person;
/* 
 * 2. 성씨, 혈액형, 키, 피부색을 속성으로 가지는 Parent 클래스를 생성하고 
 * Parent를 상속받은 ChildA, ChildB 클래스를 만들어서 ChildA에는 이름 속성을 추가하고 ChildB에는 지문 속성을 추가하세요.
 * 
 */
public class Parent {

	// 성씨
	String firstName;
	// 혈액형
	String bloodType;
	// 피부색
	String skinColor;
	
	public Parent() {
		
	}

	public Parent(String firstName, String bloodType, String skinColor) {
		this.firstName = firstName;
		this.bloodType = bloodType;
		this.skinColor = skinColor;
	}
	
	
}
