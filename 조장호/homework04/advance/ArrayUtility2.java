package homework04.advance;

public class ArrayUtility2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArr1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
		int[] inputArr2 = new int[] {3, 6, 8};
		
//		int[] concatResult = concat(inputArr1, inputArr2);
//		for(int a = 0; a < concatResult.length; a++) {
//			System.out.println(a + "번째 값 : " + concatResult[a]);
//		}
		System.out.println("----------------------------------------");
		int[] removeResult = remove(inputArr1, inputArr2);
		for(int b = 0; b < removeResult.length; b++) {
			System.out.println(b + "번째 값 : " + removeResult[b]);
		}
	}
	// s1과 s2를 연결한 새로운 배열 리턴
	static int[] concat(int[] s1, int[] s2) {
		int[] concateArr = new int[s1.length + s2.length];
		for(int i = 0; i < s1.length; i++) {
			concateArr[i] = s1[i];
		}
		for(int j = s1.length; j < s1.length + s2.length; j++) {
			concateArr[j] = s2[j - s1.length];
		}
		return concateArr;
	};
	// s1에서 s2배열의 숫자를 모두 삭제한 새로운 배열 리턴
	// {1, 2, 3, 4, 5, 6, 7, 8},     {3, 6, 8} -> {1, 2, 4, 5, 7}
	// {1, 2, 0, 4, 5, 0, 7, 0}
	// {X, X, X, X, X}
	static int[] remove(int[] s1, int[] s2) {
		int[] isExistedArr = new int[s1.length];
		int isCount = 0;
		for(int j = 0; j < s2.length; j++) {
			for(int i = 0; i < s1.length; i++) {
				if(s1[i] == s2[j]) {
					isExistedArr[i] = s1[i];
					isCount++;
				} 
			}
		}
		for(int a = 0; a < isExistedArr.length; a++) {
			System.out.println("isExistedArr[" + a + "] = " + isExistedArr[a]);
		}
		System.out.println("체크된 값 개수 : " + isCount);
		
		int[] rtnRemoveArr = new int[s1.length - isCount];
		int passIndex = 0;
		for(int k = 0; k < s1.length; k++) {
			if(isExistedArr[k] == 0) {
				rtnRemoveArr[passIndex++] = s1[k];
			}
			if(passIndex == s1.length - isCount) {
				break;
			}
		}
		// s1 			:	{1, 2, 3, 4, 5, 6, 7, 8}
		// isExistedArr : 	{0, 0, 3, 0, 0, 6, 0, 8}
		// {1, 2, 4, 5, 7}
		
		return rtnRemoveArr;
	};
}
