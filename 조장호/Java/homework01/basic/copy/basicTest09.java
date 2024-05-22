package homework01.basic.copy;

public class basicTest09 {

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
