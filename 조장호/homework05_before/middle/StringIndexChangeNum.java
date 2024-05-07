package homework05.middle;

public class StringIndexChangeNum {
	
	public String strIdxChangeNum(String inputStr) {
		String rtnStr = "";
		for(int i = 0; i < inputStr.length(); i++) {
			if(i > 0) {
				if(i % 3 == 0) {
					rtnStr += "3";
				} else if(i % 5 == 0) {
					rtnStr += "5";
				} else if(i % 3 == 0 && i % 5 == 0) {
					rtnStr += "35";
				} else {
					rtnStr += inputStr.charAt(i);
				}
				
			}
		}
		return rtnStr;
	}
}
