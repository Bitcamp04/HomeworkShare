package homeWork.homework01;

public class _01_middl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1번문제");
		
		for(int i = 1; i <= 100; i++) {
			if(i%2==0&&i%3==0)  {
				System.out.print(i + ", ");
			} 
		}
		
		System.out.println("----------------------");
		System.out.println("3번문제");
		int i=1;
		
		while (i<=10) {
			i++;
			if(i%2==0) {
				System.out.println(i);
				
			}
		}
		
		System.out.println("------------------");
		System.out.println("4번문제");
		
		int j =1;
		int sum=0;
		while (j<=1000) {
			j++;
			if(j%2==0&&j%7==0)  {
				System.out.println(j + ", ");
				sum+=j;
			} 
			
		}
		System.out.println("2와7의 공배수의 합은 "+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
