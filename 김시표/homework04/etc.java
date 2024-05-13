package homework04;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class etc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static int[] remove3(int[] s1, int[] s2) {
			boolean[] isPresent = new boolean[1001];
			// {false, false, false, false, .... false}
			// s2 = {1, 2 ,3}
			for(int num : s2) {
				// {false, true, true, true, true, false, .....}
				isPrestent[num] = true;
			}
			
			s1에서 s2에 없는 요소만 새로운 배열에 복사
			int[ temp = new int[s1.length];
			
			int index = 0;
			
			// s1 = {1, 2, 3, 4, 5}
			for(int num : s1) {
				// 1, 2, 3: true
				// 4, 5: false
				if(!isPresent[num] {
					temp[index++] = num;
					
				}
			}
			
			int[] returnArr = new int[index];
			
			System.arraycopy(temp, 0, returnArr, 0, index);
			return returnArr;
		}
		
		public static int[] remove4(int[] s1, int[] s2) {
			Set<Integer> set new HashSet<>()
			
			for(int num : s2) {
				set.add) {num};
			}
		
		};

	}

}
