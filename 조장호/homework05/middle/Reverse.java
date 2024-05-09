package homework05.middle;

public class Reverse {
	
	String reverseString(String str) {
		String retrunReverse = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			retrunReverse += str.charAt(i);
		}
		return retrunReverse;
	}
}
