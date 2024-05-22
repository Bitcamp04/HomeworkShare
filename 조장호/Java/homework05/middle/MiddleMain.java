package homework05.middle;

public class MiddleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse reverseStr = new Reverse();
		System.out.println(reverseStr.reverseString("abcdefg"));
		
		RemovingDuplicatedString rds = new RemovingDuplicatedString();
		System.out.println(rds.removingDuple("aaabbccab"));
		
		StringIndexChangeNum sicn = new StringIndexChangeNum();
		System.out.println(sicn.strIdxChangeNum("aaaaaaaaaaa"));
	}

}
