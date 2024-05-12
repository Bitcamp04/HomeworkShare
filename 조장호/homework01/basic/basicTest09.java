package homework01.basic;

public class basicTest09 {

	/*
	 * 9. int 10개짜리 배열 생성하여
		 int배열에 3의 배수를 차례대로 저장하세요.
		 그리고 거꾸로 출력하세요.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrThr = new int[10];
		
		for(int i = 0; i < arrThr.length; i++) {
			arrThr[i] = (i + 1) * 3;
		}
		
		for(int j = arrThr.length -1; j >= 0; j--) {
			System.out.println(arrThr[j]);
		}
	}

}
