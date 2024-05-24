package homework12.number02;

//1. 학생의 이름, 학번, 학과를 속성으로 가지고 학생의 정보를 저장하는 메소드와 학생의 정보를 출력하는 메소드를 갖는 학생 클래스를 생성하세요.
public class Student {

	private String name;
	private int sno;
	private String major;
	
	public Student(){
		
	}
	
	public Student(String name, int sno, String major) {
		this.name = name;
		this.sno = sno;
		this.major = major;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public void studentInfo() {
		System.out.println("이름 : " + name);
		System.out.println("학번 : " + sno);
		System.out.println("학번 : " + major);
	}
}
