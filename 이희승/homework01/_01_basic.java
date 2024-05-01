package homeWork.homework01;

import java.util.Scanner;
import java.util.Random;
public class _01_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		System.out.println(++num);
		System.out.println(++num);
		System.out.println(num--);
		System.out.println(--num);
		System.out.println(num--);
		System.out.println(--num);
		
		
		System.out.println("--------------------------");
		
		int a =10;
		int b=20;
		//a<=b;
		//a>=b;
		
		System.out.println("-----------------------------");
		int i=0;
		int j=10;
		while(i<10) {
			
			System.out.println(j);
			i++;
			j--;
		}
		System.out.println("-------------------------------");
		
		int d=0;
		int f=10;
		do {
			System.out.println(f);
			d++;
			f--;
		} while (d<10);
		
		
		
		System.out.println("--------------------");
		
		System.out.println("5");
		int A=10;
		for(int c=0;c<10;c++) {
			System.out.println(A);
			A-=1;
		}
		
		System.out.println("------------------");
		
	System.out.println("6번문제");
		int sum=0;
		int q=1;
		while(q<=100) {
			sum=sum+q;
			q++;
			
		}
		System.out.println(sum);
		
		System.out.println("----------------------");
		
		System.out.println("7번문제");
		
		
		int y=1;
		int summ=0;
		do {
			summ+=y;
			
			y++;
		} while (y<=100);
		System.out.println(summ);
		System.out.println("------------------");
		System.out.println("8번문제");
		int summm=0;
		for(int o=1;o<=100;o++) {
			summm+=o;
			
		}
		System.out.println(summm);
		
		
		
		System.out.println("------------------");
		System.out.println("9번문제");
		int[]narr=new int[10];
		
		for(int s=0;s<narr.length;s++) {
			narr[s]=(s+1)*3;
			System.out.println(narr[s]);
		}
			
		System.out.println("--------------------");
		System.out.println("10번문제");
		
//		int[]narrr=new int[10];
//		Scanner sc = new Scanner(System.in);
//		
//		int scm=0;
//		
//		for (int t=0;t<narrr.length;t++) {
//			System.out.print("숫자를 입력하세요");
//			int userNum= sc.nextInt();
//				narrr[t]=userNum;
//				
//			
//				System.out.println("입력한 숫자"+userNum);
//				scm+=userNum;
//		
//				
//				
//			}
//			
//			
//		for	(int cn=0;cn<narrr.length;cn++) {
//			System.out.println(narrr[cn]);
//		}
//		System.out.println("지금까지입력한 숫자의합은 "+scm);
//		sc.close();
//		
//		
		System.out.println("--------------------------");
		System.out.println("11번문제");
		Random random=new Random();
		int[] narrrr=new int[10];
		
		for(int w=0;w<narrrr.length;w++) {
			 
			narrrr[w]= random.nextInt(10)+1;
			System.out.println(narrrr[w]);
			
			
		}
		System.out.println("홀수출력");
		for(int w=0;w<narrrr.length;w++) {
			if(narrrr[w]%3==0) {
				System.out.println(narrrr[w]);
			}else {};
		}
		
		System.out.println("---------------------");
		System.out.println("12번 문제");
		
		
		
		
		int[]narrrrr=new int[10];
		Scanner sc = new Scanner(System.in);
		
		int scm=0;
		
		for (int t=0;t<narrrrr.length;t++) {
			System.out.print("숫자를 입력하세요");
			int userNum= sc.nextInt();
				narrrrr[t]=userNum;
				
			
			
		
				
				
			}
			
			
		for	(int cn=0;cn<narrrrr.length;cn++) {
			if(narrrrr[cn]%2==0&&narrrrr[cn]%3==0)
				System.out.println(narrrrr[cn]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
