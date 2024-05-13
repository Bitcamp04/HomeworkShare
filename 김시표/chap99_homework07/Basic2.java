package chap99_homework07;

public class Basic2 {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("hello");
		
		int L = 30 - sb.length();
		
		for(int i = 0; i < L; i++) {
			sb.append('a');			
			System.out.println(sb);
		}
	}
}

