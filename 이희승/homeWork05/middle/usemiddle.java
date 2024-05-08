package homeWork.homeWork05.middle;

import java.util.Scanner;

public class usemiddle {
	private static String muja;
	private static String[] index;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String[] nArr= new String[1];
			Scanner sc = new Scanner(System.in);
			Reverse ss=new Reverse();
			System.out.println("문자열입력");
			muja=sc.nextLine();
			index=new Reverse().Reverse(muja);
			for(String a : index) {
			    System.out.println(a);
			}
		
		
	}

}
