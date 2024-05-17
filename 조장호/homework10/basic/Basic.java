package homework10.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2.
		System.out.println(add('c', 2));
		
		// 3.
		List<String> inputList = new ArrayList<String>();
		inputList.add("4");
		inputList.add("5");
		inputList.add("7");
		System.out.println(sum(inputList));
		
		// 4.
		Object[] inputArr = new Object[] {'c', 1, "arr", 0.66, 220L, '7', "pppp", new int[] {1, 2, 3}};
		printArr(inputArr);
		
		// 5.
		Integer[] intArr = new Integer[] {4, 6, 99, 222, 10039, 306661, -2003};
		System.out.println(getMin(intArr));
		
		// 6.
		Map<String, Object> inputMap = new HashMap<String, Object>();
		inputMap.put("abc", 's');
		inputMap.put("name", "bitcamphomework");
		inputMap.put("n1", 1092334472);
		inputMap.put("sseee2", 0.23195753333);
		printOverTen(inputMap);
		
		// 7.
		notifyFood("한국");
	}

    // 2. public static <T> String add(T t1, T t2) 제네릭 메소드를 정의하고 매개변수로 어떤 값이 들어오던 문자열 결합연산이 돼서 스트링값으로 리턴하도록 만드세요.
	public static <T> String add(T t1, T t2) {
		return t1.toString() + t2.toString();
	}
	
	// 3. public static Integer sum(List<?> list) 와일드 카드를 이용하여 리스트의 총합을 구하는 메소드를 구현하세요.
	public static Integer sum(List<?> list) {
		int sum = 0;
		
		for(int i = 0; i < list.size(); i++) {
			sum += Integer.parseInt(list.get(i).toString());
		}
		
		return sum;
	}
	
	// 4. 어떤 배열이던지 받아서 인덱스가 3의 배수인 요소만 출력하는 메소드 void printArr을 구현하세요.
	public static void printArr(Object[] objArr) {
		
		for(int i = 0; i < objArr.length; i++) {
			if(i != 0 && i % 3 == 0) {
				System.out.println("인덱스가 3의 배수로 출력합니다. " + i + "-> " + objArr[i]);
			}
		}
	}
	
	// 5. Number를 상속받은 클래스타입의 배열만 받아서 배열의 최소값을 구해서 리턴하는 메소드 getMin을 구현하세요.
	public static <T extends Number> T getMin(T[] TClassArr) {
		T minNum = TClassArr[0];
		
		for(int i = 1; i < TClassArr.length; i++) {
			if(TClassArr[i].intValue() < minNum.intValue()) {
				minNum = TClassArr[i];
			}
		}
		
		return minNum;
	}
	
	// 6. Map을 어떤형태로든 받아서 value를 String으로 변경했을 때 길이가 10이상되는 key를 출력하는 메소드 void printOverTen을 구현하세요.
	public static <K, V> void printOverTen(Map<K, V> paramMap) {
		Iterator<Entry<K, V>> paramMapIterator = paramMap.entrySet().iterator();
		
		while(paramMapIterator.hasNext()) {
			Entry<K, V> tempEntry = paramMapIterator.next();
			if(tempEntry.getValue().toString().length() >= 10) {
				System.out.println(tempEntry.getKey() + "의 값은 value가 10이상인 key 값입니다.");
			}
		}
	}
	
	// 7. KOR, CHI, JAP, USA 네 개의 상수를 갖는 enum을 생성하고 첫 번째 값은 "나라 한글명"이고 두 번째 값은 "대표음식"으로 지정한다.
	// public void notifyFood(String country) 메소드를 만들고 country 값과 동일한 한글명인 나라의 음식을 다음과 같이 출력하도록 구현하세요.
	// country에 "중국"이 들어오면 "중국의 대표음식은 짜장면입니다."라고 나오도록 하세요. (각 국의 음식은 한국=불고기, 중국=짜장면, 일본=초밥, 미국=햄버거)
	public static void notifyFood(String country) {
		Country[] countries = Country.values();
		
		for(int i = 0; i < countries.length; i++) {
			if(countries[i].getCountryName().equals(country)) {
				System.out.println(countries[i].getCountryName() + "의 대표음식은 " + countries[i].getCountryFood() + "입니다.");
				break;
			}
		}
	}
}
