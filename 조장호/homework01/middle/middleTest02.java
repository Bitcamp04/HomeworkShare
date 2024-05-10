package homework01.middle;

public class middleTest02 {

	// 3. while문을 이용해서 1부터 10까지 중에 짝수만 출력하세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		while(i < 11) {
			if(i % 2 ==0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
