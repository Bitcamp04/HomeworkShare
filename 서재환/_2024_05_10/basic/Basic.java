package homework._2024_05_10.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String,Integer> map1=new HashMap<>();
        String input=sc.nextLine();

        map1.put(input,(int) input.charAt(0));


        Map<String,String> map2=new HashMap<>();
        map2.put("º≠¿Á»Ø","010-1234-1234");
        map2.put("aasd","010-1234-1222");
    }
    public static String serach(String input,Map<String,String> map){
        return map.get(input);
    }
}
