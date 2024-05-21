package homework._2024_05_10.advanced;

import java.util.*;

public class Advanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] chars = input.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if(map.containsKey(chars[i])) {
                map.put(chars[i], map.get(chars[i]) + 1);
            }
            else{
                map.put(chars[i], 1);
            }
        }

        Optional<Map.Entry<Character, Integer>> maxInteger=map.entrySet().stream().max(new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                if(o1.getValue() > o2.getValue()) {
                    return 1;
                }
                else if(o1.getValue() < o2.getValue()) {
                    return -1;
                }
                return 0;
            }
        });

        System.out.println(maxInteger.get().getKey());
        System.out.println(maxInteger.get().getValue());


    }
}
