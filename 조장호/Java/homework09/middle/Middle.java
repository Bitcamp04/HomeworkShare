package homework09.middle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 학생이름을 key로 시험점수를 value로 가지는 Map<String, Integer>를 생성하고
		// 4명의 학생 데이터를 입력한 후 4명 중 최고 점을 맞은 학생의 이름과 점수을 출력하세요.(이름 : 90)
		Map<String, Integer> studentScoreMap = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		
		String studentName = "";
		int studentScore = 0;
		for(int i = 0; i < 4; i++) {
			System.out.println((i + 1) + "번째 학생이름을 입력해 주세요.");
			studentName = sc.nextLine();
			System.out.println((i + 1) + "번째 학생점수를 입력해 주세요.");
			studentScore = sc.nextInt();
			studentScoreMap.put(studentName, studentScore);
			studentName = sc.nextLine();
		}
		
		int maxScore = 0;
		String maxStuentName = "";
		
		for(Entry<String, Integer> studentEntry : studentScoreMap.entrySet()) {
			if(studentEntry.getValue() > maxScore) {
				maxScore = studentEntry.getValue();
				maxStuentName = studentEntry.getKey();
			}
		}
		
		System.out.println("최고점수는 : "+ maxScore + ", 학생이름은 : " + maxStuentName + "입니다.");
		sc.close();
		
		// 2. 매개변수로 Map<Integer, Integer>이 주어졌을 때 
		// key, value의 곱이 가장 큰 Entry를 리턴하는 메소드 getMaxMul을 구현하세요.
		Map<Integer, Integer> integerMap = new HashMap<Integer, Integer>();
		integerMap.put(5, 9);
		integerMap.put(4, 3);
		integerMap.put(7, 8);
		integerMap.put(6, 2);
		Entry<Integer, Integer> getEntry = getMaxMul(integerMap);
		System.out.println("key, value 곱 가장 큰 Entry : " + getEntry.toString());
		
		// 3. Map<Integer, Integer>을 매개변수로 받아서 key는 정순 출력, value는 역순 출력하는 printKVDesc라는 메소드를 구현하세요. 
		// {1: 3, 2: 4, 3: 5}
		// 1 : 5
		// 2 : 4
		// 3 : 3
		Map<Integer, Integer> keyValue = new HashMap<Integer, Integer>();
		keyValue.put(1, 3);
		keyValue.put(2, 4);
		keyValue.put(3, 5);
		printKVDesc(keyValue);
		
	}
	
	public static Entry<Integer, Integer> getMaxMul(Map<Integer, Integer> parameterMap){
		Entry<Integer, Integer> returnEntry = null;
		Iterator<Entry<Integer, Integer>> paraIterator = parameterMap.entrySet().iterator();
		
		int maxMulNum = 0;
		while(paraIterator.hasNext()) {
			Entry<Integer, Integer> tempEntry = paraIterator.next();
			int mulNum = tempEntry.getKey() * tempEntry.getValue();
			if(mulNum > maxMulNum) {
				maxMulNum = mulNum;
				returnEntry = tempEntry;
			}
			
		}
		
		return returnEntry;
	}

	public static void printKVDesc(Map<Integer, Integer> parameterMap) {
		Iterator<Entry<Integer, Integer>> iterator = parameterMap.entrySet().iterator();
		List<Entry<Integer, Integer>> entryList = new ArrayList<Map.Entry<Integer,Integer>>();

		while(iterator.hasNext()) {
			entryList.add(iterator.next());
		}
		
		for(int i = 0; i < entryList.size(); i++) {
			System.out.println(entryList.get(i).getKey() + " : " + entryList.get((entryList.size() - 1) - i).getValue());
		}
		
	}
}
