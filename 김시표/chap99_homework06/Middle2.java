package chap99_homework06;

import java.util.Scanner;

public class Middle2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] chArr = {'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l', 't'};

				String[] strArr = {"", "", "", ""};

				for(int i = 0; i < chArr.length; i++) {
					if(i % 4 == 0) {
						strArr[0] += chArr[i];
					} else if(i % 4 == 1) {
						strArr[1] += chArr[i];
					} else if(i % 4 == 2) {
						strArr[2] += chArr[i];
					} else if(i % 4 == 3) {
						strArr[3] += chArr[i];
					}
				}

				for(String s : strArr) {
					System.out.println(s);
				}
						
		String bit = "bit";
		String com = "com";
		String sql = "sql";
		String intStr = "int";
		
		char[] charArr2 = new char[12];
		
		for(int i = 0; i < charArr2.length; i++) {
			if(i % 4 ==0) {
				charArr2[i] = bit.charAt(i / 4);
			} else if(i % 4 ==1) {
				charArr2[i] = com.charAt(i / 4);
			} else if(i % 4 ==2) {
				charArr2[i] = sql.charAt(i / 4);
			} else {
				charArr2[i] = intStr.charAt(i / 4);
			}
		}
		
		for(char c : charArr2) {
			System.out.println(c + ", ");
		}
		
		sc.close();

	}

}
