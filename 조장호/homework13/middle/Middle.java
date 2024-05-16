package homework13.middle;

public class Middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.
		StringBuilder sbParam1 = new StringBuilder("abcde");
		StringBuilder sbParam2 = new StringBuilder("fghij");
		
		StringBuilder resultSb = combineStrBuilder(sbParam1, sbParam2, (s1, s2) -> {
			s1.append(s2);
			StringBuilder returnSb = new StringBuilder();
			for(int i = s1.length() - 1; i > 0; i--) {
				returnSb.append(s1.charAt(i));
			}
			
			return returnSb;
		});
		
		System.out.println(resultSb.toString());
		
		// 2-1. appendSb
		StringBuilder sbParam3 = new StringBuilder("bit");
		StringBuilder sbParam4 = new StringBuilder("camp");
		
		StringBuilder mergeSb = appendSb(sbParam3, sbParam4, (s3, s4) -> {
			StringBuilder returnSb = new StringBuilder();
			for(int i = 0; i < s3.length(); i++) {
				returnSb.append(s3.charAt(i));
			}
			for(int i = 0; i < s4.length(); i++) {
				returnSb.append(s4.charAt(i));
			}
			return returnSb;
		});
		System.out.println(mergeSb.toString());
		
		// 2-2. reverseSb
		StringBuilder reverseSb = reverseSb(sbParam3, sbParam4, (sb3, sb4) -> {
			StringBuilder returnSb = new StringBuilder();
			for(int i = sb3.length() - 1; i >= 0; i--) {
				returnSb.append(sb3.charAt(i));
			}
			for(int i = sb4.length() - 1; i >= 0; i--) {
				returnSb.append(sb4.charAt(i));
			}
			return returnSb;
		});
		System.out.println("reverseSb : " + reverseSb.toString());
		StringBuilder reverseSbParam3 = new StringBuilder();
		reverseSbParam3.append(reverseSb.substring(0, sbParam3.length()));
		StringBuilder reverseSbParam4 = new StringBuilder();
		reverseSbParam4.append(reverseSb.substring(sbParam3.length(), reverseSb.length()));
		System.out.println("reverse3 : " + reverseSbParam3.toString());
		System.out.println("reverse4 : " + reverseSbParam4.toString());
		
		
		// 3.
		// 1 93 111 232 497 2300 3254
		System.out.println(IntArrUtils.getMax(new int[] {1, 3254, 2300, 93, 497, 232, 111}));
		System.out.println(IntArrUtils.getMin(new int[] {1, 3254, 2300, 93, 497, 232, 111}));
		System.out.println(IntArrUtils.getMid(new int[] {1, 3254, 2300, 93, 497, 232, 111}));
	}
	// 1. 두 개의 StringBuilder 값을 매개변수로 받아 두 개의 값을 합친 후 역순으로 바꿔서 리턴하는 combineStrBuilder를 람다식으로 구현하세요.
	// StringBuilderUtils 함수형 인터페이스 선언, StringBuilder combineStrBuilder(StringBuilder sb1, StringBuilder sb2) 추상메소드 선언
	public static StringBuilder combineStrBuilder(StringBuilder sb1, StringBuilder sb2, StringBuilderUtils stringBuilderUtils) {
		return stringBuilderUtils.combineStrBuilder(sb1, sb2);
	}
	
	// 2. 2번 문제에서 StringBuilder 두 개를 합치는 메소드 appendSb와 역순으로 변경하는 메소드 reverseSb를 각각 선언하고
	// StringBuilder의 메소드를 참조하여 combineStrBuilder 각각 구현하세요.
	public static StringBuilder appendSb(StringBuilder sb1, StringBuilder sb2, StringBuilderUtils stringBuilderUtils) {
		return stringBuilderUtils.combineStrBuilder(sb1, sb2);
	}
	
	public static StringBuilder reverseSb(StringBuilder sourceSb, StringBuilder outputSb, StringBuilderUtils stringBuilderUtils) {
		return stringBuilderUtils.combineStrBuilder(sourceSb, outputSb);
	}
	

	
}
