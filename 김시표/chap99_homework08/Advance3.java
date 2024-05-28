package chap99_homework08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Advance3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> intList = 
				new ArrayList<Integer>();
	
	for(int i = 0; i < 5; i++) {
		System.out.print("정수를 입력하세요.");
		intList.add(sc.nextInt());
	}
	
	int sum = intList.get(0) + intList.get(1);
	
	int a = intList.get(0);
	int b = intList.get(1);
	
	for(int i = 0; i < intList.size(); i++) {
		for(int j = i + 1; j < intList.size(); j++) {
			if(intList.get(i) + intList.get(j) > sum) {
				sum = intList.get(i) + intList.get(j);
				a = intList.get(i);
				b = intList.get(j);
			}
		}
	}
	
	System.out.println("합 : " + sum 
					+ ", " + a + ", " + b);
	sc.close();

	}

}
