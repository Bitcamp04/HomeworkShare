package homework07.advance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 사용자 입력한 문자열에서 연속된 동일한 문자를 찾고
	    // 연속된 동일한 문자를 발견했을 때 하나빼고 다 제거하여
	    // 출력하세요. (단, 대소문자 구분함. StringBuilder를 사용하세요.)
	    // ex) aabbcdeffaaaaynguuuuuu -> abcdefayngu
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder inputStr = new StringBuilder();
		
		try {
			System.out.println("문자열을 입력해주세요.");
			inputStr.append(br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0; i < inputStr.length() - 1; i++) {
			if(inputStr.charAt(i) == inputStr.charAt(i + 1)) {
				inputStr.replace(i, i + 1, " ");
			}
		}
		String resultStr = inputStr.toString().replaceAll(" ", "");
		
		System.out.println("중복 제거 값 : " + resultStr);
		
	}

}
