package homework09.basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Map<String, Integer>을 하나 생성하여 key는 알파벳(대소문자 구분) 
		// value는 해당 알파벳의 유니코드 값을 Integer형태로 저장하세요.
		Map<String, Integer> alphabetMap = new HashMap<String, Integer>();
		for(int i = 65; i <= 90; i++) {
			char unicode = (char) i;
			alphabetMap.put("" + unicode, i);
		}
		
		for(int i = 97; i <= 122; i++) {
			char unicode = (char) i;
			alphabetMap.put("" + unicode, i);
		}
		
		System.out.println(alphabetMap.toString());
		
		// 2. 이름과 전화번호를 쌍으로 하는 주소록을 HashMap으로 구현하고
		// , 특정 이름의 전화번호를 조회하는 기능을 구현하세요.
		Map<String, String> namePhoneMap = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("번호를 조회할 이름을 입력하세요.");
		String inputName = sc.nextLine();
		
		Set<Entry<String, String>> npSet =  namePhoneMap.entrySet();
		Iterator<Entry<String, String>> npIterator = npSet.iterator();
		
		while(npIterator.hasNext()) {
			Entry<String, String> tempEntry = npIterator.next();
			System.out.println("조회하신 이름의 전화번호 목록");
			if(tempEntry.getKey().equals(inputName)) {
				System.out.println(tempEntry.getValue()); 
			}
		}
		
		sc.close();
	}

}
