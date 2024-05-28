package chap99_homework10;

public class Basic2 { 

	public static <T> String add(T t1, T t2) {
		String rtnValue = String.valueOf(t1) + String.valueOf(t2); // "20" "30" = "2030"
		return rtnValue;
	}
	String result1 = add(10, 20); // "1020"
	String result2 = add("Hello", "World"); // "HelloWorld"
	String result3 = add(true, false); // "truefalse"
	
	
	public static <T> String add2(T t3, T t4 ) {
		String result = String.valueOf(t3) + String.valueOf(t4);
		return result;
	}
	
	
}

