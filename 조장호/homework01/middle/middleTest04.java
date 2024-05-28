package homework01.middle;

public class middleTest04 {

	/*
	 * 5. 20개 배열을 선언하세요.
	      20개의 값을 난수를 이용해서 0 ~ 100까지의 값으로 채워넣고
	      인덱스의 홀수번째는 앞에서부터 출력하고
	      짝수번째는 뒤에서부터 출력하세요.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = new int[20];
		// 0 <= Math.random() < 1
		// 0 <= Math.random() * 101 < 101
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = (int)(Math.random() * 101);
		}
		for(int j = 0; j < numArr.length; j++) {
			if(j % 2 == 0) {
				System.out.println(((numArr.length - 2) - j) + "번째 : " + numArr[(numArr.length - 2) - j]);
			} else {
				System.out.println(j + "번째 : " + numArr[j]);
			}
		}
	}

}
