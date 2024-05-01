package homework._2024_04_30;

import java.util.Arrays;

public class Middle {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(one(new int[]{1, 2, 3, 4, 5, 6, 7, 8})));
        System.out.println(two(new char[]{'y', 'B', 'c', 'D','z','A'}));
    }
    public static int[] one(int[] input){
        int[] ints = new int[input.length];
        for(int i = 0; i < input.length; i++){
            ints[ints.length - 1 - i] = input[i];
        }
        return ints;
    }
    public static char[] two(char[] input){
        char[] output=new char[input.length];
        int i=0;
        for(char c:input){
            if(c>='A' && c<='Z'){
                output[i++]= (char) ('a'+Math.abs(((int)c+32-1-'a')%26));
            }
            else if(c>='a' && c<='z'){
                output[i++]= (char) ('A'+(((int)c-32+1-'A')%26));
            }
            else{
                i++;
                continue;
            }
        }
        return output;
    }

}
