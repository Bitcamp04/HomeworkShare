package homework12.number02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;

public class UsingCollection {

	private static Map<String, String> keyWord = new HashMap<String, String>();
	private static Map<String, Integer> fruitPriceMap = new HashMap<String, Integer>();
	private static Map<String, Integer> studentScoreMap = new HashMap<String, Integer>();
	private static List<String> inputList = new ArrayList<String>();
	// 1. Map을 이용하여 영어 단어와 뜻을 저장하고 사용자가 입력한 단어의 뜻을 출력하세요.
	public static void printKeyWord(Scanner sc) {
		System.out.println("영어 단어를 입력해주세요.");
		String key = sc.nextLine();
		System.out.println("영어 뜻을 입력해주세요.");
		String value = sc.nextLine();
		keyWord.put(key, value);
		
		System.out.println("찾으실 영어 단어를 입력해주세요.");
		String findKey = sc.nextLine();
		while(true) {
			if(keyWord.get(findKey) != null) {
				System.out.println("찾으실 영어 단어의 뜻은 : " + keyWord.get(findKey) + "입니다.");
				break;
			} else {
				System.out.println("찾으실 영어 단어는 없습니다. 다시 입력해주세요.");
				findKey = sc.nextLine();
			}
			
		}
	}
	
	// 2. Map을 이용해서 음식 이름과 가격을 저장하고 사용자가 입력한 음식의 이름과 수량으로 최종 금액을 출력하세요.
	public static void printFruitNmQuantity(Scanner sc) {
		while(true) {
			System.out.println("음식의 이름을 입력해주세요.");
			String fruitName = sc.nextLine();
			
			System.out.println("음식의 가격을 입력해주세요.");
			String fruitPrice = sc.nextLine();
			
			
			fruitPriceMap.put(fruitName, Integer.parseInt(fruitPrice));
			System.out.println(fruitName + "의 과일은 " + fruitPrice + "가격으로 등록됩니다.");
			
			System.out.println("음식을 더 등록하시겠습니까?(yes : 계속, no : 등록완료)");
			String answer = sc.nextLine();
			if(answer.equals("no")) {
				break;
			} else {
				continue;
			}
		}
		
		System.out.println("계산하실 음식의 이름을 입력해주세요.");
		String inputName = sc.nextLine();
		System.out.println("계산하실 음식의 수량을 입력해주세요.");
		int inputQuan = sc.nextInt();
		sc.nextLine();
		
		System.out.println("입력하신 음식의 최종 금액은 : " + fruitPriceMap.get(inputName) * inputQuan + "원 입니다.");
	}
	
	// 3. Map을 이용해서 학생의 이름과 점수를 저장하고 점수가 90점 이상인 학생의 이름을 모두 출력하세요.
	public static void printStudentNames(Scanner sc) {
		while(true) {
			System.out.println("학생의 이름을 입력해 주세요.");
			String studentName = sc.nextLine();
			System.out.println("점수를 입력해 주세요.");
			int studentScore = sc.nextInt();
			sc.nextLine();
			studentScoreMap.put(studentName, studentScore);
			System.out.println("입력하신 학생, 점수를 저장했습니다. 더 입력하시겠습니까? 종료: no");
			String playFlag = sc.nextLine();
			if(playFlag.equals("no")) {
				break;
			} else {
				continue;
			}
		}
		
		Iterator<Entry<String, Integer>> studentIterator = studentScoreMap.entrySet().iterator();
		System.out.println("90점 이상 학생의 명단 리스트");
		while(studentIterator.hasNext()) {
			Entry<String, Integer> stuEntry = studentIterator.next();
			
			if(stuEntry.getValue() >= 90) {
				System.out.println(stuEntry.getKey());
			}
		}
	}
	// 4. 3번에서 사용한 Map에서 점수가 가장 높은 학생의 이름과 점수를 출력하세요.
	public static void printMaxStudent() {
		Iterator<Entry<String, Integer>> studentIterator = studentScoreMap.entrySet().iterator();
		Entry<String, Integer> maxStudent = null;
		while(studentIterator.hasNext()) {
			Entry<String, Integer> tempEntry = studentIterator.next();
			if(maxStudent == null) {
				maxStudent = tempEntry;
			} else {
				if(tempEntry.getValue() > maxStudent.getValue()) {
					maxStudent = tempEntry;
				}
			}
		}
		if(maxStudent == null) {
			System.out.println("학생의 명단에 등록된 학생이 없습니다.");
		} else {
			System.out.println("점수가 가장 높은 학생의 이름은 : " + maxStudent.getKey() + ", 점수는 : " + maxStudent.getValue() + "입니다.");
		}
	}
	
	// 5. List에 문자열을 저장하고 사용자가 입력한 문자열을 검색하여 해당 문자열의 인덱스를 출력하세요.
	public static void printIndexOfValue(Scanner sc) {
		while(true) {
			System.out.println("저장할 문자열을 입력해 주세요.");
			String inputStr = sc.nextLine();
			inputList.add(inputStr);
			
			System.out.println("더 입력하시겠습니까? 종료: no");
			String continueInput = sc.nextLine();
			
			if(continueInput.equals("no")) {
				break;
			} else {
				continue;
			}
		}
		
		while(true) {
			System.out.println("검색하실 문자열을 입력하세요.");
			String findIndexOfStr = sc.nextLine();
			
			Optional<String> optionalStr = Optional.ofNullable(findIndexOfStr);
			if(optionalStr.isPresent()) {
				if(inputList.indexOf(findIndexOfStr) != -1) {
					System.out.println("해당 문자열은 " + inputList.indexOf(findIndexOfStr) + "번 인덱스에 있습니다.");
					break;
				} else {
					System.out.println("해당 문자열은 저장되어 있지 않습니다. 다시 입력해주세요.");
				}
			} else {
				System.out.println("해당 문자열은 저장되어 있지 않습니다. 다시 입력해주세요.");
				continue;
			}
		}
		
		
	}
	// 6. List에 정수 10개를 저장하되 중복 값을 1개 이상 포함시키고 Set으로 옮겨서 모든 요소를 출력하세요.
	public static void oneDuplicateSet() {
		List<Integer> tenList = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			int tempNum = (int)(Math.random() * 100) + 1;
			if(i == 9) {
				if(!tenList.contains(tempNum)) {
					tempNum = (int)(Math.random() * 100) + 1;
					i--;
				}
			} else {
				tenList.add(tempNum);
			}
			
		}
		
		System.out.println("List에 든 값들 : " + tenList.toString());
		
		Set<Integer> changeSet = new HashSet<Integer>();
		changeSet.addAll(tenList);
		
		System.out.println("Set으로 바꾼 값들 : " + changeSet.toString());
	}
	
	// 7. 현대차의 차종과 판매량을 저장하는 Map 한 개와 기아차의 차종과 판매량을 저장하는 Map 한 개를 만들어서
	// List에 둘 다 저장합니다. 회사별로 가장 판매량이 높은 차종의 Entry를 뽑아서 새로운 List에 저장하고 
    // 출력하세요. (현대 차종은 아반떼, 소나타, 그랜저 기아 차종은, k5, k7, k9, 판매량은 마음대로 정하시면 됩니다.)
	public static void printMaxSalesCar() {
		List<Map<String, Integer>> carListMap = new ArrayList<>();
		Map<String, Integer> hyunCarSalesQMap = new HashMap<String, Integer>();
		hyunCarSalesQMap.put("아반떼", 9);
		hyunCarSalesQMap.put("소나타", 6);
		hyunCarSalesQMap.put("그랜저", 11);
		Map<String, Integer> kiaCarSalesQMap = new HashMap<String, Integer>();
		kiaCarSalesQMap.put("k5", 4);
		kiaCarSalesQMap.put("k7", 9);
		kiaCarSalesQMap.put("k9", 13);
		
		carListMap.add(hyunCarSalesQMap);
		carListMap.add(kiaCarSalesQMap);
		
		List<Entry<String, Integer>> maxSalesCarMap = new ArrayList<Entry<String,Integer>>();
		int maxSalesHyundaiCar = 0;
		int maxSalesKiaCar = 0;
		
		Set<Entry<String, Integer>> tempEntry = carListMap.get(0).entrySet();
		Iterator<Entry<String, Integer>> tempIterator = tempEntry.iterator();
		Entry<String, Integer> maxHyundaiEntry = null;
		while(tempIterator.hasNext()) {
			Entry<String, Integer> tempNext = tempIterator.next();
			if(tempNext.getValue() > maxSalesHyundaiCar) {
				maxSalesHyundaiCar = tempNext.getValue();
				maxHyundaiEntry = tempNext;
			}
		}
		
		maxSalesCarMap.add(maxHyundaiEntry);
		
		Set<Entry<String, Integer>> tempEntry2 = carListMap.get(1).entrySet();
		Iterator<Entry<String, Integer>> tempIterator2 = tempEntry2.iterator();
		Entry<String, Integer> maxKiaEntry = null;
		while(tempIterator2.hasNext()) {
			Entry<String, Integer> tempNext2 = tempIterator2.next();
			if(tempNext2.getValue() > maxSalesKiaCar) {
				maxSalesKiaCar = tempNext2.getValue();
				maxKiaEntry = tempNext2;
			}
		}
		maxSalesCarMap.add(maxKiaEntry);
		
		maxSalesCarMap.stream()
					  .forEach(entry -> System.out.println(entry.getKey() + ", " + entry.getValue()));
			
	}
}
