package homework01.middle;

public class middleTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------------ 6 - 1 -------------");
		/*
		 *  6 - 1
		 *  *
			**
			***
			****
			*****
		 */
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------------------------");
		System.out.println("------------ 6 - 2 -------------");
		/*
		 * 6 - 2
		 *     *
		      **
		     ***
		    ****
		   *****
		 */
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5 - (i + 1); j++) {
				System.out.print(" ");
			}
			for(int j = 5 - (i + 1); j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------------------------");
		System.out.println("------------ 6 - 3 -------------");
		/*
		 * 6 - 3
		 * *****
		   ****
		   ***
		   **
		   *
		 */
		for(int i = 0; i < 5; i++) {
			for(int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------------------------");
		System.out.println("------------ 6 - 4 -------------");
		/*
		 *  6 - 4
		 *  *****
			 ****
			  ***
			   **
			    *
		 */
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		System.out.println("--------------------------------");
	}
	
}
