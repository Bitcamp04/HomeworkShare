package homework10.middle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.
		Map<Integer, Double> inputMap = new HashMap<Integer, Double>();
		inputMap.put(2, 3.6469);
		inputMap.put(5, 2.74231);
		inputMap.put(9, 1.7523215);
		inputMap.put(20, 0.62315);
		inputMap.put(120, 0.1123366);
		Entry<Integer, Double> maxEntry = getMaxMul(inputMap);
		System.out.println(maxEntry.toString());
		
		// 2.
		NumberGeneric<Number> numberGeneric = new NumberGeneric<Number>();
		
		System.out.println("main 덧셈 : " + numberGeneric.add(new Double[] { 11.54889, 12.3332, 19.53222}));
		System.out.println("main 뺄셈 : " + numberGeneric.sub(new Double[] { 11.54889, 12.3332, 19.53222}));
		System.out.println("main 곱셈 : " + numberGeneric.mul(new Double[] { 11.54889, 12.3332, 19.53222}));
		System.out.println("main 나눗셈 : " + numberGeneric.div(new Double[] { 11.54889, 12.3332, 19.53222}));
		
		// 3.
		int totalSum = 0;
		CoffeEnum coffeEnum = CoffeEnum.AMERICANO;
		totalSum += coffeEnum.totalPrice(2, 1);	// 4600
		System.out.println("AMERICANO 주문 가격 : " + coffeEnum.totalPrice(2, 1));
		coffeEnum = CoffeEnum.LATTE;
		totalSum += coffeEnum.totalPrice(1, 0);	// 3500
		System.out.println("LATTE 주문 가격 : " + coffeEnum.totalPrice(1, 0));
		coffeEnum = CoffeEnum.MOCHA;
		totalSum += coffeEnum.totalPrice(2, 0);	// 10000
		System.out.println("MOCHA 주문 가격 : " + coffeEnum.totalPrice(2, 0));
		coffeEnum = CoffeEnum.COLDBREW;
		totalSum += coffeEnum.totalPrice(0, 2);	// 9000
		System.out.println("COLDBREW 주문 가격 : " + coffeEnum.totalPrice(0, 2));
		System.out.println("주문 총 가격 : " + totalSum);
		
		
		// 4.
		Map<Integer, Integer> paramMap4 = new HashMap<Integer, Integer>();
		for(int i = 15; i < 26; i++) {
			paramMap4.put(i + 35, i);
		}
		
		List<Entry<Integer, Integer>> resultListEntry = getOverHundr(paramMap4);
		for(Entry<Integer, Integer> entry : resultListEntry) {
			System.out.println(entry);
		}
		
		// 5.
		GenericSplit<Object> genSp = new GenericSplit<Object>();
		List<Object> testList = new ArrayList<Object>();
		
		for(int i = 0; i < 16; i++) {
			testList.add(i);
		}
		
		genSp.splitList(testList);
		System.out.println("part1 : " + genSp.getTListPart1());
		System.out.println("part2 : " + genSp.getTListPart2());
		
	}
	
	// 1. key와 value 모두 Number를 상속받은 클래스만 받고 매개변수로 Map이 주어졌을 때 
	// key, value의 곱이 가장 큰 Entry를 리턴하는 메소드 getMaxMul을 구현하세요.
	public static <K extends Number, V extends Number> Entry<K, V> getMaxMul(Map<K, V> paramMap){
		Iterator<Entry<K, V>> paramMapIterator = paramMap.entrySet().iterator();
		int kvMultiply = 0;
		Entry<K, V> returnEntry = null;
		
		while(paramMapIterator.hasNext()) {
			Entry<K, V> tempEntry = paramMapIterator.next();
			int keyValue = tempEntry.getKey().intValue();
			int value = tempEntry.getValue().intValue();
			if(keyValue * value > kvMultiply) {
				kvMultiply = keyValue * value;
				returnEntry = tempEntry;
			}
		}
		
		return returnEntry;
	}
	
	// 4. Map<Integer, Integer>을 매개변수로 받아서 List<Entry<K, V>>를 리턴하는 메소드 getOverHundr를 구현하세요.
	// 매개변수 Map에는 key는 50~60까지 value는 15~25까지 넣어주고 키와 밸류의 곱셈의 결과가 1000을 넘는 Entry만 List에 저장합니다.
	public static <K, V> List<Entry<K, V>> getOverHundr(Map<Integer, Integer> paramMap){
		Iterator<Entry<Integer, Integer>> paramIterator = paramMap.entrySet().iterator();
		List<Entry<K, V>> entryList = new ArrayList<Map.Entry<K, V>>();
		
		while(paramIterator.hasNext()) {
			Entry<Integer, Integer> tempEntry = paramIterator.next();
			
			if(tempEntry.getKey() * tempEntry.getValue() > 1000) {
				Entry<K, V> addEntry = (Entry<K, V>) tempEntry;
				entryList.add(addEntry);
			}
		}
		
		return entryList;
	}
}
