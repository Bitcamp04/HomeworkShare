package homeWork.homework07.basic;

import java.util.Scanner;

public class basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1= new StringBuffer();
		
		Scanner sc= new Scanner(System.in);
		String li;
		
		for(int i=0;i<3;i++) {
			System.out.println("문자열입력");
			li=sc.nextLine();
			sb1.append(li);
		}
		
		System.out.println(sb1);
		
		
		
		StringBuffer sb2= new StringBuffer(30);
		sb2.append("hello");
		int reminBfSz=sb2.capacity()-sb2.length();
		
		for(int i=0;i<reminBfSz;i++) {
			sb2.append("a");
		}
		
		System.out.println(sb2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
