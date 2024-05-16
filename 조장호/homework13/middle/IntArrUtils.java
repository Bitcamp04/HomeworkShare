package homework13.middle;

import java.util.Arrays;

// 3. 매개변수로 받아온 정수 배열에서 최대값, 최소값, 중간값을 구하는 static 메소드 getMax, getMin, getMid를 갖는 클래스 
// IntArrUtils를 구현하고 maxOrMinOrMid라는 메소드를 갖는 함수형 인터페이스 MaxMinMid를 만들고 람다식으로 IntArrUtils의 메소드를 참조하여 구현하세요.
public class IntArrUtils {

	public static int getMax(int[] intArr) {
		int returnValue = maxOrMinOrMid(intArr, irr -> {
			int tempValue = intArr[0];
			for(int i = 1; i < intArr.length; i++) {
				if(tempValue < intArr[i]) {
					tempValue = intArr[i];
				}
			}
			return tempValue;
		});
		return returnValue;
	}
	
	public static int getMin(int[] intArr) {
		int returnValue = maxOrMinOrMid(intArr, irr -> {
			int tempValue = intArr[0];
			for(int i = 1; i < intArr.length; i++) {
				if(tempValue > intArr[i]) {
					tempValue = intArr[i];
				}
			}
			return tempValue;
		});
		return returnValue;
	}
	
	public static int getMid(int[] intArr) {
		int returnValue = maxOrMinOrMid(intArr, irr -> {
			Arrays.sort(intArr);
			return intArr[(intArr.length / 2)];
		});
		return returnValue;
	}
	
	public static int maxOrMinOrMid(int[] intArr, MaxMinMid maxMinMid) {
		return maxMinMid.maxOrMinOrMid(intArr);
	}
}
