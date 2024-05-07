package homeWork.homework02;

public class basic {
	public static void main(String[] args) {
		System.out.println("1번문제");
		System.out.println(gAdd(6));
		System.out.println("---------------------------");
		
		
		System.out.println("2번문제");
		
		System.out.println(sAdd("이희승","ㅁ"));
		System.out.println("3번문제");
		System.out.println(sAdd("dlgmltmd","dksndjk",3));
		System.out.println("------------------");
		System.out.println("4번문제");
		
		// 배열의 주소값
//		System.out.println(nArr(narr));
		int[] narr= {1,2,3,4,5,6,7};
//		int[] tmpArr = nArr(narr);
		nArr(narr);
	}
	
	//1번문제
	public static int gAdd(int a) {
			int num=0;
			for(int i=0;i<=a;i++) {
				num+=i;
			
			}
			return num;
	}
	
	//2번문제 
	public static String sAdd(String a,String b) {
		return a+b;
	}
 	//3번문제
	public static String sAdd(String a,String b,int c) {
		return a+b+c;
	}
	//4번문제
	public  static  void nArr(int[] arr ) {
		for (int j=arr.length -1;j >= 0;j--) {
			System.out.println(arr[j]);
			
			}
		
	}}			

