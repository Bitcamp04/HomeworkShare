package homeWork.homework07.middle;

public class middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1= new StringBuffer(30);
		sb1.append("hello");
		int reminBfSz=sb1.capacity()-sb1.length();
		
		for(int i=4;i<reminBfSz;i++) {
			if(sb1.toString().equals("o")||sb1.toString().equals("t")) {
				sb1.append("b");
				}else if (sb1.toString().equals("b")) {
					sb1.append("i");
				}else if (sb1.toString().equals("i")) {
					sb1.append("t");
					
				}
		}
		
		System.out.println(sb1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
