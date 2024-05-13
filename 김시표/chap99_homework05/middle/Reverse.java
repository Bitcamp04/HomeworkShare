package chap99_homework05.middle;

public class Reverse {
	    public String reverseString(String str) {
	        StringBuilder reversed = new StringBuilder();
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed.append(str.charAt(i));
	        }
	        return reversed.toString();
	    }
}
