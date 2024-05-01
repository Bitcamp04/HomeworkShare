package homework01.middle;

public class middleTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 1; i <= 1000; i++) {
			if(i % 2 == 0 && i %7 == 0) {
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println("합계 : " + sum);
	}

}
