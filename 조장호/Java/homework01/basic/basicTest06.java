package homework01.basic;

public class basicTest06 {

	// 6. 1 ~ 100까지 합을 while문으로 출력
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int i = 1;
		while(i <= 100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

}
