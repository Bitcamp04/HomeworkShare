package homework._2024_05_02.advanced;

import java.util.Arrays;

public class ArrayUtility2 {
    public static void main(String[] args) {
        int[] intArray1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] intArray2={1,2,3,4,5};

        int[] concatArray=concat(intArray1,intArray2);
        int[] removeArray=remove(intArray1,intArray2);

        for (int j : concatArray) {
            System.out.print(j+" ");
        }
        System.out.println();
        for (int j : removeArray) {
            System.out.print(j+" ");
        }
    }


    static int[] concat(int[] s1, int[] s2){
        int[] result = new int[s1.length + s2.length];
        System.arraycopy(s1, 0, result, 0, s1.length);
        System.arraycopy(s2, 0, result, s1.length, s2.length);
        return result;
    }	// s1과 s2를 연결한 새로운 배열 리턴
    static int[] remove(int[] s1, int[] s2){
        int[] result=new int[s1.length];
        int index=0;
        for (int i=0;i<s1.length;i++){
            boolean found=false;
            for(int j=0;j<s2.length;j++){
                if(s1[i]==s2[j]){
                    found=true;
                    break;
                }
            }
            if(!found){
                result[index++]=s1[i];
            }
        }
        int[] returnArray=new int[index];
        System.arraycopy(result, 0, returnArray, 0, index);
        return returnArray;
    }	// s1에서 s2배열의 숫자를 모두 삭제한 새로운 배열 리턴
}
