package homework04.middle;

public class ArrayUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] inputIntArr = new int[] {1, 2, 3, 4, 5};
		double[] outputDoubleArr = intToDouble(inputIntArr);
		for(int j = 0; j < outputDoubleArr.length; j++) {
			System.out.println(j + "번째 변환된 값 : " + outputDoubleArr[j]);
		}
		
		
		double[] inputDoubleArr = new double[] {1.5, 5.7, 3.14, 4.49, 5.61};
		int[] outputIntArr = doubleToInt(inputDoubleArr);
		for(int k = 0; k < outputIntArr.length; k++) {
			System.out.println(k + "번째 변환된 값 : " + outputIntArr[k]);
		}
		
	}
	// int배열을 double배열로 변환
	static double[] intToDouble(int[] source) {
		double[] rtnDoubleArr = new double[source.length];
		for(int i = 0; i < source.length; i++) {
			rtnDoubleArr[i] = (source[i]);
		}
		return rtnDoubleArr;
	};
	
	// double배열을 int배열로 변환
	static int[] doubleToInt(double[] source) {
		int[] rtnIntArr = new int[source.length];
		for(int i = 0; i < source.length; i++) {
			rtnIntArr[i] = (int)(source[i]);
		}
		return rtnIntArr;
	};
}
