package homework05.middle;

public class RemovingDuplicatedString {

	public String removingDuple(String str) {
		String removeDupleStr = "" + str.charAt(0);
		for(int i = 1; i < str.length(); i++) {
			if(removeDupleStr.contains("" + str.charAt(i))) {
				continue;
			} else {
				removeDupleStr += "" + str.charAt(i);
			}
		}
		return removeDupleStr;
	}
}
