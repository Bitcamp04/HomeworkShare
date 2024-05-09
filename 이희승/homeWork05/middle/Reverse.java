package homeWork.homeWork05.middle;

import java.util.Scanner;

public  class Reverse {
	
	public static String[]Reverse(String str) {
		
		String[] Arr= new String[str.length()];
		for (int j=str.length() -1;j >= 0;j--) {
			
			Arr[str.length()-1-j]=str.charAt(j)+"";
			
			
			}
		return Arr ;
	
		
		
		
	} 
	



}