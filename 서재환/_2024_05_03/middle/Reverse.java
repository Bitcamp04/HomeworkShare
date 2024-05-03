package homework._2024_05_03.middle;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverseString("asdqwezxc"));
        System.out.println(removeDistinctChars("aaabbccab"));
        System.out.println(replace3and5("aaaaaaaaaaa"));
    }
    static String reverseString(String str){
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        for(int i = chars.length - 1; i >= 0; i--)
            sb.append(chars[i]);
        return sb.toString();
    }
    static String removeDistinctChars(String str){
        char[] chars = str.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char c : chars){
            set.add(c);
        }
        return set.toString();
    }
    static String replace3and5(String str){
        char[] chars = str.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(i==0) continue;
            if(i%3==0 && i%5==0){
                chars[i] = '!';
                continue;
            }
            if(i%3==0){
                chars[i]='3';
                continue;
            }
            if(i%5==0){
                chars[i]='5';
                continue;
            }
        }
        return new String(chars);
    }
}
