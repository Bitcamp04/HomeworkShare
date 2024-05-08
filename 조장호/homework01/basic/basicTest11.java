package homework01.basic;

public class basicTest11 {

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
