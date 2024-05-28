package chap99_homework09;

import java.util.HashMap;
import java.util.Map;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> alp = new HashMap<>();
		for(char ch = 'A'; ch <= 'Z' ; ch++) {
			alp.put(String.valueOf(ch),(int)ch);
		}
		for(char ch = 'a'; ch <= 'z' ; ch++) {
			alp.put(String.valueOf(ch),(int)ch);
		}
		for(Map.Entry<String, Integer> entry : alp.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}

	}

}
