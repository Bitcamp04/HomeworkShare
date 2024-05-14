package homework10.middle;

import java.util.List;

public class GenericSplit<T> {

	public List<T> TList;
	
	private List<T> TListPart1;
	private List<T> TListPart2;
	
	public List<T> getTListPart1() {
		return TListPart1;
	}
	public List<T> getTListPart2() {
		return TListPart2;
	}
	
	public void splitList(List<T> paramList) {
		int size = paramList.size();
		int partSize1 = 0;
		int partSize2 = 0;
		if(size % 2 == 0) {
			partSize1 = size / 2;
			partSize2 = size - (size / 2);
		} else {
			partSize1 = size / 2 + 1;
			partSize2 = size - (size / 2) - 1;
		}
		
		System.out.println("size : " + size);
		System.out.println("partSize1 : " + partSize1);
		System.out.println("partSize2 : " + partSize2);
		
		TListPart1 = paramList.subList(0, partSize1);
		TListPart2 = paramList.subList(partSize2, size);
//		for(int i = 0; i < partSize1; i++) {
//			TListPart1.add(i);
//		}
//		
//		TListPart2 = new ArrayList<T>();
//		for(int i = partSize1; i < size; i++) {
//			TListPart2.add(i);
//		}
		
		System.out.println("TListPart1.size() : " + TListPart1.size());
		System.out.println("TListPart2.size() : " + TListPart2.size());
	}
}
