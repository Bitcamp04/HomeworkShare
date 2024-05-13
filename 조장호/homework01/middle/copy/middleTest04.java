package homework01.middle.copy;

public class middleTest04 {

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
