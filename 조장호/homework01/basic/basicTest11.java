package homework01.basic;

public class basicTest11 {

	/*
	 * 11. int 배열로 10개의 공간을 생성하세요.
		  1 ~ 10까지의 임의의 수를 저장하고
		  홀수만 골라서 출력하세요.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ranArr = new int[10];
		for(int i = 0; i < ranArr.length; i++) {
			ranArr[i] = (int)(Math.random() * 10 + 1);
			
		}
		
		for(int j = 0; j < ranArr.length; j++) {
			if(ranArr[j] % 2 == 1) {
				System.out.println(ranArr[j]);
			}
		}
	}

}
