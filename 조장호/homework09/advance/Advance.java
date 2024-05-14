package homework09.advance;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 사용자가 입력한 문자열에서 가장 많이 등장하는 문자와 그 개수를 출력하세요.
	    // (Map<Character, Integer> 형태의 Map과 Entry 사용)
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력해 주세요.");
		String inputStr = sc.nextLine();
		
		Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		// 값을 안 넣은 상태의 변수
//		Iterator<Entry<Character, Integer>> charCountIterator = charCountMap.entrySet().iterator();
		
		System.out.println("입력한 문자열의 길이 : " + inputStr.length());
		
		for(int i = 0; i < inputStr.length(); i++) {
			if(!charCountMap.keySet().contains(inputStr.charAt(i))) {
				charCountMap.put(inputStr.charAt(i), 1);
			} else {
				charCountMap.put(inputStr.charAt(i), charCountMap.get(inputStr.charAt(i)) + 1);
			}
		}
		System.out.println(charCountMap);
		
		char maxChar = 0;
		int maxCount = 0;
		// 값을 넣은 상태의 변수
		Iterator<Entry<Character, Integer>> charCountIterator = charCountMap.entrySet().iterator();
		while(charCountIterator.hasNext()) {
			Entry<Character, Integer> tempEntry = charCountIterator.next();
			if(tempEntry.getValue() > maxCount) {
				maxChar =  tempEntry.getKey();
				maxCount = tempEntry.getValue();
			}
		}
		
		System.out.println("입력하신 문자열에서 가장 많이 사용한 문자는 : " + maxChar + " , 그 갯수는 : " + maxCount + "개 입니다.");
		sc.close();
	}

}
