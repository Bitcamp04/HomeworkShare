package chap99_homework07;

public class Basic {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("Kim");
		StringBuffer sb2 = new StringBuffer("si");
		StringBuffer sb3 = new StringBuffer("pyo");
		
		sb1.append(sb2).append(sb3);		
		
		System.out.println(sb1);
	}
}