package homeWork.homework09.basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class basic {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc =new Scanner(System.in);
//		
//		
//		Map<String, Integer> omap=new HashMap<String, Integer>();
//		
//		System.out.println("알파벳입력 ");
//		String A=sc.nextLine();
//		Integer B=Integer.valueOf(A); 
//		omap.put(A	, B);
//		
//		Set<Entry<String, Integer>> entrySet=omap.entrySet();
//		
//		Iterator<Entry<String, Integer>>entryIterator=entrySet.iterator();
//		
//		while(entryIterator.hasNext()) {
//			Entry<String, Integer>entry=entryIterator.next();
//			
//			
//			
//			System.out.println(entry.getKey());
//			System.out.println(entry.getValue());
//		}
		 // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);
        
        // 사용자로부터 문자열 입력 받기
        System.out.print("알파벳을 입력하세요: ");
        String input = scanner.nextLine(); // 전체 문자열 입력 받음
        
        if(input.length() > 0) {
            // 입력 받은 문자열 중 첫 번째 문자
            char alphabet = input.charAt(0);
            
            // Map 객체 생성
            Map<String, Integer> alphabetUnicodeMap = new HashMap<>();
            
            // Map에 알파벳과 해당 유니코드 값 저장
            alphabetUnicodeMap.put(String.valueOf(alphabet), (int) alphabet);
            
            // 저장된 알파벳과 유니코드 값 출력
            alphabetUnicodeMap.forEach((key, value) -> System.out.println("알파벳: " + key + ", 유니코드 값: " + value));
        } else {
            System.out.println("입력된 문자열이 없습니다.");
        }
        
		
        Map<String, String>caollMap=new HashMap<>();
        
        for(int i=0;caollMap.size()<5;i++) {
        System.out.println("이름입력");
        String name= scanner.nextLine();
        System.out.println("전화번호");
        String num= scanner.nextLine();
        caollMap.put(name, num);
        }
        
        

			
        System.out.println("번호찾을이름입력");
			String cn=scanner.nextLine();
			System.out.println(caollMap.get(cn));
			
			
			
			
		
        
        
        
        
        
        
        // Scanner 객체 닫기
        scanner.close();
	}

}
