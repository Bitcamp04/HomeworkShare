package chap99_homework05.middle;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicates A = new RemoveDuplicates();
		Scanner c = new Scanner(System.in);
		String st = c.next();
		System.out.println(A);
		

	}
	public String solution(String str) {
		String answer = "";
		
		for (int i = 0; i < st.length(); i++) {
		      if (st.indexOf(st.charAt(i)) == i) //같을 때만 리턴, 중복되지 않은 문자만 카운트
		          answer += st.charAt(i);
		      }
		      return answer;
		    }
	
	
}

